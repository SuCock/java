package com.yedam.java.ch04.wrapper;

public class BoxingUnboxing {
	public static void main(String[] args) {
		// 박싱
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf("200");
		// Integer obj3 = new Integer(1000); 구버전까지만 사용가능

		// 언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();

		// 자동 박싱
		Integer newObj1 = value1;
		Integer newObj2 = value2;

		// 자동 언박싱
		int result = newObj1 + newObj2;
		System.out.println(result);

		int newValue1 = newObj1;
		int newValue2 = newObj2;

		// wrapper 클래스 값 비교
		Integer data1 = 300;
		Integer data2 = 300;
		System.out.println("== 결과 : " + (data1 ==  data2));
		System.out.println("언박싱 후 == 결과 : " + (data1.intValue() == data2.intValue()));
		System.out.println("equals() 결과 : " + data1.equals(data2));
		
		//특정범위 안에 있을때는 기본타입처럼 비교할 수 있다 하지만 범위가 매우 적다
		System.out.println("예외사항");
		Integer data3 = 30;
		Integer data4 = 30;
		System.out.println("== 결과 : " + (data3 ==  data4));
		System.out.println("언박싱 후 == 결과 : " + (data3.intValue() == data4.intValue()));
		System.out.println("equals() 결과 : " + data3.equals(data4));
		
		
		
	}

}
