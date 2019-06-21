package daos;

public class Admin extends Users {

	//Variables//
	private int admin_id ;
	private role role ;
	
	//Constructors//
	public Admin () {}
	public Admin(int admin_id, daos.Users.role role) {
		super();
		this.admin_id = admin_id;
		this.role = role.admin;
	}


	//Getters-Setters//
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public role getRole() {
		return role;
	}
	public void setRole(role role) {
		this.role = role;
	}
	


}
