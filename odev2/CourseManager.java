package odevler;

public class CourseManager {
	public void addCourse(Course[] courses) {
		for(Course course:courses) {
			System.out.println(course.getCourseName()+" başarıyla eklendi");
			
		}
		System.out.println();
	}
	public void deleteCourse(Course course) {
		System.out.println(course.getCourseName()+" silindi.");
		System.out.println();
	}
	public void showCourseDetails(Course[] courses) {
		for(Course course:courses) {
			System.out.println("Course name: " + course.getCourseName());	
			System.out.println("Course Instructor: "+course.getCourseInstructor());
			System.out.println("Course details: " +course.getDetails());
			System.out.println();
		}
		
	}
}
