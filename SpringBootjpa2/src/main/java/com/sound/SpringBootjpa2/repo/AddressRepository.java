package com.sound.SpringBootjpa2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sound.SpringBootjpa2.model.Address;


public interface AddressRepository extends JpaRepository<Address, Long> {

}
