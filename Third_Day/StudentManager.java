package Third_Day;

public class StudentManager extends UserManager{
    public void addCommnent(Student student){
        System.out.println(student.fullName+"kullanýcý"+ student.getComment()+ "yorumu ekledi");
    }
    public void GetCourses(Student student) {
    	for (int i=0;i<student.getCourse().length;i++) {
			System.out.println("Kurs " + (i+1) + " = " + student.getCourse()[i]);
		}
    }
}
