package com.yedam.java.ch02_01;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("왼쪽앞", 6);
	Tire frontRightTire = new Tire("오른쪽앞", 2);
	Tire backLeftTire = new Tire("왼쪽뒤", 3);
	Tire backRightTire = new Tire("오른쪽뒤", 4);
	

	// 생서자
	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;

	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
