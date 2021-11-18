package com.sound.SpringBootjpa2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sound.SpringBootjpa2.model.Address;
import com.sound.SpringBootjpa2.model.Customer;
import com.sound.SpringBootjpa2.repo.CustomerRepository;

@SpringBootApplication
public class SpringBootjpa2Application implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootjpa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Address address= new Address();
		address.setText("bangalore");
		address.setPincode("560064");
		
		Customer customer=new Customer();
		customer.setName("preethi");
		customer.setEmail("prethi@gmail.com");
		customer.setPassword("1234");
		 customer.setAddress(address);
		
		customerRepository.save(customer);
		
	}

}
