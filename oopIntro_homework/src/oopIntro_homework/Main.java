package oopIntro_homework;

public class Main {

	public static void main(String[] args) {
		
		// Courses class'i icin main islemleri
		
		Courses courses1 = new Courses(1, 0, 0.0,
				"Yazilim Gelistirici Yetistirme Kampi(Java + React)",
				"Engin Demirog",
				"Java + React",
				"2 Ay sürecek Yazilim Gelistirici gelistirme kampin duyurulari buradan olacak",
				"Java Kurs Image");
	
	
		Courses courses2 = new Courses(2, 0, 0.0,
				"Yazilim Gelistirici Yetistirme Kampi(C# + Angular)",
				"Engin Demirog",
				"C# + Angular",
				"2 Ay sürecek Yazilim Gelistirici gelistirme kampin duyurulari buradan olacak",
				"C# Kurs Image");
	
		
		Courses courses3 = new Courses(3, 0, 0.0,
				"Programlamaya Giris Icin Temel Kurs",
				"Engin Demirog",
				"Python Java C#",
				"Python Java C# gibi dillerde temel programlama mantigini ogreneceksiniz.",
				"Python Java C# Kurs Image");
		
		Courses[] courses = {courses1, courses2, courses3};
		
		for(Courses course : courses)
		{
			System.out.println(course.id);
			System.out.println(course.progressPercentage);
			System.out.println(course.price);
			System.out.println(course.courseName);
			System.out.println(course.courseTeacher);
			System.out.println(course.useTechnologies);
			System.out.println(course.courseDetail);
			System.out.println(course.courseImages);
		}
		
		System.out.println("-------------------------------------------------");
		
		// Banner class'i icin main islemleri
		
		Banner banners1 = new Banner(1, "Home Page", "https://www.kodlama.io/");
		
		Banner banners2 = new Banner(2, "Kurslarim", "https://www.kodlama.io/courses/enrolled");
		
		Banner banners3 = new Banner(3, "Tum Kurslar", "https://www.kodlama.io/courses");
		
		Banner banners4 = new Banner(4, "Kampa Hazirlik", "https://www.kodlama.io/p/kampa-hazirlik");
		
		Banner banners5 = new Banner(5, "sss", "https://www.kodlama.io/p/sorular");
		
		Banner banners6 = new Banner(6, "Profile", "https://www.kodlama.io/current_user/profile");
		
		Banner[] banners = {banners1, banners2, banners3, banners4, banners5, banners6};
		
		for(Banner banner : banners)
		{
			System.out.println(banner.id);
			System.out.println(banner.bannerName);
			System.out.println(banner.bannerUrl);
		}
		
		CoursesManager coursesmanager = new CoursesManager();
		
		coursesmanager.addCourse(courses1);
		coursesmanager.deleteCourse(courses2);
		coursesmanager.updateCourse(courses3);
		
		
	}
	

}
