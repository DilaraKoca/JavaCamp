package odevler;

public class Course {
	String courseName;
	String courseInstructor;
	String details;
	public Course() {
		
	}
	public Course(String courseName,String courseInstructor,String details) {
		this();
		this.courseName=courseName;
		this.courseInstructor=courseInstructor;
		this.details=details;
		
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseInstructor() {
		return courseInstructor;
	}
	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
