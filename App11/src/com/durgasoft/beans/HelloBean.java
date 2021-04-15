package com.durgasoft.beans;

public class HelloBean {
	static {
		System.out.println("HelloBean Bean is Loading....");
	}

	public HelloBean() {
		System.out.println("HelloBean Bean is Created....");
	}

	public static HelloBean getInstance() {
		System.out.println("Static Factory Method");
		return new HelloBean();
	}

	public String sayHello() {
		return "Hello User";
	}
}
