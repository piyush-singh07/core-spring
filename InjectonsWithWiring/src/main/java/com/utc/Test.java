package com.utc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeansConfig.class);
		context.refresh();
		Zoo stu = context.getBean("zoo",Zoo.class);
		System.out.println(stu.getName());
		System.out.println(stu.getAnimal().task());
	}

}
