package com.sound.SpringBoot5.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sound.SpringBoot5.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
