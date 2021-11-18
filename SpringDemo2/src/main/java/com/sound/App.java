package com.sound;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		System.out.println(" hello from maven project..");
			
			
			
			ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
			
			//Car car=(Car) context.getBean("car");
			//car.move();
			
		Bike bike=(Bike) context.getBean("pur");
			bike.move();

	}

}
