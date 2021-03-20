package com.utc.beans;

import org.springframework.stereotype.Component;

@Component("scTeacher")
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am Science Tecaher");
	}

	

}
