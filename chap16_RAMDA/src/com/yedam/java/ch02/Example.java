package com.yedam.java.ch02;

public class Example {
	public static void main(String[] args) {
		// 매개변수가 없는 경우
		Workable work = () -> {
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		}; // 매개변수가 없어도 소괄호는 있어야 한다

		work.work();

		work = () -> System.out.println("퇴근을 합니다."); // 실행할게 하나밖에 없으면 중괄호 생략가능
		work.work();

		// 매개변수가 있는 경우(일치하지 않아도 된다 자동으로 매칭이 된다)
		Speakable speak = (x) -> {
			System.out.println("현재 볼륨은 중간입니다.");
			System.out.println("현재 재생되는 음악은 " + x + "입니다.");
		};
		speak.speak("뉴진스 - hypeBoy");
		speak = x -> System.out.println("현재 재생되는 음악은 " + x + "입니다.");

		// 리턴값이 있는 경우
		Calculator cal = (x, y) -> {
			int result = (int) (x + y);
			return result;
		};
		System.out.println("첫번째 방식 : " + cal.plus(5.8,6.9));

		cal = (x, y) -> (int) (x + y); //한줄만 남은 실행문이 return 이라면 return도 생략이 가능하다
		System.out.println("두번째 방식 : " + cal.plus(5.8,6.9));
	}
}
