package com.yedam.java.ch02_01;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	
	public boolean roll() {
		++accumlatedRotaiton;
		if (accumlatedRotaiton < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation - accumlatedRotaiton) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}
