package com.durgasoft.beans;

public class WelcomeBean {
	private String wish_message;
	private String name;
	
	public void init()
	{
		System.out.println("WelcomeBean Initialization");
	}
	
	public void destroy()
	{
		System.out.println("Welcome Destruction");
	}
	
	public String getName() {
		return name;
	}
	public String getWish_message() {
		return wish_message;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWish_message(String wish_message) {
		this.wish_message = wish_message;
	}
	public String sayWelcome()
	{
		return wish_message+" "+name;
	}
}
