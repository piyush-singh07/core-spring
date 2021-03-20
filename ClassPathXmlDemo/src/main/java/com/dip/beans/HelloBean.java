package com.dip.beans;

public class HelloBean {
	
	static {
		System.out.println("Hello Bean  Loading");
	}
	
	public HelloBean()
	{
		System.out.println(" Hello Bean Created");
	}
	
	public String getMessage()
	{
		return "HELLO User!!";
	}

}
