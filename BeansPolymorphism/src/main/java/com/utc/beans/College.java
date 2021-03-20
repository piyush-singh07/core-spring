package com.utc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("colBean")
public class College {

	private String collegeName;
	@Autowired
	private Principal principal;
	@Autowired
	//@Qualifier("scTeacher")
	private Teacher teacher;
	
	public void getCollegeDetails() {
		principal.getPrincipalInfo();
		teacher.teach();
		System.out.println("College Name is    :" + collegeName);
	}

	@Required
	@Value("IIT Bombay")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
}
