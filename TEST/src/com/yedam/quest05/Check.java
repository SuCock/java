package com.yedam.quest05;

import java.util.Scanner;

public class Check {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] dice = null;
	int size = 0;
	
	boolean run = true;
	while(run) {
		System.out.println("===1.주사위 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5.종료 ===");
		System.out.println("메뉴> ");
		int selectNo = sc.nextInt();
		if(selectNo == 1) {
			System.out.println(("주사위 크기> "));
			size = sc.nextInt();
		if(size < 5 || size > 10) {
			size = 0;
			System.out.println("입력한 값이 범위를 벗어났습니다.");
			System.out.println("5 ~ 10 사이의 수를 입력해주세요.");
		}
			dice = new int[size];
		}else if (selectNo == 2) {
			int count = 0;
			while(true) {
				int random = (int)(Math.random()* size)+1;
				dice[random-1]++;  //index는 0부터 시작해서 1씩증가, 주사위는 1부터 시작해서 1씩 증가
				count++;           //랜덤함수가 돌때마다 1씩증가해서 주사위를 몇번 굴렸는지 알 수 있다.
				if(random == 5) 
					break; 				
			}
			System.out.println("5가 나올 때까지 주사위를 "+count+"번 굴렸습니다.");
		}else if(selectNo ==3) {
			for(int i = 0; i<dice.length;i++) {
				System.out.printf("%d은 %d번 나왔습니다.\n", (i+1), dice[i]);
			}
			
		}else if(selectNo == 4) {
			int max = 0;
			for(int num : dice) {
				if(max < num) {
					max = num;
				}
			}
			int i = 0; // for문을 벗어난 index값이 필요해서 초기값을 밖에 뒀다.
			for(; i<dice.length;i ++) {
				if(dice[i] == max)break;
			}
			System.out.println("가장 많이 나온 수는 "+(i+1)+"입니다.");
		}else if(selectNo == 5) {
			System.out.println("프로그램 종료");
			run = false;
		}
}
}
}
