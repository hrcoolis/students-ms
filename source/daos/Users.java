package daos;


public class Users {
	
	
	//Variables//
	public enum role {admin , professor , student ;}
	private int user_id ;
	private String username ;
	private String password ;
	private role role ; 
	
	
	
	//Constructors//
	public Users () {}	
	public Users(int user_id, String username, String password, daos.Users.role role) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.role = role;
	}


	//Getters-Setters//
	public role getRole() {
		return role;
	}
	public void setRole(role role) {
		this.role = role;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
		
	
}
