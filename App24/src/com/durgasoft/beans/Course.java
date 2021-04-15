package com.durgasoft.beans;

public class Course {
	private String cid;
	private String cname;
	private String ccost;

	public Course()
	{
		System.out.println("0-arg constructor");
	}
	
	public Course(String cid, String cname, String ccost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccost = ccost;
	}


	public void getCourseDetails()
	{
		System.out.println("Course Details");
		System.out.println("--------------------------");
		System.out.println("Course Id      :"+cid);
		System.out.println("Course Name    :"+cname);
		System.out.println("Course Cost    :"+ccost);
	}
}
