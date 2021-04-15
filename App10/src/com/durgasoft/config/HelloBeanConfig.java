package com.durgasoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.durgasoft.beans.HelloBean;
import com.durgasoft.beans.Welcome;

@Configuration
public class HelloBeanConfig {
	static
	{
		System.out.println("HelloBeanConfig class Bean is Loading....");
	}
	
	public HelloBeanConfig()
	{
		System.out.println("HelloBeanConfig class Bean is Created....");
	}
	@Bean
	public HelloBean helloBean() {
		return new HelloBean();
	}

	@Bean
	public Welcome welcome() {
		 Welcome welcome=new Welcome();
		 welcome.setName("Motahhar");
		 return welcome;
	}
}
