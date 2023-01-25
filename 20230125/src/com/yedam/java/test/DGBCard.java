package com.yedam.java.test;

public class DGBCard extends Card {

	// 필드
	String company;
	String cardStaff;

	// 생성자
	DGBCard(int cardNo, int validDate, int CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		company = "대구은행";
		this.cardStaff = cardStaff;
	}

	// 메소드
	@Override
	public void showCaredInfo() {
		cardStaff = "신빛용";
		System.out.println("카드정보 - Card NO, " + cardNo + ", 유효기간 : " + validDate + ", CVC : " + CVC + "\n"); //super.showCardInfo(); 부모의 코드 재사용(코드이 재사용성을 높인다)
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}
}
