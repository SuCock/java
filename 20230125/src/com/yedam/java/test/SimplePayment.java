package com.yedam.java.test;

public class SimplePayment implements Payment {
	// 필드
	double simplePaymentRatio;

	// 생성자
	public SimplePayment(double d) {
		this.simplePaymentRatio =  d;

	}

	@Override
	public int onlice(int price) {
		return (int)(price * (1-(ONLINE_PAYMENT_PATIO + simplePaymentRatio)));
	}

	@Override
	public int offline(int price) {
		return (int)(price - price * (OFFLINE_PAYMENT_RATIO + simplePaymentRatio));
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율 : "+(ONLINE_PAYMENT_PATIO+simplePaymentRatio));
		System.out.println("오프라인 결제 시 총 할인율 : "+(OFFLINE_PAYMENT_RATIO+simplePaymentRatio));
	}

}
