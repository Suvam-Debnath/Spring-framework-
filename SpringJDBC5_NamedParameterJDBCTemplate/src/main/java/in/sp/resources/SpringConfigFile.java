package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public DriverManagerDataSource myDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_db");
		dataSource.setUsername("root");
		dataSource.setPassword("Suvam@123");
		
		return dataSource;
	}
	@Bean
	public NamedParameterJdbcTemplate npJdbcTemplate()
	{
		return new NamedParameterJdbcTemplate(myDataSource());
	}
}
