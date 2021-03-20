package com.dip.classes;

public class HelloBean {

	private String message;

	// 1. HelloBean bean Instantiation Using Constructor
//	public HelloBean()
//	{
//		System.out.println("Instantiation Using Constructor");
//	}

	// 2. HelloBean bean Instantiation using static factory method
//	public static HelloBean getInstance()
//	{
//		System.out.println("Static Instance Factory method executed for creating helloBean");
//		return new HelloBean();
//	}

	// 3. HelloBean bean Instantiation using Instance Factory Method by creating a
	// class HelloBeanFactory

	public String sayHello() {
		return message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Setter Method Executed");
		this.message = message;
	}

//	@Override
//	public void destroy() throws Exception {
//		System.out.println("destroy method executed");
//		
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("afterPropertiesSet method executed");
//		
//	}

//	public void init() {
//		System.out.println("init method executed");
//	}
//	
//	public void destroy() {
//		System.out.println("destroy method executed");
//	}
}
