package workTwo;

public class Main {

	public static void main(String[] args) {
		
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor(1,"Engin Demiroğ ","engin@hotmail.com" );
		 
		
		
		StudentManager studentManager = new StudentManager();
		Student user1 = new Student(1,"Zehra Asal", "****");
	    Student user2 = new Student(2,"Umay Kara","****");
	    
	    studentManager.pasword(user1);
	    instructorManager.email(instructor, user2);
	  

		UserManager userManager = new UserManager();
		User[] users = {user1,user2,instructor};
		userManager.addMultiple(users);
		
		
		
	}

}
