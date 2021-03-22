package com.dip.classes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigurationFile.class);
		context.refresh();
		Student stu = context.getBean("student",Student.class);
		System.out.println(stu);
	}

}
