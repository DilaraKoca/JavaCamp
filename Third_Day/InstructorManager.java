package Third_Day;

public class InstructorManager extends UserManager{
	
	public void addCourse(String course) {
		System.out.println("Kurs başarıyla eklendi");
	}
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.getHomework() + " Ödev başarıyla eklendi");
	}
	public void getAllCourses(Instructor instructor) {
		for (int i=0;i<instructor.getCourses().length;i++) {
			System.out.println("Kurs " + (i+1) + " = " + instructor.getCourses()[i]);
		}
	}
	public void getAllStudents(Instructor instructor) {
		for (int i=0;i<instructor.getStudents().length;i++) {
			System.out.println("Öðrenci " + (i+1) + " = " + instructor.getStudents()[i]);
		}
	}
	
}
