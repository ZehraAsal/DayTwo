package workTwo;

public class UserManager  {
	
	public void add(User user) {
		System.out.println(user.getName() + " e�itime ba�ar�yla kaydedildi.");
		
	}
	
	
	public void addMultiple(User[] users){
        for (User user : users){
            add(user);

        }

    }

}