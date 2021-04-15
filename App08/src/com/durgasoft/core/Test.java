package com.durgasoft.core;

class ThreadScope extends ThreadLocal<String>
{
	@Override
	protected String initialValue()
	{
		return "No Data in this Scope";
	}
}

class A
{
	void m1()
	{
		System.out.println("m1() : Thread1 Scope : "+Thread1.threadscope.get());
		System.out.println("m1() : Thread2 Scope : "+Thread2.threadscope.get());
	}
	
	void m2()
	{
		System.out.println("m2() : Thread2 Scope : "+Thread2.threadscope.get());
		System.out.println("m2() : Thread1 Scope : "+Thread1.threadscope.get());
	}
}

class Thread1 extends Thread
{
	static ThreadScope threadscope=new ThreadScope();
	A a;
	public Thread1(A a) {
		this.a=a;
	}
	
	public void run()
	{
		threadscope.set("AAA");
		a.m1();
	}
}

class Thread2 extends Thread
{
	static ThreadScope threadscope=new ThreadScope();
	A a;
	public Thread2(A a) {
		this.a=a;
	}
	
	public void run()
	{
		threadscope.set("BBB");
		a.m2();
	}
}
public class Test {

	public static void main(String[] args) {
		A a=new A();
		Thread1 t1=new Thread1(a);
		Thread2 t2=new Thread2(a);
		
		t1.start();
		t2.start();
	}

}
