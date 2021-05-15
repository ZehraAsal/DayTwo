package workTwo;

public class Instructor  extends User{
	private String email;

	public Instructor(int id, String name, String email) {
		super(id, name);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}
