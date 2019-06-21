package daos;

public class User_requests extends Users {

	/*
	 * 
	 CREATE TABLE user_requests (
	id serial primary key,
	username VARCHAR(32) UNIQUE NOT NULL,
	password CHAR(54) NOT NULL,
	first_name varchar(40) not null,
	last_name varchar(40) not null,
	am varchar(20) NULL,
	comment VARCHAR(400),
	date_open TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	date_closed TIMESTAMP NULL
);
	 */
	
	//Variables//
	private int usr_req_id;
	private Student student;
	private String comment;
	private String date_open;
	private String date_closed;
	
	
	//Constructors//
	public User_requests() {}
	public User_requests(int usr_req_id, Student student, String comment, String date_open, String date_closed) {
		super();
		this.usr_req_id = usr_req_id;
		this.student = student;
		this.comment = comment;
		this.date_open = date_open;
		this.date_closed = date_closed;
	}
	
	
	//Getters-Setters//
	public int getUsr_req_id() {
		return usr_req_id;
	}
	public void setUsr_req_id(int usr_req_id) {
		this.usr_req_id = usr_req_id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate_open() {
		return date_open;
	}
	public void setDate_open(String date_open) {
		this.date_open = date_open;
	}
	public String getDate_closed() {
		return date_closed;
	}
	public void setDate_closed(String date_closed) {
		this.date_closed = date_closed;
	}
	
	
	
}
