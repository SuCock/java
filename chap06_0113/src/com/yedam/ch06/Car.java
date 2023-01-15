package com.yedam.ch06;

public class Car {
	private int speed;
	private int maxSpeed;
	private String model;

	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}
	public String getModel() {
		return this.model;
	}
	public int geMaxspeed() {
		return this.Maxspeed;
	}
	public void setSpeed(int speed) {
		this.maxSpeed=speed;
	}
	
}
