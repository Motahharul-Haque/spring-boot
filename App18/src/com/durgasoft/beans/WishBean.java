package com.durgasoft.beans;

public class WishBean {
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
		System.out.println("WishBean");
		name="BBB";
		message="Good Morning";
	}
	public void destroy()
	{
		System.out.println("Wish Destroy");
	}
	public void localInit()
	{
		System.out.println("localInit()");
		name="BBB";
		message="Good to see you";
	}
	public void localDestroy()
	{
		System.out.println("localDestroy()");
	}
	public String sayWish()
	{
		return name+", "+message;
	}
}
