package com.utc.beans;

import java.time.LocalTime;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypeBean")
@Scope(value = "prototype")
public class PrototypeBean {
	
	public PrototypeBean()
	{
		System.out.println("Prototype Service Bean Created");
	}

	public String getDt()
	{
		return LocalTime.now().toString();
	}
	
}
