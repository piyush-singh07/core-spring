package com.demo.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("advJava")
@Primary
public class AdvJava implements Course {

	private String cid;
	private String cname;

	@Required
	@Value("${course.adv.cid}")
	public void setCid(String cid) {
		this.cid = cid;
	}

	@Required
	@Value("${course.adv.cname}")
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
