package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfigFile;
import in.sp.beans.Student;
import in.sp.mappers.*;

public class App 
{
    public static void main( String[] args )
    {
    	int rollno = 102;
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
        //-------------SELECT OPERATION-----------------------------------
        String select_sql_query = "SELECT * FROM student" ;
        List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());
       for(Student std:std_list)
       {
    	   System.out.println("Rollno : "+std.getRollno());
    	   System.out.println("Name : "+std.getName());
    	   System.out.println("Marks : "+std.getMarks());
    	   System.out.println("-----------------------------");
       }
    }
}
