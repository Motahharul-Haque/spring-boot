package com.durgasoft.beans;

public class HelloBeanFactory {
	public HelloBean getBeanInstance()
	{
		System.out.println("Instance Factory Method");
		return new HelloBean();
	}
	
}
