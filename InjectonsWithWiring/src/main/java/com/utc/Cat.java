package com.utc;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	@Override
	public String task() {
		return "Meow";
	}
	
}
