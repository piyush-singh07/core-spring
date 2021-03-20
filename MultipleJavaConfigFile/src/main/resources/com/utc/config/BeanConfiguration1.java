package com.utc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import com.utc.beans.Student;

@Configuration
@Import(value = { BeanConfiguration2.class, BeanConfiguration3.class })
public class BeanConfiguration1 {

	@Bean(name = "student")
	@Scope(value = "prototype")
	public Student getStudentBean() {
		Student student = new Student();
		student.setSid("S-111");
		student.setSname("Mayank");
		student.setSclass("8th");
		System.out.println("Student Bean Created from Configuration File 1");
		return student;
	}
}
