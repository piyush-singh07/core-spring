package com.demo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.Student;
import com.demo.config.StudentConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.register(StudentConfig.class);
		context.refresh();
		Student bean= context.getBean("stuBean",Student.class);
		bean.getStudentDetails();
		context.close();

	}

}
