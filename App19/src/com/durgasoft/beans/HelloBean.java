package com.durgasoft.beans;

public class HelloBean {
	private String wish_message;
	private String name;
	
	public void init()
	{
		System.out.println("HelloBean Initialization");
	}
	
	public void destroy()
	{
		System.out.println("HelloBean Destruction");
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
	public String sayHello()
	{
		return wish_message+" "+name;
	}
}
