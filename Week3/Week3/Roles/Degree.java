package Week3.Roles;

public class Degree extends Qualification {

	private int level;
	private String subject;
	private String graduation_year;

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getGraduation_year() {
		return this.graduation_year;
	}

	public void setGraduation_year(String graduation_year) {
		this.graduation_year = graduation_year;
	}

}