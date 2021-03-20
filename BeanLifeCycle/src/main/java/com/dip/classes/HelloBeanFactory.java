package com.dip.classes;

public class HelloBeanFactory {
	
	public HelloBean getBeanInstance()
	{
		System.out.println("Instance Factory method executed for instantiation of HelloBean bean");
		return new HelloBean();
	}

}
