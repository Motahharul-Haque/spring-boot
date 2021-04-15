package com.durgasoft.beans;

public class HelloBean {
	
	static {
		System.out.println("Bean Loding");
	}
	public  HelloBean()
	{
		System.out.println("Bean created");
	}
	
	
	public String userDetails()
	{
		return "Hello User";
	}
}
