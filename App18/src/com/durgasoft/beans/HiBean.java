package com.durgasoft.beans;

public class HiBean {
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
		System.out.println("HiBean");
		name="CCC";
		message="have a nice day";
	}
	public void destroy()
	{
		System.out.println("Hi Destroy");
	}
	public String sayHi()
	{
		return "Hi "+name+", "+message;
	}
}
