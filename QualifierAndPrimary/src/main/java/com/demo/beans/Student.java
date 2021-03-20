package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stuBean")
public class Student {
	
	private String sid;
	private String sname;
	
	@Autowired
	@Qualifier("coreJava")
	private Course scourse;
	
	@Autowired
	private Address saddress;
	
	@Value("${student.id}")
	public void setSid(String sid) {
		this.sid = sid;
	}
	@Value("${student.name}")
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	public void getStudentDetails()
	{
		System.out.println("---Student Details----");
		System.out.println("Student Id   :"+sid);
		System.out.println("Student Name   :"+sname);
		scourse.getCourseDetails();
		saddress.getAddressDetails();
	}
	
	
	
	

}
