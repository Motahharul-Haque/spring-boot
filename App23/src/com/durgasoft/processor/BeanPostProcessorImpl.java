package com.durgasoft.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.durgasoft.beans.Customer;

public class BeanPostProcessorImpl implements BeanPostProcessor{
	@Override
	public Object postProcessAfterInitialization(Object bean, String name)throws BeansException
	{
		System.out.println("postProcessAfterInitialization()");
		Customer cust=(Customer)bean;
		cust.setCmobile("+91-7836809334");
		
		return cust;
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String name)throws BeansException
	{
		System.out.println("postProcessBeforeInitialization()");
		Customer cust=(Customer)bean;
		cust.setCemail("mdmotahharul.haque@gmail.com");
		
		return cust;
	}
	
}
