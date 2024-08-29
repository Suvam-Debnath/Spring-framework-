package in.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key_rollno",104 );
        map.put("key_name", "Pranay");
        map.put("key_marks",87.3f);
        
        String insert_sql = "INSERT INTO student VALUES(:key_rollno,:key_name,:key_marks)";
        
        npJdbcTemplate.update(insert_sql, map);
        
        int count = npJdbcTemplate.update(insert_sql, map) ;
        if(count>0)
        {
        	System.out.println("INSERTION SUCCES");
        }
        else
        {
        	System.out.println("INSERTION FAILURE");
        }
        
    }
}
