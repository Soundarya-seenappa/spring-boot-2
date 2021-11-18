package com.sound;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sound.config.SpringConfig;
import com.sound.model.Bike;
import com.sound.model.Car;

public class App {

	public static void main(String[] args) {
		
	
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		// when only @component is used in file
		//Car car=(Car) context.getBean("car",Car.class);
		//car.move();
		
		//Bike bike=(Bike) context.getBean("bike",Bike.class);
		//bike.move();//bike is moving..
			
		///////////////////////////////////////////////////////////////////////////////////
		
		////@Scope("prototype") is used//////

			Car car=(Car) context.getBean("car",Car.class);
			Car car1=(Car) context.getBean("car",Car.class);
			System.out.println(car);//op  com.sound.model.Car@4c583ecf
			System.out.println(car1);//output  com.sound.model.Car@692f203f
			
			
//		////@Scope("singleton") is used//////
//            Car car=(Car) context.getBean("car",Car.class);
//			Car car1=(Car) context.getBean("car",Car.class);
//			System.out.println(car);//op  com.sound.model.Car@4c583ecf
//			System.out.println(car1);//op  com.sound.model.Car@4c583ecf//same object
//			
			
			
		//////// if use @Component("pus")///////

		   Bike bike=(Bike) context.getBean("pus");
		    System.out.println(bike);//com.sound.model.Bike@48f2bd5b
		}

}
