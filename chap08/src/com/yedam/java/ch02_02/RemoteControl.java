package com.yedam.java.ch02_02;

public interface RemoteControl {
	// 상수 필드
	// public static final int MAX_VALUE = 10;
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;
	
	

	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
