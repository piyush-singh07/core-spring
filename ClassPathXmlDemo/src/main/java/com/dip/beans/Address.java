package com.dip.beans;

public class Address {
	
	private String hno;
	private String street;
	private String city;
	
	static {
		System.out.println("Address Bean  Loading");
	}
	
	public Address()
	{
		System.out.println("Address Bean Created");
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + "]";
	}
	
	

}
