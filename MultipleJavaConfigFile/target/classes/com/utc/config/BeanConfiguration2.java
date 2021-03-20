package com.utc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.utc.beans.Address;

@Configuration
public class BeanConfiguration2 {

	@Bean(name = "addrBean")
	@Scope(value = "prototype")
	public Address getAddressBean() {
		Address address = new Address();
		address.setHno("132");
		address.setStreet("Barclays");
		address.setCity("Indiana");
		System.out.println("Address Bean Created from Configuration File 2");
		return address;
	}

}
