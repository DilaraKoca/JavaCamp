package odevler;

public class StudentManager {
	public void GirisYap(Student student) {
		System.out.println(student.getFullName()+" giri� ba�ar�yla yap�ld�.");
	}
	public void delete(Student student) {
		System.out.println();
		System.out.println(student.getFullName()+"hesab� silindi.");
	}
	public void showStudentDetails(Student student) {
		System.out.println("Full name: " + student.getFullName());
		System.out.println("Mail adresi: " + student.getMail()); 
		System.out.println();
	}
}
