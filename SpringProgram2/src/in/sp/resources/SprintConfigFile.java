package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SprintConfigFile {
	
	@Bean("stdObj1")
	public Student createStdBeanObj1() {
		Student std = new Student();
		std.setName("SuvamDebnath");
		std.setRollno(103);
		std.setEmail("suvamdebnath@gmail.com");
		return std;
	}
	@Bean("stdObj2")
	public Student createStdBeanObj2() {
		Student std = new Student();
		std.setName("Sudeshna");
		std.setRollno(104);
		std.setEmail("sudeshna@gmail.com");
		return std;
	}
}
