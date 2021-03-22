package cm.dip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	private String rollno;
	private String name;
	private Address address;

	/**
	 * if we dont provide any bean for autowire then the Context will NOT load
	 * as @Autowire(required=true) by default But if required = false then also context
	 * will NOT load as its a Constructor DI
	 */

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

	//@Autowired(required = false)//will not load as it is a constructor DI
	@Autowired
	public Student(String rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

}
