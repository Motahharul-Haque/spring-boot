package com.durgasoft.beans;

public class HelloBean {
	static
	{
		System.out.println("HelloBean Bean is Loading....");
	}
	
	public HelloBean()
	{
		System.out.println("HelloBean Bean is Created....");
	}
	
	public String sayHello()
	{
		return "Hello User";
	}
}
