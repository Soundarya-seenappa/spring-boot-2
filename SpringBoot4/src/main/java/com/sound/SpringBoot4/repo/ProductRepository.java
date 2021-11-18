package com.sound.SpringBoot4.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sound.SpringBoot4.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
