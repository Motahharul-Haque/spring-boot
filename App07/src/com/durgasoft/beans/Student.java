package com.durgasoft.beans;

public class Student {
	private String name;
	private String rollno;
	private String email;
	private String mobno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	
	public void studentDetails()
	{
		System.out.println("Student Details");
		System.out.println("-------------------------");
		System.out.println("Student Name       :"+name);
		System.out.println("Student RollNo     :"+rollno);
		System.out.println("Student Email-Id   :"+email);
		System.out.println("Student Mobile-No  :"+mobno);
	}
}
