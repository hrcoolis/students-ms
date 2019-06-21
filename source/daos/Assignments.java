package daos;

import java.io.File;
import java.io.IOException;


public class Assignments {

	//variables//
	private int ass_id; 
	private String title;
	private String description;
	private boolean active;
	private float max_grade;	
	private String creation_date;
	private String deadline ; 
	private boolean groups =false;
	private String path;
	private File f = new File (path);
	private String filename;
		
	
	//Constructors//
	public Assignments() {}
	public Assignments(int ass_id, String title, String description, boolean active, float max_grade,
			String creation_date, String deadline, boolean groups, File f , String path) {
		super();
		this.ass_id = ass_id;
		this.title = title;
		this.description = description;
		this.active = active;
		this.max_grade = max_grade;
		this.creation_date = creation_date;
		this.deadline = deadline;
		this.groups = groups;
		
		try {
			this.path = f.getCanonicalPath();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		this.f= new File(path);
	}


	//Getters-Setters//
	public int getAss_id() {
		return ass_id;
	}

	public void setAss_id(int ass_id) {
		this.ass_id = ass_id;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public float getMax_grade() {
		return max_grade;
	}

	public void setMax_grade(float max_grade) {
		this.max_grade = max_grade;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public boolean isGroups() {
		return groups;
	}

	public void setGroups(boolean groups) {
		this.groups = groups;
	}

/*	public File getF() {
		return f;
	}
*/
	public void setF(File f) {
		this.f = f;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public  File getF (File f , String path ) {
		
	try {
		path = f.getCanonicalPath();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
		if (f.exists()) {
			System.out.println(f.getName() + " exists");
			System.out.println("The file is " + f.length() + " bytes long");
			//filename = f.getName();
			filename = this.getFilename();
			if (f.canRead())
				System.out.println(" ok to read");
			else
				System.out.println(" not ok to read");
			if (f.canWrite())
				System.out.println(" ok to write");
			else
				System.out.println(" not ok to write");
			System.out.println("path: " +f.getAbsolutePath());
			System.out.println("File Name: "+ f.getName());
			System.out.println("File Size: "+ f.length() + " bytes");
		} else
			System.out.println("File does not exist");
		
		try {
			return f.getCanonicalFile();
		} catch (IOException e) {		
			e.printStackTrace();
		}
		return f;
	}

	 
}
