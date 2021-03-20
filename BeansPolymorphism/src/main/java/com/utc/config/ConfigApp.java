package com.utc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "com.utc.beans")
public class ConfigApp {

/*	@Bean 
	public Principal getPrincipal()
	{
		return new Principal();
	}
	
	@Bean
	public Teacher mathTeacher()
	{
		return new MathTeacher();
	}
	
	@Bean(name="colBean") 
	public College getCollege()
	{
		College college = new College();
		college.setPrincipal(getPrincipal());
		college.setTeacher(mathTeacher());
		return college;
	}*/
	
	
}
