package com.yedam.quest05;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] array = null;
	int no = 0;
	boolean out = true;
	int size = Integer.parseInt(sc.nextLine());
	while(out) {
		System.out.println("=================================================================");
		System.out.println("1. 주사위 크기 | 2. 주사위 굴리기 | 3. 결과 보기 | 4. 가장 많이 나온 수 | 5. 종료");
		System.out.println("=================================================================");
		no = Integer.parseInt(sc.nextLine());
		switch(no) {
		case 1 :
			size = Integer.parseInt(sc.nextLine());
			if(10<size && 5>size) {
				System.out.println("5~10을 입력해주세요");
				continue;
			}
			break;
		case 2 :			
			int randomNo = (int) (Math.random() * size) + 1;
			
			

			break;
		case 3 :
			for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]+"은"+i+"번 나왔습니다.");
			}
			break;
		case 4 :
			int max =0;
			for(int i = 0; i<array.length; i++) {
				max = array[0];
				if(array[i]>max) {
					System.out.println("가장 많이 나온 수는 "+array[i]+"입니다");
				}
			}
			break;
		case 5 :
			System.out.println("프로그램을 종료");
			out = false;
			break;
		}
	}
}
}
