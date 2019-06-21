package daos;

public class Student extends Users{

	/*
	 * CREATE TABLE students (
	id int unique REFERENCES users(id) on delete cascade,
	first_name varchar(40) not null,
	last_name varchar(40) not null,
	am varchar(20) NULL
);
	 */

	//Variables//
	private int stud_id;
	private String first_name ; 
	private String last_name;
	private String am;
	private role role;
	
	//Constructors//
	public Student () {}
	public Student(int stud_id, String first_name, String last_name, String am, daos.Users.role role) {
		super();
		this.stud_id = stud_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.am = am;
		this.role = role.student;
	}
	
	//Getters-Setters
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am;
	}
	public role getRole() {
		return role;
	}
	public void setRole(role role) {
		this.role = role;
	}
	
	
	
	
	
	
	
	
	
}
