package com.sound;

import org.springframework.stereotype.Component;
//@Component--->>> class bike 
@Component("pur")

public class Bike implements Vehicle {
	
	public void move() {
		System.out.println("Bike is moving.....");
	}

}
