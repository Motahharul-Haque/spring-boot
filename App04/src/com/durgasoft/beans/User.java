package com.durgasoft.beans;

public class User {
	private String name;
	private String qualification;
	private int age;
	private String address;
	private String email;
	private String mobile_No;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_No() {
		return mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		this.mobile_No = mobile_No;
	}
	
	public void userDetails()
	{
		System.out.println("User Details");
		System.out.println("------------------");
		System.out.println("User Name: "+name);
		System.out.println("User Qualification "+qualification);
		System.out.println("User Age: "+age);
		System.out.println("User Address: "+address);
		System.out.println("User Email: "+email);
		System.out.println("User Mobile No. : "+mobile_No);
	}
}
