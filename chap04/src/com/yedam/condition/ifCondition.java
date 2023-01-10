package com.yedam.condition;

import java.util.Scanner;

public class ifCondition {
	public static void main(String[] args) {
		int score = 93;
		if (score >= 90) {
			System.out.println("점수가 90이상이고, 등급 A");
		}
		// 실행문이 한 줄 일때만 사용 (가독성이 좋지 않아 안쓰는걸 추천)
		if (score >= 90)
			System.out.println("점수가 90이상이고, 등급A"); // 여기까지만 if문이 감싼다
		System.out.println("스코어가 90");

		// if-else
		if (score >= 90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		// else-if
		// if문(조건식을 여러개 사용 할 때)
		/*
		 * score = 95; if (score >= 90) { System.out.println("등급A"); } else if (score >=
		 * 80) { System.out.println("등급B"); } else if (score >= 70) {
		 * System.out.println("등급C"); } else { System.out.println("등급D"); }
		 * 
		 * if (score >= 90) { System.out.println("등급A"); } if (score >= 80) {
		 * System.out.println("등급B"); } if (score >= 70) { System.out.println("등급C"); }
		 * else { System.out.println("등급D"); }
		 */

		// random 값 추출
		// random() / Math.random()
		// 0 <= Math.random() < 1 => 0~0.9xxxxxx
		System.out.println(Math.random());
		// 0 * 10 <= Math.random() * 10 < 1 * 10

		// 0 <= Math.random() * 10 < 10
		// int number = (int)5.12;

		// 0~9.xxxx=>(int)0~(int)9
		// (int)0*10 <= (int)Math.random()*10 < (int)1*10

		// 0~9 => 1~10
		// (int) 0+1 <= (int) Math.random() * 10 +1 < (int) 10+1

		// 주사위 번호 뽑기
		// 0 <= x < 1
		// 0 *6 <= x *6 < 1 *6(5.xxx)
		// 0 <= x*6 <6
		// 0 <= (int) x*6 < 6
		// 0+1 <= (int) x*6+1 < 6+1
		// 1 <= (int) (x*6)+1 <7 => 1~6
		int number = (int) (Math.random() * 6 + 1);
		if (number == 1) {
			System.out.println("1번 나옴");
		} else if (number == 2) {
			System.out.println("2번 나옴");
		} else if (number == 3) {
			System.out.println("3번 나옴");
		} else if (number == 4) {
			System.out.println("4번 나옴");
		} else if (number == 5) {
			System.out.println("5번 나옴");
		} else {
			System.out.println("6번 나옴");
		}

		// 중첩 if문
		// data -> 조건을 여러 번 검색
		/*
		 * if(조건식) { if(조건식) { if(조건식) {
		 * 
		 * } } }
		 */

		/*
		 * int no = 10; //no가 2의 배수 if(no % 2 == 0) { //no가 5의 배수 if(no % 5 ==0) { //no가
		 * 10의 배수 if(no % 10 == 0) { System.out.println("no는 10의 배수입니다."); } } }
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력>");
		score = Integer.parseInt(sc.nextLine());
		String grade = "";
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				
				grade = "A";
			}
		}
		System.out.println("획득한 학점 : " + grade);
		
		
		
		
		
	}
}
