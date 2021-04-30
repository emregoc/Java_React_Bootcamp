package homeworkDay3;

public class UserManager {
	public void addUser(User user) { 
		
		System.out.println(user.getId() + " id ye ait " + user.getFirstName()  + " isimli kisi eklendi");
		
	}
	
	public void addMultiple(User[] users) {
		
		for(User user : users) {
			addUser(user);
		}
		
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " id ye ait " + user.getFirstName()  + " isimli kisi silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getId() + " id ye ait " + user.getFirstName()  + " isimli kisi guncellendi");
	}
	
	
}
