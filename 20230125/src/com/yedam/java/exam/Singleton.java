package com.yedam.java.exam;

public class Singleton {

	private Singleton singleton = null; //외부에서 접근못함.

	// 생성자를 private로 막아놨다. => 외부에서 Singleton 객체 생성 못함.
	private Singleton() {
	}
	//외부에서 Singleton 내부에서 만든 객체 연결하는 메소드.
	public Singleton getInstance() {   //전달만 한다
		if (singleton == null) {
			singleton = new Singleton();  //100번지로 부여받는다
		}
		return singleton;
	}
}
