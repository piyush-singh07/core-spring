package com.utc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utc.beans.Employee;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/utc/config/configuration.xml");
		Employee bean= ctx.getBean("emp",Employee.class);
		bean.getDetails();
	}
}
