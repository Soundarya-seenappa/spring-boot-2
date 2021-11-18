package com.sound.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sound.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				int id=rs.getInt("emp_id");
		int age=rs.getInt("age");
		double salary=rs.getDouble("salary");
		 String name = rs.getString("name");
		 String email = rs.getString("email");
		 String password = rs.getString("password");
		
		 Employee employee= new Employee();
		 employee.setId(id);
		 employee.setAge(age);
		 employee.setEmail(email);
		 employee.setName(name);
		 employee.setPassword(password);
		 employee.setSalary(salary);
		 return employee;
		
		
	}
	 

}
