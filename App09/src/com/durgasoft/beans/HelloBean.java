package com.durgasoft.beans;

public class HelloBean {

	public HelloBean() {
		System.out.println("HelloBean Object is created");
	}
	public String sayHello() {
		return "Hello User from "+Thread.currentThread().getName()+" Scope";
	}

}
