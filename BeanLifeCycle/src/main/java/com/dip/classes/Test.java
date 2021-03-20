package com.dip.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/dip/classes/config.xml");
		HelloBean bean = context.getBean("helloBean", HelloBean.class);
		System.out.println(bean.sayHello());
		context.registerShutdownHook();
	}
}
