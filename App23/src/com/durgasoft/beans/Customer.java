package com.durgasoft.beans;

public class Customer {
	private String cid;
	private String cname;
	private String caddr;
	private String cemail;
	private String cmobile;
	
	public Customer()
	{
		System.out.println("Customer Bean Object Created");
	}
	public void init()
	{
		System.out.println("Customer Bean Object Initializing through init()");
	}
	public void destroy()
	{
		System.out.println("Customer Bean Object Destroying through destroy");
	}
	
	public String getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public String getCaddr() {
		return caddr;
	}
	public String getCemail() {
		return cemail;
	}
	public String getCmobile() {
		return cmobile;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}
	
	public void getCustomerDetails()
	{
		System.out.println("Customer Details");
		System.out.println("--------------------------");
		System.out.println("Customer Id      :"+cid);
		System.out.println("Customer Name    :"+cname);
		System.out.println("Customer Address :"+caddr);
		System.out.println("Customer Email   :"+cemail);
		System.out.println("Customer Mobile  :"+cmobile);
	}
}
