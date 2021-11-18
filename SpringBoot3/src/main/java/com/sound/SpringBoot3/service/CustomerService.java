package com.sound.SpringBoot3.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sound.SpringBoot3.dao.CustomerDAO;
import com.sound.SpringBoot3.model.Customer;
import com.sound.SpringBoot3.model.login;

@Service
public class CustomerService {
	@Autowired
	private CustomerDAO customerDAO;
	
		public void add(Customer customer) {
		
			customerDAO.add(customer);
		
		
	}
	public List<Customer> getAllCustomer(){
	return customerDAO.findAll();
	}
	public boolean validate(login login) {
		String email= login.getEmail();
		String password=login.getPassword();
		
		Customer customer=customerDAO.getcustomerByEmailAndPassword(email,password);
		return customer !=null;
	}

}
 