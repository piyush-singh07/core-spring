package com.dip.classes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object object, String arg1) throws BeansException {
		Student bean= (Student)object;
		bean.setName("Jay");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object object, String arg1) throws BeansException {
		System.out.println("postProcessBeforeInitialization executing");
		Student bean= (Student)object;
		bean.setRollno("11");
		return bean;
	}

}
