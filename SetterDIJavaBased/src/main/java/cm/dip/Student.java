package cm.dip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	private String rollno;
	private String name;
	private Address address;
	
	public String getRollno() {
		return rollno;
	}
	
	/**
	 * if we dont provide any bean for autowire then the Context will NOT load as @Autowire(required=true) by default 
	 * But if required = false then context will load as its a Setter DI
	 * */
	
	@Autowired
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	@Autowired(required = false)
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

}
