package odevler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course("C# + ANGULAR","Engin Demiroğ","Free");
		Course course2 = new Course("JAVA + REACT","Engin Demiroğ","Free");
		Course course3 = new Course("Programlamaya Giriş için Temel Kurs","Engin Demiroğ","Free");

		Course[] cources = {course1,course2,course3};
		
		Student student1 = new Student("Dilara Koca","dilarakoca7@gmail.com");
		
		CourseManager courseManager = new CourseManager();
		StudentManager studentManager = new StudentManager();
		
		courseManager.addCourse(cources);
		courseManager.showCourseDetails(cources);
		courseManager.deleteCourse(course2);
		
		
		studentManager.GirisYap(student1);
		studentManager.showStudentDetails(student1);
	}

}
