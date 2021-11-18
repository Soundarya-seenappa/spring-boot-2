package com.sound.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sound.model.*;
//import com.sound.Car;

@Configuration
@ComponentScan(basePackages = "com.sound.model")

public class SpringConfig {
	
	@Bean
	public Bike getBike() {
		return new Bike();
		
	}
	
	@Bean
	public Car getCar() {
		return new Car();
		
	}

}
