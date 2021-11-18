package com.sound.SpringBootjpa2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sound.SpringBootjpa2.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	//Customer getCustomerByEmailAndCustomerPassword(String email,String password);

	Customer findByEmailAndPassword(String email, String password);

}
