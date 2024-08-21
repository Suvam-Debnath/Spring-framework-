package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj1() 
	{
		Address addr = new Address();
	
		addr.setHouseno(100);
		addr.setCity("Barasat");
		addr.setPincode(700128);
	
		return addr;
	}
	@Bean
	public Address createAddrObj2() 
	{
		Address addr = new Address();
	
		addr.setHouseno(200);
		addr.setCity("Kolkata");
		addr.setPincode(100325);
	
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
	@Bean
	public Subjects createSubjObj() {
		Subjects subj = new Subjects();
		
		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("Java");
		subjects_list.add("Python");
		subjects_list.add("C++");
		
		subj.setSubjects(subjects_list);
		
		return subj;
	}
	
}
