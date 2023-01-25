package com.yedam.java.test;

public class TossCard extends Card {

	// 필드
	String company;
	String cardStaff;

	// 생성자
	TossCard(int cardNo, int validDate, int CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		company = "Toss";
		this.cardStaff = cardStaff;
	}
	
	// 메소드
	@Override
	public void showCaredInfo() {
		cardStaff = "신빛용";
		System.out.println("카드정보 - Card NO, "+cardNo+"\n");   
		System.out.println("담당직원 - "+cardStaff+", "+company);
	}
}
