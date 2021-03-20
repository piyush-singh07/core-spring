package com.dip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dip.beans.Employee;
import com.dip.beans.HelloBean;
import com.dip.beans.StudentBean;

public class Test {

	public static void main(String[] args) {
		//As the comtext taken is ApplicationContext hence all the bean objects will be created before even calling the getBean method
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dip/config/config.xml");
		HelloBean bean = (HelloBean) context.getBean("helloBean");
		System.out.println(bean.getMessage());
		StudentBean stuBean = (StudentBean) context.getBean("studentBean");
		System.out.println("Student Bean Details :");
		System.out.println("sid is :" + stuBean.getSid());
		System.out.println("sname is :" + stuBean.getSname());
		Employee ebean = (Employee) context.getBean("empBean");
		System.out.println("Employee Bean Details");
		System.out.println("emp id is :" + ebean.getEno());
		System.out.println("emp name is :" + ebean.getSname());
		System.out.println("emp Address is :" + ebean.getAddr());
	}
}
