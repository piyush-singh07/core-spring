package com.dip.classes;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationFile {

	@Bean(name = "student")
	public Student getstudent() {
		Student student = new Student();
		student.setRollno("11");
		student.setName("Rohan");
		student.setAddress(getAddress());
		return student;
	}

	@Bean
	public Address getAddress() {
		Address addr = new Address();
		addr.setHno("123");
		addr.setStreet("wall street");
		addr.setCity("India");
		return addr;
	}

	@Bean
	public BeanPostProcessor beanPostProcessor()
	{
		return new BeanPostProcessorImpl();
	}
}
