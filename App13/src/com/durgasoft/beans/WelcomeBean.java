package com.durgasoft.beans;

public class WelcomeBean {
	public void init()
	{
		System.out.println("User Defined init() Method");
	}
	
	public String sayWelcome()
	{
		return "Welcome to Durga Software Solutions";
	}
	
	public void destroy()
	{
		System.out.println("User Defined destroy() Method");
	}
}
