package com.sound.SpringBoot4.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sound.SpringBoot4.model.Customer;
import com.sound.SpringBoot4.model.login;
import com.sound.SpringBoot4.repo.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
		public void add(Customer customer) {
		
			customerRepository.save(customer);
		
		
	}
	public List<Customer> getAllCustomer(){
	return  customerRepository.findAll();
	}
	public boolean validate(login login) {
		String email= login.getEmail();
		String password=login.getPassword();
		
		Customer customer= customerRepository.findByEmailAndPassword(email,password);
		return customer !=null;
	}

}
 