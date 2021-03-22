package com.utc.beans;

public class Employee {
	private String eno;
	private String ename;
	private Account eacc;
	private Address eaddr;
//	public String getEno() {
//		return eno;
//	}
//	public void setEno(String eno) {
//		this.eno = eno;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public Account getEacc() {
//		return eacc;
//	}
//	public void setEacc(Account eacc) {
//		this.eacc = eacc;
//	}
//	public Address getEaddr() {
//		return eaddr;
//	}
//	public void setEaddr(Address eaddr) {
//		this.eaddr = eaddr;
//	}
	
	public Employee(String eno,String ename, Account eacc,Address eaddr) {
		this.eno=eno;
		this.ename=ename;
		this.eacc=eacc;
		this.eaddr=eaddr;
	}
	
	public void getDetails() {
		System.out.println("emp details------------");
		System.out.println("eno   :"+eno );
		System.out.println("ename :"+ename );
		System.out.println("emp account details------------");
		System.out.println("accno   :"+eacc.getAcc_no() );
		System.out.println("acc type :"+eacc.getAcc_type());
		System.out.println("emp address details------------");
		System.out.println("hno   :"+eaddr.getHno() );
		System.out.println("street :"+eaddr.getStreet() );
		System.out.println("city :"+eaddr.getCity() );
		
		
	}
	
	

}
