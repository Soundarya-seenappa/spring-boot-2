package com.sound.SpringBoot3.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.sound.SpringBoot3.model.Product;

@Repository
public class ProductDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String TABLE_NAME="product";
	
			public void add(Product product) {
		String insertSQL =" INSERT INTO " + TABLE_NAME +" (name,category,price) VALUES(?,?,?)";

		
		jdbcTemplate.update(insertSQL,product.getName(),product.getCategory(),product.getPrice());
	}
         public void update(Product product) {
         String updateSQL =" INSERT INTO " + TABLE_NAME +" SET name=?,category=?,price=? WHERE id=?";

				
				jdbcTemplate.update(updateSQL,product.getName(),product.getCategory(),product.getPrice(),product.getId());
			}
	public void delete(long productID) {
		String deleteSQL=" DELETE FROM " + TABLE_NAME +" WHERE id=?";
		jdbcTemplate.update(deleteSQL,productID);
		
	}
	public Product findById(long productID) {
		String selectSQL=" SELECT * FROM " + TABLE_NAME +" WHERE id=?";
	Product emp=jdbcTemplate.queryForObject( selectSQL,new Object[] {productID},new BeanPropertyRowMapper<>(Product.class));
	 return emp;
	}
	public List<Product>findAll(){
		String selectSQL=" SELECT  * FROM " + TABLE_NAME;
		List<Product> empList= jdbcTemplate.query(selectSQL,new BeanPropertyRowMapper<>(Product.class));
	return empList;	
	}
	
}