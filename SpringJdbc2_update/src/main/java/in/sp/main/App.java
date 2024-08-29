package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	float marks = 74.5f;
    	int rollno = 102;
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
        //-------------UPDATE OPERATION-----------------------------------
        String update_sql_query = "UPDATE student SET std_marks=? WHERE std_roll=?" ;
        int count = jdbcTemplate.update(update_sql_query,marks,rollno);
        if(count>0)
        {
        	System.out.println("UPDATION SUCCESS");
        }
        else
        {
        	System.out.println("UPDATION FAILED");
        }
    }
}
