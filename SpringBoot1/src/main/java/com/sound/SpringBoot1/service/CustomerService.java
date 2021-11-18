package com.sound.SpringBoot1.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.sound.SpringBoot1.model.Customer;
import com.sound.SpringBoot1.model.login;

@Service
public class CustomerService {
	public List<Customer> allCustomers;
	public CustomerService() {
		allCustomers= new ArrayList<>();
		
		Customer customer = new Customer();
		 customer.setEmail("sound@gmail.com");
		 customer.setId(1);
		 customer.setName("Test");
		 customer.setPassword("s1234");
		 
		 allCustomers.add(customer);
	}
	public void add(Customer customer) {
		customer.setId(allCustomers.size()+1);
		allCustomers.add(customer);
		
		
	}
	public List<Customer> getAllCustomer(){
	return allCustomers;
	}
	public boolean validate(login login) {
		String email= login.getEmail();
		String password=login.getPassword();
		
		for(Customer cust:allCustomers) {
			
			if(cust.getEmail().equals(email) && cust.getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}

}
 