package homeworkDay3;

public class Main {

	public static void main(String[] args) {

		Student students = new Student();
		students.setId(1); // bu ve setLessona kadar olan lisim extend edilen User classindan alinan degerler
		students.setNationalIdentity("11111");
		students.setFirstName("Emre");
		students.setLastName("Goc");
		students.setEmail("emregoc12asd@gmail.com");
		students.setAddress("Emre'nin adresi");
		students.setContact("Emre Contact");
		students.setBirthDate("Emre'nin Dogum Tarihi");
		students.setLesson("Emre'nin aldigi ders");
		students.setStudentNumber("Emre'nin okul no su"); // burasi ve bir alti Student class'ina ait veri
		students.setEducationDegree("Emre'nin egitim derecesi"); // burasida Student class'ina ait veri
		
		Instructor instructors = new Instructor();
		instructors.setId(1); // bu ve setLessona kadar olan lisim extend edilen User classindan alinan degerler
		instructors.setNationalIdentity("22222");
		instructors.setFirstName("Engin");
		instructors.setLastName("Demirog");
		instructors.setEmail("engindemirog@gmail.com");
		instructors.setAddress("Engin hocanin adresi");
		instructors.setContact("Engin Hoca Contact");
		instructors.setBirthDate("Engin Hocanin Dogum Tarihi");
		instructors.setLesson("Engin hocanin verdigi ders");
		instructors.setInstructorNumber("Engin Hocanin egitmen numarasi");// burasi ve bir alti Student class'ina ait veri
		instructors.setInstructorAbout("Engin Goca Hakkinda Bilgi");// burasida Student class'ina ait veri
		
		User[] users = {students, instructors};
		
		System.out.println("Burasi User Ekleme");
		UserManager usermanager = new UserManager();
		usermanager.addMultiple(users);
		
		System.out.println("-------------------------");
		
		System.out.println("Burasi Student Ekleme, Silme, Guncelleme");
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(students);// burasi StudentManager icerisinde ki method
		studentManager.delete(students);// burasi Usermanager class'ý içinde ki method, StudentManager
										// UserManager'i extend ettigi icin bu methodu kullanabildik
		studentManager.update(students);// ayni sekilde burasida oyle
		
		
		System.out.println("-------------------------");
		
		System.out.println("Burasi Instructor Ekleme, Silme, Guncelleme");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructors); // burasi InstructorManager icerisinde ki method
		instructorManager.delete(instructors); // burasi Usermanager class'ý içinde ki method, InstructorManager
											// UserManager'i extend ettigi icin bu methodu kullanabildik
		
		instructorManager.update(instructors); // ayni sekilde burasida oyle
		
		System.out.println("-------------------------");
		
		usermanager.delete(instructors);

	}

}
