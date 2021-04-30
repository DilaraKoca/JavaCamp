package Third_Day;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("Dilara Koca","dk@gmail.com","1245");
		UserManager userManager = new UserManager();
		userManager.logIn(user1);
		System.out.println("*****************************************");

		Student student1 = new Student("Dilara","dk@gmail.com","1245","çok verimli",new String[] { "Java", "C#" });
		StudentManager studentManager = new StudentManager();
		studentManager.GetCourses(student1);
		System.out.println("*****************************************");

		
		Instructor instructor1 = new Instructor("Dilara Koca","dk@gmail.com",
				new String[]{"Java"},new String[]{"odev3"},
				new String[]{"Demir","Doruk","Arda"});
		

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.getAllCourses(instructor1);
		System.out.println("*****************************************");
		instructorManager.getAllStudents(instructor1);
		System.out.println("*****************************************");

		userManager.logOut(user1);
	}

}
