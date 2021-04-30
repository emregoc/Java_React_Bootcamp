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
	
	public void delete(User user) { // InstructorManager ve StudentManager'da override yaptigimiz icin bu delete komutu
									// ilk basta calisir fakat sonra @Override yaptigimiz diger delete methodlari calisir
		System.out.println(user.getId() + " id ye ait " + user.getFirstName()  + " isimli kisi silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getId() + " id ye ait " + user.getFirstName()  + " isimli kisi guncellendi");
	}
	
	
}
