package com.utc.beans;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singletonBean")
@Scope(value = "singleton")
public class SingletonBean {
	
//	@Autowired
//	private PrototypeBean prototypeBean;
	
//	@Autowired
//	ApplicationContext context;
	
	@Autowired
	ObjectFactory<PrototypeBean> prototypeBean;
	
	public SingletonBean()
	{
		System.out.println("Singleton Bean Created");
	}
	
	
	public String getGt() {
//		return context.getBean(PrototypeBean.class).getDt();
		//return prototypeBean.getDt();
		return prototypeBean.getObject().getDt();
	}
	
//	@Lookup
//	public PrototypeBean getPrototypeBean()
//	{
//		return null;
//	}

}
