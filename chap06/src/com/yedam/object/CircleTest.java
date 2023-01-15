package com.yedam.object;

public class CircleTest {

	// 반지름이 5인 원의 면적 계산
	public static void main(String[] args) {
		// circle 객체 생성
		// static = 정적 = 공유
		// 클래스파일 로딩할 때 메모리 할당
		// 객체생성 없이 클래스 이름으로 접근가능
		//System.out.println(Circle.pi);
		//Circle one = new Circle(5);
		// 반지름 5 초기화
		// one.r = 5;
		// area
		//double result = one.area();
		// 결과 출력
		//System.out.println(result);

		//Circle two = new Circle();
		//two.r = 10;

		CircleSingle circS = CircleSingle.getInstance();
		circS.r = 60;
		double result2 = circS.area();
		System.out.println(result2);
	}
}
