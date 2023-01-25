package com.yedam.java.test;

public class Card {
	// 필드
	int cardNo;
	int validDate;
	int CVC;

	// 생성자
	Card(int cardNo, int validDate, int CVC){
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.CVC = CVC;
	}
	public int getcardNo() {
		return cardNo;
	}

	public int getvalidDate() {
		return validDate;
	}

	public int getCVC() {
		return CVC;
	}

	// 메서드
	public void showCaredInfo() {
		cardNo = 5432 - 4567 - 9534 - 3657;
		validDate = 20251203;
		CVC = 253;
		System.out.println("카드정보 ( card NO : " + cardNo + ", 유효기간 : " + validDate + ", CVC : " + CVC + ")");
	}
}
