package com.sound;

public class Engine {
	private double power;

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
	public void start() {
		System.out.println("engine is starting...with the power" + power +"cc");
	}

}
