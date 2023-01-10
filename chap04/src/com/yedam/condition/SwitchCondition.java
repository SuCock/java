package com.yedam.condition;

import java.util.Scanner;

public class SwitchCondition {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 6 + 1);
		System.out.println(number);
		switch (number) {
		case 1: // 변수값과 같을 때
			System.out.println("1번 나옴");
			break; // 구문 나갈 때
		case 2:
			System.out.println("2번 나옴");
			break;
		case 3:
			System.out.println("3번 나옴");
			break;
		case 4:
			System.out.println("4번 나옴");
			break;
		case 5:
			System.out.println("5번 나옴");
			break;
		/*
		 * default: //else System.out.println("6번 나옴"); break;
		 */
		case 6:
			System.out.println("6번 나옴");
			break;
		}

		// char
		char grade = 'B';
		String grade2 = "B";

		switch (grade2) {
		case "A":
			System.out.println("우수 회원");
			break;
		case "B":
		case "b":
			System.out.println("일반 회원");
			break;
		default:
			System.out.println("손님");
			break;
		}

		// 입력한 성적을 등급으로 환산
		Scanner sc = new Scanner(System.in);
		// 0~100
		// 100~90 : A
		// 89~80 : B
		// 79~70 : C
		// 69~ : D
		System.out.println("입력>");
		int scores = Integer.parseInt(sc.nextLine());
			scores /= 10; // scores = scores/10
		switch (scores) {
		case 9:
		case 10:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		default:
			System.out.println("D등급");
			break;
		}

	}
}
