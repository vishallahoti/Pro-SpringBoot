package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {
	
	public List<Course> findByName(String name);
	
	public List<Course> findByTopicId(String topicId);
	
	//Maps Description to courses table any field found. maps that to desc_name ,creates a list and then return it.
	public List<Course> findByDescription(String desc_name);

}
