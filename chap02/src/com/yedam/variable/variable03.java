package com.yedam.variable;

public class variable03 {
	public static void main(String[] args) {
		int var1 = 0b1011;// 2진수
		int var2 = 0206; // 8진수
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 16진수

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);

		byte bVar1 = 125; // -128 ~ 127 <- 200을 담을 수 없다.
		int bVar2 = 200;

		System.out.println("bVar1 : " + bVar1);
		System.out.println("bVar2 : " + bVar2);

		// Long 선언하는 법
		// int 범위를 넘어가는 데이터를 쓸때는 숫자뒤에L를 붙여줘야 한다
		long lVar1 = 2000000;
		long lVar2 = 20000000000L;

		// Char 숫자로 들어가도 나올때는 문자로 나온다
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';

		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
