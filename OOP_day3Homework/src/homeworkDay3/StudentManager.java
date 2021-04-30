package homeworkDay3;

public class StudentManager extends UserManager {

		public void addStudent(User user) {
		
		System.out.println(user.getId() + " id ye ait " + user.getFirstName()  + " isimli kisi Student olarak eklendi");
		
	}
		
		@Override
		public void delete(User user) {
			System.out.println("Student Delete");
		}
	
}
