	package Third_Day;
	
	public class Student extends User{
			String comment;
			String[] course;
		
	public Student(String fullName, String mail, String password,String comment,String[] course) {
		super();
		this.comment=comment;
		this.course = course;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
}
