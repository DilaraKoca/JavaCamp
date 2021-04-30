package Third_Day;

public class Instructor {
	String[] courses;
	String[] homework;
	String[] students;
	public Instructor() {	
	}
	public Instructor(String fullName,String mail,String[]courses,String[]homework,String[]students) {
		super();
		this.courses = courses;
		this.homework =homework;
		this.students = students;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String[] getHomework() {
		return homework;
	}
	public void setHomework(String[] homework) {
		this.homework = homework;
	}
	public String[] getStudents() {
		return students;
	}
	public void setStudents(String[] students) {
		this.students = students;
	}
}