package com.utc.app4demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/utc/app4demo/config.xml");
		StudentBean sbean= (StudentBean) ctx.getBean("sbean");
		System.out.println(sbean.getStudent());
	}
}
