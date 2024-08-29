package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	int rollno = 103;
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
        //-------------DELETE OPERATION-----------------------------------
        String delete_sql_query = "DELETE FROM student WHERE std_roll=?" ;
        int count = jdbcTemplate.update(delete_sql_query,rollno);
        if(count>0)
        {
        	System.out.println("DELETION SUCCESS");
        }
        else
        {
        	System.out.println("DELETION FAILED");
        }
    }
}
