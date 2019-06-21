package daos;

public class Announcements {

	/*
	 * 
	 CREATE TABLE announcemnts (
	id serial primary key,
	course_id int REFERENCES courses(id),
	title varchar(100) NOT NULL,
	description varchar(400),
	date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
	 * 
	 */
	
	//Variables//	
	private int ann_id;
	private Courses course;
	private String title;
	private String description;
	private String date;
	
	//Constructors//
	public Announcements() {}
	public Announcements(int ann_id, Courses course, String title, String description, String date) {
		super();
		this.ann_id = ann_id;
		this.course = course;
		this.title = title;
		this.description = description;
		this.date = date;
	}
	
	//Getters-Setters//
	public int getAnn_id() {
		return ann_id;
	}
	public void setAnn_id(int ann_id) {
		this.ann_id = ann_id;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

	
}
