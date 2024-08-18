package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj() {
		Address addr = new Address(200,"Kolkata",700125);
		return addr;
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student(102,"SuvamDebnath",createAddrObj()); // injecting dependency
		return std;
	}
}
