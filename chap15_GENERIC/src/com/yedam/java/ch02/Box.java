package com.yedam.java.ch02;

public class Box<S> {    //타입(클래스)를 값으로 받는 일종의 변수
	private S s ; 
	
	public void set (S s) {
		this.s = s;
	}
	public S get() {
		return s;
	}
}
