package com.yedam.object;

public class StringUtil {
	
	//hello인사말을 출력하는 메서드
	static void greet() {
		System.out.println("Hello");
	}
	
	static void greet(String str) {
		System.out.println(str);
	}
	
	static int greetLength(String str){
		int result;
		result = str.length();
		return result;
	}
	
	
}
