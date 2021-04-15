package com.durgasoft.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean,DisposableBean{
	private String name;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public String getName() {
		return name;
	}
	public void setMessage(String message) {
		System.out.println("Intializing 'messggae' through setMessage() method");
		this.message = message;
	}
	public void setName(String name) {
		System.out.println("Intializing 'name' through setName() method");
		this.name = name;
	}
	
	public void customInit()
	{
		System.out.println("Intializing 'name and 'messggae' through customeInit() method");
		name="BBB";
		message="Good Morning";
	}

	public void customDestroy()
	{
		System.out.println("Destoying Beans through customeDestroy() method");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destoying Beans through Disposable destroy() method");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Intializing 'name and 'messggae' through afterPropertiesSet() method");
		name="CCC";
		message="Good Good Afternoon";
	}
	@PostConstruct
	public void postConstructInit()
	{
		System.out.println("Intializing 'name and 'messggae' through @PostConstruct() method");
		name="DDD";
		message="Good Night";
	}
	@PreDestroy
	public void preDestroyMethod()
	{
		System.out.println("Destoying Beans through preDestroyMethod() method");
	}
	
	public String sayHello()
	{
		return "Hello "+name+", "+message;
	}
	
}
