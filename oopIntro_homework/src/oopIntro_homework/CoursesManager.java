package oopIntro_homework;

public class CoursesManager {
	
	public void addCourse(Courses course) {
		System.out.println(course.id + " id ye ait " + course.courseName + ": Kurs Eklendi");
	}
	
	public void deleteCourse(Courses course) {
		System.out.println(course.id + " id ye ait " + course.courseName + ": Kurs Silindi" );
	}
	
	public void updateCourse(Courses course) {
		System.out.println(course.id + " id ye ait " + course.courseName + ": Kurs Guncellendi");
	}
}
