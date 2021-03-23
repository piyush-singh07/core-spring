
package com.utc;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	@Override
	public String task() {
		return "Barks";
	}

}
