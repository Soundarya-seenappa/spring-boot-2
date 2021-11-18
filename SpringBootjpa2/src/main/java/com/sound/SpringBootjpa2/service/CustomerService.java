package com.sound.SpringBootjpa2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sound.SpringBootjpa2.model.Customer;
import com.sound.SpringBootjpa2.repo.CustomerRepository;


@Service
public class CustomerService {
	
		@Autowired
		private CustomerRepository customerRepository;

		public Customer add(Customer customer) {
		return	customerRepository.save(customer);
		}

		public List<Customer> getAllCustomers() {
			return customerRepository.findAll();
		}

		
		public Customer edit(Customer customer) {

			return customerRepository.save(customer);

		}

		public Optional<Customer> getCustomerById(long id) {

			return customerRepository.findById(id);
		}

		public void deleteCustomerById(long id) {

			customerRepository.deleteById(id);

		}
		 

	}


	 


