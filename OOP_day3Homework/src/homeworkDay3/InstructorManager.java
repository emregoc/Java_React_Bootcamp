package homeworkDay3;

public class InstructorManager extends UserManager {

	public void addInstructor(User user) {
		
		System.out.println(user.getId() + " id ye ait " + user.getFirstName()  + " isimli kisi Instructor olarak eklendi");
		
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Instructor Delete");
	}
	
}
