package com.utc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utc.beans.SingletonBean;
import com.utc.config.BeanConfiguration;

public class Test {

	private static AnnotationConfigApplicationContext appcontext;

	public static void main(String[] args) throws InterruptedException {
		appcontext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		SingletonBean singleBean = (SingletonBean) appcontext.getBean("singletonBean");
		System.out.println(singleBean.getGt());
		Thread.sleep(2000);
		SingletonBean singleBean2 = (SingletonBean) appcontext.getBean("singletonBean");
		System.out.println(singleBean2.getGt());
		Thread.sleep(2000);
		SingletonBean singleBean3 = (SingletonBean) appcontext.getBean("singletonBean");
		System.out.println(singleBean3.getGt());
	}

}
