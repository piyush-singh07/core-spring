package com.utc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utc.beans.College;
import com.utc.config.ConfigApp;

public class Test {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.register(ConfigApp.class);
	context.refresh();
	College bean = context.getBean("colBean",College.class);
	bean.getCollegeDetails();
	context.registerShutdownHook();
	context.close();
	}
}
