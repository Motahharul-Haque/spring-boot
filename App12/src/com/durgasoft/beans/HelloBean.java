package com.durgasoft.beans;

public class HelloBean {
	private String name;
	static {
		System.out.println("HelloBean Bean is Loading....");
	}

	public HelloBean() {
		System.out.println("HelloBean Bean is Created....");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello "+name+" Welcome to Learning spring";
	}
}
