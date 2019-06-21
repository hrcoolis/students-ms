package daos;

public class Assignments_Submissions extends Assignments{

	/*
	 
	 CREATE TABLE assignment_submissions (
	id serial primary key,
	assignment_id int REFERENCES assignments(id) on delete cascade,
	student_id int REFERENCES students(id) on delete cascade,
	group_id int REFERENCES groups(id) on delete cascade,
	comment VARCHAR(400),
	submission_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	grade NUMERIC(5, 2),
	grade_comment VARCHAR(400),
	grade_submission_date TIMESTAMP,
	file bytea_10mb,
	filename varchar(50)
);
	 */
	
	//Variables//
	private int ass_sub_id;
	private Student student ;
	
	
	
	


	//Constructors//
	public Assignments_Submissions() {}
	public Assignments_Submissions(int ass_sub_id, Student student) {
		super();
		this.ass_sub_id = ass_sub_id;
		this.student = student;
	}




	//Getters-Setters//

	public int getAss_sub_id() {
		return ass_sub_id;
	}

	public void setAss_sub_id(int ass_sub_id) {
		this.ass_sub_id = ass_sub_id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
