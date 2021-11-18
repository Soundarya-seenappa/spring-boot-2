package com.sound.model;

import org.springframework.stereotype.Component;


@Component
public class Employee {
	
	private int id;
	 private int age;
	 private double salary;
	 private  String name;
	 private  String email;
	 private  String password;
	 
	 
 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
@Override
	
public String toString() {
	return "Employee[id="+id +",age= "+age +",salary= "+ salary +
			",name= "+ name +",email= "+email +",password= "+ password +"]";
}
}

