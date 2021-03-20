package com.dip.beans;

public class StudentBean {
	
	private String sid;
	private String sname;
	
	static {
		System.out.println("StudentBean Bean  Loading");
	}

	public StudentBean()
	{
		System.out.println("Student Bean Created");
	}
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
