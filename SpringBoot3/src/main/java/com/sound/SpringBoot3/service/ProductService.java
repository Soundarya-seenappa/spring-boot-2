package com.sound.SpringBoot3.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sound.SpringBoot3.dao.ProductDAO;
import com.sound.SpringBoot3.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDAO productDAO;	
	public void add(Product  product) {
		
		productDAO.add(product);	
	}
	public List<Product> getAllProducts(){
	return productDAO.findAll();
	}
	public void edit(Product product) {
		productDAO.update(product);
	 }
	
	public Product getProductById(long id) {
		
		return productDAO.findById(id);
	}
	public void deleteProductById(long id) {
		productDAO.delete(id);
}
	 
			 
}
 