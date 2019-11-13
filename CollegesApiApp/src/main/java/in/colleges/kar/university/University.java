package in.colleges.kar.university;

public class University {
	
	private String code;
	private String name;
	private String description;
	private int noOfColleges;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNoOfColleges() {
		return noOfColleges;
	}
	public void setNoOfColleges(int noOfColleges) {
		this.noOfColleges = noOfColleges;
	}
	public University(String code, String name, String description, int noOfColleges) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.noOfColleges = noOfColleges;
	}
	
	public University() {
	}
	
	
	
	

}
