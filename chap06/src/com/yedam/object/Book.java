package com.yedam.object;

public class Book {
	// Book 클래스
	// 책의 종류, 가격, 출판사, 도서번호의 정보
	// 정보는 원하는 방식 아무거나 활용해서 정보 입력.
	// getInfo 메소드 객체가 가진 정보 출력.
	// getInfo의 출력 예시
	// 혼자 공부하는 자바
	// # 내용
	// 1) 종류 : 학습서
	// 2) 가격 : 24000원
	// 3) 출판사 : 한빛미디어
	// 4) 도서번호 : yedam-001

	// 다른 예시
	// 이것이 리눅스다
	// # 내용
	// 1) 종류 : 학습서
	// 2) 가격 : 32000원
	// 3) 출판사 : 한빛미디어
	// 4) 도서번호 : yedam-002

	// 필드
	String kind;
	int price;
	String publisher;
	String num;

	// 생성자
	Book(int price, String num) {
		kind = "학습서";
		this.price = price;
		publisher = "한빛미디어";
		this.num = num;
	}

	// 매개변수 타입에 따른 생성자 오버로딩
	Book(String kind, String num) {
		this.kind = kind;
		this.num = num;
	}

	// 매개 변수 순서에 따른 생성자 오버로딩
	// 데이터 타입 기준으로 순서를 따진다.
	Book(String num, int price) {
		this.price = price;
		this.num = num;
	}

	// 매개 변수 갯수에 따른
	Book(int price) {
		this.price = price;
	}

	// 기본 생성자
	Book() {
		
	}

	// 메소드
	void getInfo() {
		System.out.println("종류 : " + kind);
		System.out.println("가격 : " + price + "원");
		System.out.println("출판사 : " + publisher);
		System.out.println("도서번호 : " + num);
	}

}
