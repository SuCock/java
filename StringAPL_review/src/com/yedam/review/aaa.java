package com.yedam.review;

import java.util.Scanner;
//문자열 뒤집기
public class aaa {
	public static void main(String_review[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("뒤질을 문자열 입력> ");
		String a = sc.nextLine();


		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}

	}
}