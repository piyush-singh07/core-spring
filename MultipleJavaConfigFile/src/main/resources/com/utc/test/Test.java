package com.utc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utc.beans.Address;
import com.utc.beans.Hello;
import com.utc.beans.Student;
import com.utc.config.BeanConfiguration1;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration1.class);
		Student sbean = (Student) context.getBean("student");
		Student sbean1 = (Student) context.getBean("student");
		Student sbean2 = (Student) context.getBean("student");
		System.out.println(sbean);
		System.out.println(sbean1);
		System.out.println(sbean2);
		Address aBean = (Address) context.getBean("addrBean");
		Address aBean1 = (Address) context.getBean("addrBean");
		Address aBean2 = (Address) context.getBean("addrBean");
		System.out.println(aBean);
		System.out.println(aBean1);
		System.out.println(aBean2);
		Hello hello = (Hello) context.getBean("helloBean");
		Hello hello1 = (Hello) context.getBean("helloBean");
		Hello hello2 = (Hello) context.getBean("helloBean");
		System.out.println(hello);
		System.out.println(hello1);
		System.out.println(hello2);
		// getStudentDetails(sbean);
		// getAddressDetails(aBean);
		// getHello(hello);
		context.registerShutdownHook();
	}

	private static void getHello(Hello hello) {
		System.out.println(hello.sayHello());
	}

	private static void getAddressDetails(Address aBean) {
		System.out.println(aBean.getHno());
		System.out.println(aBean.getStreet());
		System.out.println(aBean.getCity());
	}

	private static void getStudentDetails(Student sbean) {
		System.out.println(sbean.getSid());
		System.out.println(sbean.getSname());
		System.out.println(sbean.getSclass());
	}
}
