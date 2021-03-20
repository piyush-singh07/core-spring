package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.demo.beans")
@PropertySource("classpath:config.properties")
public class StudentConfig {
	
	
	

}
