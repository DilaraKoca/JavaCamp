package Third_Day;

public class User {
	String fullName;
	String mail;
	String password;
	public User() {		
	}
	public User( String fullName, String mail, String password) {
		super();
		this.fullName = fullName;
		this.mail = mail;
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
