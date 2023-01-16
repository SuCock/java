package com.yedam.java.ch01_01;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;

	}
	
	public void carstop() {
		super.stop();
		System.out.println("스포츠카를 멈춤");
		this.maxSpeed = 400;
	}
}
