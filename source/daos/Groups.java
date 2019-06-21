package daos;

public class Groups extends Student {
	
	public class Group_members extends Groups{
		//variables//
		private Student students;
		
		//Constructors//
		public Group_members () {}
		public Group_members(Student students) {
			super();
			this.students = students;
		}
		
		//Getter-Setter//
		public Student getStudents() {
			return students;
		}
		public void setStudents(Student students) {
			this.students = students;
		}
	}
	
		//Variables//
		private int group_id;
		private String name;
		private Group_members group_members;
	
		//Constructors//
		public Groups() {}
		public Groups(int group_id, String name, Group_members group_members) {
			super();
			this.group_id = group_id;
			this.name = name;
			this.group_members = group_members;
		}
		
		//Getters-Setters//
		public int getGroup_id() {
			return group_id;
		}
		public void setGroup_id(int group_id) {
			this.group_id = group_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Group_members getGroup_members() {
			return group_members;
		}
		public void setGroup_members(Group_members group_members) {
			this.group_members = group_members;
		}
		
	
		
}
