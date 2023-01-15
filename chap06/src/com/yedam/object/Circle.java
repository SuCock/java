package com.yedam.object;

//클래스 선언
/*
 * static 필드     :public
 * instance 필드   :private
 * 생성자           :public
 * getter, setter :public
 * 메서드
 */

public class Circle {

	private static final double pi = 3.14;
	private double r;  //외부에서 직접 접근하지 못하게 막는다 캡슐화
	
	// 기본생성자
	public Circle() {
	}
	
	// r 필드 초기화 생성자
	public Circle(double r) {
		this.r = r;
	}
	//r write/read 캡슐화 제어가능
	//setter(변경가능), getter(조회가능)
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	// method
	public double area() {
		double result = pi * r * r;
		return result;
	}
}
