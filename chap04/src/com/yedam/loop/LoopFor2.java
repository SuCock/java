package com.yedam.loop;

public class LoopFor2 {
	public static void main(String[] args) {
		// 중첩 for문
		// for(){
		// for(){
		// }
		// }

		// 2단 ~ 9단 출력
		/*
		 * for (int i = 2; i <= 9; i++) { for (int j = 1; j <= 9; j++) {
		 * System.out.println(i + " * " + j + " = " + (i * j)); } System.out.println();
		 * }
		 * 
		 * //별찍기 //***** //***** //***** //***** //***** //첫번째 반복문은 줄바꿈 //두번째 반복문은 별찍어준다
		 * 
		 * //한 줄, 한 줄 내려 갈 때 쓰는 반복문 for( int i = 1; i <= 5;i++) { //별을 찍어주는 반복문 for(int
		 * j = 1;j<=5;j++ ) { System.out.print("*"); } System.out.println(); }
		 * 
		 * //* 1번째 줄에 1개 //** 2번째 줄에 2개 //*** 3번째 줄에 3개 //**** 4번째 줄에 4개 //***** 5번째 줄에
		 * 5개
		 * 
		 * for(int i=1;i<=5;i++) { for (int j=0; j<i; j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */
		
		//반복문은 i값 또는 j값이 1또는 0부터 시작하라는 법은 없습니다.
		//*****
		//****
		//***
		//**
		//*
		for(int i =0; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
		
		
		
		
		
		
		
	}
}
