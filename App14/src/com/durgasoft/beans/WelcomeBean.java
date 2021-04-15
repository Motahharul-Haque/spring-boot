package com.durgasoft.beans;

public class WelcomeBean {
	private String name;
	private String message;
	public String getMessage() {
		return message;
	}
	public String getName() {
		return name;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void init()
	{
		System.out.println("User Defined init() Method");
		name="Durga";
		message="Good Morning!";
	}
	
	public String sayWelcome()
	{
		return "Hello "+name+", "+message+" \nWelcome to Durga Software Solutions";
	}
	
	public void destroy()
	{
		System.out.println("User Defined destroy() Method");
		name="";
		message="";
	}
}
