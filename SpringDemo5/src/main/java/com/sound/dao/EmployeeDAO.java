package com.sound.dao;
 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.sound.model.Employee;

@Component
public class EmployeeDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void add(com.sound.model.Employee employee) {
		String insertSQL ="INSERT INTO emp VALUES(?,?,?,?,?,?)";
		jdbcTemplate.update(insertSQL ,employee.getId(),employee.getName(),employee.getAge(),
				employee.getSalary(),employee.getEmail(),employee.getPassword());
}
	public void update(Employee employee) {

	}
	public void delete(int employeeID) {

	}
	public Employee findByID(int employeeID) {
		return null;
	}
	public List<Employee> getAll(){
		return null;
	}

	}
	
	
