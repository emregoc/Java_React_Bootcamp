package oopIntro_homework;

public class Courses {
	int id;
	int progressPercentage; // kurs ilerleme yuzdesi
	double price; // kurs fiyati
	String courseName;
	String courseTeacher;
	String useTechnologies; // kursta kullanilan teknoloji
	String courseDetail;
	String courseImages;
	public Courses(int id, int progressPercentage, double price, String courseName, // constructor
			String courseTeacher, String useTechnologies,String courseDetail,
			String courseImages) {
		this.id = id;
		this.progressPercentage = progressPercentage;
		this.price = price;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
		this.useTechnologies = useTechnologies;
		this.courseDetail = courseDetail;
		this.courseImages = courseImages;
		
	}
	
}
