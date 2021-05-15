package workTwo;

public class UserManager  {
	
	public void add(User user) {
		System.out.println(user.getName() + " eğitime başarıyla kaydedildi.");
		
	}
	
	
	public void addMultiple(User[] users){
        for (User user : users){
            add(user);

        }

    }

}