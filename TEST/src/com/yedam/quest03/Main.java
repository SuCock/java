package com.yedam.quest03;

public class Main {
	public static void main(String[] args) {
		
	
	//큰 금액부터 동전을 우선적으로 거슬러 줘야한다.
	int[] coinUnit = new int[4]; //각 금액별 동전개수
	int money = 2680;
	System.out.println("money = " + money);
	for (int i = 0; i < coinUnit.length; i++) {
//		coinUnit = new int[] {500, 100, 50, 10};
//		System.out.println(coinUnit[i] + "원: " + money / coinUnit[i] + "개" );
//
//		money = money % coinUnit[i];
		if(money >= 500) {
			coinUnit[i] = money / 500;  //나눴을때 결과가 5개
			money = money % 500; // money = money - (coinUnit[i] * 500); 나머지 금액
			System.out.println("500원 : "+coinUnit[i] + "개");
		}else if (money >= 100) {
			coinUnit[i] = money / 100;  //나눴을때 결과가 5개
			money = money % 100; // money = money - (coinUnit[i] * 500); 나머지 금액
			System.out.println("100원 : "+coinUnit[i] + "개");
		}else if (money >= 50) {
			coinUnit[i] = money / 50;  //나눴을때 결과가 5개
			money = money % 50; // money = money - (coinUnit[i] * 500); 나머지 금액
			System.out.println("50원 : "+coinUnit[i] + "개");
		}else if (money >= 10) {
			coinUnit[i] = money / 10;  //나눴을때 결과가 5개
			money = money % 10; // money = money - (coinUnit[i] * 500); 나머지 금액
			System.out.println("500원 : "+coinUnit[i] + "개");
		}
}
	}
}


