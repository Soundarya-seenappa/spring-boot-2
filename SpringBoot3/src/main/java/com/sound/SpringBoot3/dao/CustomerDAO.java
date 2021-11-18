package com.sound.SpringBoot3.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.sound.SpringBoot3.model.Customer;
@Repository
public class CustomerDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String TABLE_NAME="customer";

	public void add(Customer customer) {
		String insertSQL =" INSERT INTO " + TABLE_NAME +"  (name,email,password) VALUES(?,?,?)";

		
		jdbcTemplate.update(insertSQL,customer.getName(),customer.getEmail(),customer.getPassword());
	}
	public void update(Customer customer) {

		String updateSQL = " UPDATE " + TABLE_NAME + " SET name=?, email=?, password=? WHERE id=?";

		jdbcTemplate.update(updateSQL, customer.getName(), customer.getEmail(), customer.getPassword(),
				customer.getId());

	}
	public void delete(long customerID) {
		String deleteSQL=" DELETE FROM " + TABLE_NAME +" WHERE id=?";
		jdbcTemplate.update(deleteSQL,customerID);
		
	}
	public Customer findById(long customerID) {
		String selectSQL=" SELECT * FROM " + TABLE_NAME +" WHERE id=?";
		Customer emp=jdbcTemplate.queryForObject( selectSQL,new Object[] {customerID},new BeanPropertyRowMapper<>(Customer.class));
	 return emp;
	}
	public List<Customer>findAll(){
		String selectSQL=" SELECT * FROM " + TABLE_NAME;
		List<Customer>empList= jdbcTemplate.query(selectSQL,new BeanPropertyRowMapper<>(Customer.class));
	return empList;	
	}
	public Customer getcustomerByEmailAndPassword(String email, String password) {
		String selectSQL=" SELECT * FROM " + TABLE_NAME +"WHERE email=? AND password=?";
		Customer emp=jdbcTemplate.queryForObject( selectSQL,new Object[] {email,password},new BeanPropertyRowMapper<>(Customer.class));
		
		
		return emp;
	}
	
	

}

