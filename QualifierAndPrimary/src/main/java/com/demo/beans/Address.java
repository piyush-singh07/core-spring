package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("${address.hno}")
	private String hno;
	@Value("${address.street}")
	private String street;
	@Value("${address.city}")
	private String city;
	
	public void getAddressDetails()
	{
		System.out.println("-----Address Details-----");
		System.out.println("House No--"+hno);
		System.out.println("Street --"+street);
		System.out.println("City --"+city);
	}
	
	

}
