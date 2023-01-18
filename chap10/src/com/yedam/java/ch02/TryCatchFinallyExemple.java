package com.yedam.java.ch02;

import java.util.Scanner;

public class TryCatchFinallyExemple {
	public static void main(String[] args)  {
		// 일반 예외
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}

		// 실행 예외
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.printf("%s + %s = %d\n", data1, data2, result);

			throw new ClassCastException();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("정상적으로 실행되지 않습니다.");
		} finally {
			System.out.println("프로그램이 종료되었습니다.");
		}
		
		findClass();
		
	}

	public static void findClass() {
		String className = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고자 하는 클래스 이름을 적어주세요.");
		className = sc.nextLine();
		
		if (className == null || className.equals("")) {
			throw new NullPointerException();
		}
		
		try {
			Class clazz = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 

	}

}
