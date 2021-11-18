package com.sound;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sound.config.SpringConfig;
import com.sound.model.Amd;
import com.sound.model.CPU;
import com.sound.model.Intel;
import com.sound.model.Laptop;


public class App {

	public static void main(String[] args) {
		  ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	
		Laptop laptop=context.getBean(Laptop.class);
		

laptop.start();
		
	}

}
