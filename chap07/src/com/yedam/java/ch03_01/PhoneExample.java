package com.yedam.java.ch03_01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone("홍길동");
		
		 SmartPhone smartPhone = new SmartPhone("홍길동");
		 
		 Phone phone = new SmartPhone("홍길동"); // 변수선언은 가능
		 
		 //SmartPhone smartPone = (SmartPhone)new Phone("홍길동"); Phone은 new가 안된다 
		 
		 smartPhone.turnOn();
		 smartPhone.intetnetSearch();
	}
}
