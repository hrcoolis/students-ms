package daos;


public class Professor extends Users {

	
	//Variables//
	private int prof_id;
	private String first_name ;
	private String last_name ;
	private role role ;
	
	//Constructors//   
	public Professor () {}
	public Professor(int prof_id, String first_name, String last_name, daos.Users.role role) {
		super();
		this.prof_id = prof_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.role = role.professor;
	}


	
	//Getters-Setters//
	public role getRole() {
		return role;
	}

	public void setRole(role role) {
		this.role = role;
	}
	
	public int getProf_id() {
		return prof_id;
	}
	
	public void setProf_id(int prof_id) {
		this.prof_id = prof_id;
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
	

}
