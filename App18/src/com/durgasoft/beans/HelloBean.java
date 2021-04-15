package com.durgasoft.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean {
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
		System.out.println("HelloBean");
		name="AAA";
		message="Have a good day";
	}
	public void destroy()
	{
		System.out.println("Hello Destroy");
	}
	
	public String sayHello()
	{
		return "Hello "+name+", "+message;
	}
	
}
