package com.utc.app4demo;

public class StudentBean {
	
	private String sid;
	private String sname;
	
	public StudentBean(String sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
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
	
	public String getStudent()
	{
		return sid+"     "+sname;
	}

}
