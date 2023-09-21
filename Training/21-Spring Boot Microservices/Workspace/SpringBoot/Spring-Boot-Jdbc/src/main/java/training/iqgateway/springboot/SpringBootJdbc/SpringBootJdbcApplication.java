package training.iqgateway.springboot.SpringBootJdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplateRef;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String SQLStatement = "SELECT * FROM DEPARTMENTS";
		
		List<DepartmentEO> resultDepts = jdbcTemplateRef.query(SQLStatement, BeanPropertyRowMapper.newInstance(DepartmentEO.class));
		
		for (Iterator iterator = resultDepts.iterator(); iterator.hasNext();) {
			DepartmentEO departmentEO = (DepartmentEO) iterator.next();
			System.out.println(departmentEO);
			
		}
		
	}

}
