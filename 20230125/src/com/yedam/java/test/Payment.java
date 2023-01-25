package com.yedam.java.test;

public interface Payment {
	// 필드
	static final double ONLINE_PAYMENT_PATIO = 0.05;
	static final double OFFLINE_PAYMENT_RATIO = 0.03;

	// 메서드
	public int onlice(int price);

	public int offline(int price);

	public void showInfo();
}
