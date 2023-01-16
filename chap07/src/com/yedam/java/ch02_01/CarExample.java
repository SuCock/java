package com.yedam.java.ch02_01;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for(int i = 1; i<=5; i++) {
			int problemLoation = car.run();
			
			switch(problemLoation) {
			case 1:
				System.out.println("왼쪽앞 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("왼쪽앞 교체", 15);
				break;
			case 2:
				System.out.println("오른쪽앞 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("오른쪽앞 교체", 15);
				break;
			case 3:
				System.out.println("왼쪽뒤 HankookTire로 교체");
				car.backLeftTire = new HankookTire("왼쪽뒤 교체", 15);
				break;
			case 4:
				System.out.println("왼쪽앞 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("왼쪽앞 교체", 15);
				break;
			}
			System.out.println("------------------------------------------------");
		}
}
}
