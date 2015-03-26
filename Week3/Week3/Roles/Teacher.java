package Week3.Roles;

import java.util.*;

public class Teacher extends Professional {

	Collection<Module> isTaught;
	Degree isOwned;
	private String subject_area;
	private String School;
	private String position;


	public Teacher(){

	}

	public String getSubject_area() {
		return this.subject_area;
	}

	public void setSubject_area(String subject_area) {
		this.subject_area = subject_area;
	}

	public String getSchool() {
		return this.School;
	}

	public void setSchool(String School) {
		this.School = School;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


}
