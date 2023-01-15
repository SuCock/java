package com.yedam.object;

public class CircleSingle {

	// 싱글톤
	static CircleSingle instance = new CircleSingle(); // 필드 선언, 객체 생성

	static CircleSingle getInstance() {
		return instance;
	}
	
	static final double pi = 3.14;
	double r;
	

	// r 필드 초기화 생성자
//	private CircleSingle() {
//		this.pi = 3.14;
//	}
	
	CircleSingle(double r) {
		this.r = r;
	}

	// 기본생성자
	private CircleSingle() { //외부에서 객체를 생성할 수 없다

	}

	// method
	double area() {
		double result = pi * r * r;
		return result;
	}
}
