package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj() 
	{
		Address addr = new Address();
	
		addr.setHouseno(100);
		addr.setCity("Barasat");
		addr.setPincode(700128);
	
		return addr;
	}
	@Bean
	public Student CreateStdObj() {
		Student std = new Student();
		
		std.setName("SuvamDebnath");
		std.setRollno(74);
		// do not have to inject manually
		return std;
	}
	
}
