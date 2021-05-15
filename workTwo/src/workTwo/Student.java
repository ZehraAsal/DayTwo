package workTwo;

public class Student extends User{
	 private String pasword;

	public Student(int id, String name, String pasword) {
		super(id, name);
		this.pasword = pasword;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

}
