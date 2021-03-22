package cm.dip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {

//	@Bean
//	public Address getAddressBean() {
//		Address addr = new Address();
//		addr.setHno("123");
//		addr.setStreet("wall street");
//		addr.setCity("India");
//		return addr;
//	}

	@Bean(name = "name")
	public String getName() {
		return "Jay Bhati";
	}

	@Bean(name = "rollno")
	public String getRollNo() {
		return "S-111";
	}

}
