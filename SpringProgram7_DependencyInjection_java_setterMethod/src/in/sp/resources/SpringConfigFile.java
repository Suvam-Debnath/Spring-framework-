package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		
		addr.setHouseno(100);
		addr.setCity("Kolkata");
		addr.setPincode(500234);
		
		return addr;
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		
		std.setRollno(45);
		std.setName("SuvamDebnath");
		std.setAddress(createAddrObj());  //injecting dependency by using setter method
		
		return std;
	}
}
