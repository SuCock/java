package com.yedam.loop;

import java.util.Scanner;

public class LoopFor {
	public static void main(String[] args) {
		// for문
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		// 1부터 100까지의 합
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			result += i; // result = result + i

		}
		System.out.println("1~100까지의 합 : " + result);
		// 1~100 사이의 짝수 구하기
		// 짝수의 성질
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "는 짝수");

			} else if (!(i % 2 == 0)) {
				System.out.println(i + "는 홀수");
			}
		}
		// 입력한 숫자에 대한 구구단 출력
		// 스캐너를 활용해서 값을 하나 입력
		// 입력 받은 값에 대한 구구단 출력
		// 2를 입력 -> 2*1 = 2...2*9 = 18
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("구구단 입력>"); int gugu
		 * = Integer.parseInt(sc.nextLine());
		 * 
		 * for (int i = 1; i <= 9; i++) { System.out.println(gugu +
		 * " * "+i+" = "+(gugu*i)); }
		 */

		// 입력한 값에 대한 총합, 평균, 최대값, 최소값, 데이터 받을 갯수
		// 스캐너 -> 데이터 입력
		// 데이터 받을 갯수 -> 5
		// 데이터 입력 횟수가 5번 : 1, 20, 40, 30, 10
		// 총합 : 값을 입력 받을 때마다 변수에 저장
		// 평균 : 총합/갯수
		// 최대값 : 입력할 때 마다 비교 최대값인지 아닌지
		// 최소값 : 입력할 때 마다 비교 최소값인지 아닌지

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("숫자 입력>"); int number = Integer.parseInt(sc.nextLine());
		 * int data = 0; int sum = 0; int avg = 0; int numMax = 0; int numMin = 1000000;
		 * for (int i = 0; i < number; i++) { data = Integer.parseInt(sc.nextLine());
		 * sum += data;
		 * 
		 * if (numMax < data) { numMax = data; } if (numMin > data) { numMin = data; }
		 * 
		 * } avg = (double)sum / number; System.out.println("총합 : " + sum);
		 * System.out.println("평균 : %5.2f " + avg); System.out.println("최대값 : " + numMax);
		 * System.out.println("최소값 : " + numMin);
		 */

		// 2번 문제) up and down
		// 해당 랜덤 값(1~100)을 맞추는 프로그램을 구현하라
		int quize = (int) (Math.random() * 100 + 1);
		System.out.println("숫자 맞추기>");
		for (int i = 1; i <= 5; i++) {
			int count = Integer.parseInt(sc.nextLine());
			if (count < quize) {
				System.out.println("UP");

			} else if (count > quize) {
				System.out.println("DOWN");
			} else {
				System.out.println("SUCCES");
				break;
			}
			if (i == 5) {
				System.out.println("GAME OVER");
			}
		}

	}

}
