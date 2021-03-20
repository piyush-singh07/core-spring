package com.demo.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("coreJava")
public class CoreJava implements Course {
	

	private String cid;
	private String cname;

	@Required
	@Value("${course.core.cid}")
	public void setCid(String cid) {
		this.cid = cid;
	}
	@Required
	@Value("${course.core.cname}")
	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public void getCourseDetails() {
		System.out.println("-----Course Details-----");
		System.out.println("Course Id--"+cid);
		System.out.println("Course Name --"+cname);
		
	}


}
