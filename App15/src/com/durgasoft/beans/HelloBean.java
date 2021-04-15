package com.durgasoft.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean,DisposableBean{
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
	@Override
	public void afterPropertiesSet()throws Exception
	{
		message="welcome to durga software solutions";
		System.out.println("afterPropertiesSet()");
	}
	
	@Override
	public void destroy()throws Exception
	{
		System.out.println("Destroy Bean");
	}
}
