package daos;

public class Courses {
	
	//Variables//
		private int course_id;
		private String code;
		private String title;
		private String description;
		

	//Constructors//	
	public Courses() {}
	public Courses(int course_id, String code, String title, String description) {
		super();
		this.course_id = course_id;
		this.code = code;
		this.title = title;
		this.description = description;
	}
	
	
	//Getters-Setters//
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

	
}
