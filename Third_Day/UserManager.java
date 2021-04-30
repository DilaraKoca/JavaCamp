package Third_Day;

public class UserManager {
	public void logIn(User user) {
		System.out.println(user.getFullName()+" baþarýyla giriþ yaptýnýz.");
	}
	public void logOut(User user) {
		System.out.println(user.getFullName()+" çýkýþ yaptýnýz.");
	}

}
