package com.sound.SpringBoot5.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sound.SpringBoot5.model.Customer;
import com.sound.SpringBoot5.model.login;
import com.sound.SpringBoot5.service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@PostMapping("/login")
	public boolean validateCustomer(login login ) {

		boolean isValidate = customerService.validate(login);

		return isValidate;
	}

	@GetMapping("/customer")
	public List<Customer> getAllCustomers() {

		List<Customer> allCustomer =  customerService.getAllCustomers();

		return allCustomer;
	}

	@GetMapping("/customer/{id}")
	public Optional<Customer> getCustomerById(@PathVariable long id) {

		Optional<Customer> customerOptional = customerService.getCustomerById(id);

		return customerOptional;
	}

	@PostMapping("/customer")
	public Customer saveCustomer(Customer customer) {
		return customerService.add(customer);
	}

	@PutMapping("/customer")
	public Customer editCustomer(Customer customer) {
		return customerService.edit(customer);
	}

	@DeleteMapping("/customer/{id}")
	public void deleteCustomerById(@PathVariable long id) {

		customerService.deleteCustomerById(id);

}
}
