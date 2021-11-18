package com.sound;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sound.config.SpringConfig;
import com.sound.dao.EmployeeDAO;
import com.sound.model.Employee;
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		  
		  
		 EmployeeDAO employeeDAO=context.getBean(EmployeeDAO.class) ;
//	 Employee employee=new Employee();
//		 
//		 employee.setId(1);
//		 employee.setAge(24);
//		 employee.setEmail("ssss@gmail.com");
//		 employee.setName("nithya");
//		 employee.setPassword("1784");
//		 employee.setSalary(4000);
////////////////////////////////////////		  
//		  employeeDAO.update(employee);
//		  System.out.println("updated");
//		  /////////////////////////////////////////////
//		  employeeDAO.delete(4);
//		  System.out.println("deleted");
		  //////////////////////////////////////
//		  Employee emp1=employeeDAO.findByID(1);
//		  System.out.println(emp1);
//		  
//		  Employee emp2=employeeDAO.findByID(2);
//		  System.out.println(emp2);
//		  Employee emp3=employeeDAO.findByID(3);
//		  System.out.println(emp3);
////	////////////////////////////////////////////
		  
		  
		  
		  List<Employee>listOfEmps=employeeDAO.findAll();
		  System.out.println(listOfEmps);
		  
//		JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
//		
//		System.out.println(jdbcTemplate);
//		
//		// getting num of rows present in emp table
//		String sql = "SELECT COUNT(*) FROM emp";
//		int row=jdbcTemplate.queryForObject(sql, Integer.class);
      System.out.println("successfull");
	}

	
}
