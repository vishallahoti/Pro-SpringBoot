package in.colleges.kar.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.colleges.kar.university.University;

@Service
public class UniversityService {
	
	private List<University> universities = new ArrayList<>( Arrays.asList(new University("001","VTU","Visveswaraiah Technological University under Government in Bangalore",50),
			new University("002","Deemed","Deemed Colleges in Bangalore",10),
			new University("003","Private","Private runned Colleges in Bangalore",15)));

	public List<University> getAllUniversities() {
		return universities;
	}

	public University getUniversity(String code) {
		return universities.stream().filter(univ->univ.getCode().contentEquals(code)).findFirst().get();
	}

	public void addUniversity(University university) {
		universities.add(university);
	}

	public void updateUniversity(University university, String code) {
		for (University univ : universities) {
			if(univ.getCode().contentEquals(code)) {
				univ.setCode(university.getCode());
				univ.setDescription(university.getDescription());
				univ.setName(university.getName());
				univ.setNoOfColleges(university.getNoOfColleges());
				return;
			}
		}
		
	}

	public void deleteUniversity(String code) {
		universities.removeIf(univ->univ.getCode().contentEquals(code));
	}

}
