package com.utc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("zoo")
public class Zoo {

	private String name;

	private Animal animal;

	@Autowired
	public Zoo(String name,@Qualifier("dog") Animal animal) {
		super();
		this.name = name;
		this.animal = animal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
