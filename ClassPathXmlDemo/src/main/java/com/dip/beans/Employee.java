package com.dip.beans;

public class Employee {
	
	private String eno;
	private String sname;
	private Address addr;
	
	static {
		System.out.println("Employee Bean  Loading");
	}
	
	public Employee()
	{
		System.out.println("Employee Bean Created");
	}

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	

}
