package com.yedam.java.ch01;

public class AnonymouseExample {
	public static void main(String[] args) {

		// 익명 객체 -> 상속과 구현관계에 있는 객체를 익명으로 사용하는 것
		// 상속 -> 익명 자식 객체
		// 구현 -> 익명 구현 객체

		Phone test = new Phone() {   

			@Override
			public void turnOn() {
				System.out.println("전원을 킵니다.");

			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");

			}

			@Override
			public void service() {
				System.out.println("현재버전 : " + versionUpdate());
				System.out.println("테스트 기능입니다.");

			}

			double version = 1.4;   //익명객체가 가지고 있는 메소드

			public double versionUpdate() {
				return version + 0.1;
			}

		};
		test.service();
	}
}
