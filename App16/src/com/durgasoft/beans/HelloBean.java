package com.durgasoft.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloBean {
	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
		System.out.println("setMessage()");
	}
	public String sayHello()
	{
		return message;
	}
	@PostConstruct
	public void initializingBean()
	{
		message="welcome to durga software solutions";
		System.out.println("@PostConstruct");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("@PreDestroy Bean");
	}
}
