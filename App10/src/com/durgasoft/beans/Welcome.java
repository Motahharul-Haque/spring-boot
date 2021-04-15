package com.durgasoft.beans;

public class Welcome {
	private String name;
	
	static
	{
		System.out.println("Wlcome class Bean is Loading....");
	}
	
	public Welcome()
	{
		System.out.println("Welcome class Bean is Created....");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String greet()
	{
		return "Hello "+name+" Welcome to the world of Spring Framework";
	}
}
