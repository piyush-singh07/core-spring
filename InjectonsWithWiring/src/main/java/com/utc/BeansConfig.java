package com.utc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BeansConfig {
	
	@Bean
	public String getName()
	{
		return "American Zoo";
	}

}
