package com.utc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.utc.beans.Hello;

@Configuration
public class BeanConfiguration3 {
	
	@Bean(name="helloBean")
	@Scope(value = "prototype")
	public Hello getHello() {
		System.out.println("Hello Bean Created from Configuration File 3");
		return new Hello();
	}

}
