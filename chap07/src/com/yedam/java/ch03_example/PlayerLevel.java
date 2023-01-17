package com.yedam.java.ch03_example;

public abstract class PlayerLevel {
	//각 레벨별로 하는 행동이 달라져서 
	//4가지를 오버라이딩 해야한다
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	public abstract void showLevelMessage();
	
	//초보, 중급, 고급때 같은 프로세서로 실행된다 이때는 추상메소드 말고 일반 메소드로 쓰는게 좋다 : 공통적인 거라서
	//final을 추상 메소드에 붙이면 오버라이딩이 불가하다(사용은 하되 덮어쓰기는 못하도록)
	//go는 레벨과 상관없이 다 쓰여서 일반메소드로
	public final void go (int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
