package com.sound;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		System.out.println(" hello from maven project..");
			
			/*Vehicle obj1= new Car();//USING JAVA
			obj1.move();
			
			Vehicle obj2= new Bike();
			obj2.move();
*/			
			
			ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");//SPRINGBOOT
			
			Car car=(Car) context.getBean("car");
			car.move();
			
//			Bike bike=(Bike) context.getBean("bike");
//			bike.move();

	}

}
