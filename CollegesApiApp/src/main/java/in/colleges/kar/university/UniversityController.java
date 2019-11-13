package in.colleges.kar.university;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.colleges.kar.service.UniversityService;

@RestController
public class UniversityController {
	
	@Autowired
	UniversityService universityService;
	
	/* Get All Universities in Karnataka*/
	@RequestMapping("/universities")
	public List<University> getAllUniversities() {
		return universityService.getAllUniversities();
	}
	
	/*API to Get University with a particular code in Karnataka*/
	@RequestMapping("/universities/{code}")
	public University getUniversity(@PathVariable String code) {
		return universityService.getUniversity(code);
	}
	
	/*API to Add University */
	@RequestMapping(method=RequestMethod.POST,value="/universities")
	public void addUniversity(@RequestBody University university) {
		universityService.addUniversity(university);
	}
	
	/*API to Update University*/
	@RequestMapping(method=RequestMethod.PUT,value="/universities/{code}")
	public void updateUniversity(@RequestBody University university,@PathVariable String code) {
		universityService.updateUniversity(university,code);
	}
	
	/*API to Delete University*/
	@RequestMapping(method=RequestMethod.DELETE,value="/universities/{code}")
	public void deleteUniversity(@PathVariable String code) {
		universityService.deleteUniversity(code);
	}
	
}
