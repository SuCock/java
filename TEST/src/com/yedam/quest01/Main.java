package com.yedam.quest01;

public class Main {
	public static void main(String[] args) {
		int a = 10;
		double b = 2.0;
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		
		result1 = (int)(a*b);
		result2 = (int)(a/b);
		result3 = (int)(a-b);
		result4 = (int)(a+b);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
