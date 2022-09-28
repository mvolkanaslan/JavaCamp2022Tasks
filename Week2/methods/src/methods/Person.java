package methods;

public class Person {
	
	public Person(String fname, String lname, String gender) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}
	private String fname;
	private String lname;
	private String gender;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
}
