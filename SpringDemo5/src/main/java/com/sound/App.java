package com.sound;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sound.config.SpringConfig;
import com.sound.dao.EmployeeDAO;
import com.sound.model.Employee;
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		  
		  
		 EmployeeDAO employeeDAO=context.getBean(EmployeeDAO.class) ;
		 Employee employee=new Employee();
		 
		 employee.setId(4);
		 employee.setAge(24);
		 employee.setEmail("ssss@gmail.com");
		 employee.setName("nithya");
		 employee.setPassword("1784");
		 employee.setSalary(4000);
		  
		  employeeDAO.add(employee);
		  System.out.println("successfull");
	
//	
//		JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
//		
//		System.out.println(jdbcTemplate);
//		
//		// getting num of rows present in emp table
//		String sql = "SELECT COUNT(*) FROM emp";
//		int row=jdbcTemplate.queryForObject(sql, Integer.class);
//

		
	}

	
}
