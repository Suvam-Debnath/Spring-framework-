package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
public class Main {
	public static void main(String[] srgs) {
		
		String resource_file_path = "/in/sp/resources/applicatoinContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);
		
		Student std = (Student)context.getBean("student");
		std.display();
	}

}
