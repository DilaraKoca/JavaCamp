package odevler;

public class Student {
	String fullName;
	String Mail;
	public Student() {
		
	}
	public Student(String fullName,String Mail) {
		super();
		this.fullName=fullName;
		this.Mail=Mail;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
}
