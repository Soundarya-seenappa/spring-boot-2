package com.sound.dao;
 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		String insertSQL ="UPDATE emp SET name=?,age=?, salary=?,email=?,password=? WHERE id=?";
		jdbcTemplate.update(insertSQL ,employee.getName(),employee.getAge(),
				employee.getSalary(),employee.getEmail(),employee.getPassword(),employee.getId());

	}
	public void delete(int employeeID) {
		String deleteSQL="DELETE FROM emp WHERE id=?";
		jdbcTemplate.update(deleteSQL,employeeID);
		

	}
	public Employee findByID(int employeeID) {
		String selectSQL="SELECT * FROM emp WHERE id=?";
		Employee emp=jdbcTemplate.queryForObject(selectSQL, new Object[] {employeeID},new EmployeeRowMapper());
		return emp;
	}
	
	public List<Employee> findAll() {
		String selectSQL="SELECT * FROM emp";
		
		List<Employee> empList=jdbcTemplate.query(selectSQL, new BeanPropertyRowMapper<>(Employee.class));
		return empList;
	}

	}
	
	
