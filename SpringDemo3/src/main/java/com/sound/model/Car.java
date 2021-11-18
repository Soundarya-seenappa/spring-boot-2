package com.sound.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Car {
 
	public void move() {
		
		System.out.println(" Car is  movinggg....");
	}

	
}
