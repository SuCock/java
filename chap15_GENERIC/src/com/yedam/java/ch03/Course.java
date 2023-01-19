package com.yedam.java.ch03;

public class Course {
	public static void registerCourse1(Applicant<?> applicant) {
		String message = 
				applicant.kind.getClass().getSimpleName()    //kind가 가지고 있는 클래스.그클래스의 이름 
				+ "이(가) Couse1을 등록함";
		System.out.println(message);
		}
	//Person, Worker만 등록할 수 있다
	public static void registerCourse2(Applicant<? super Worker> applicant) {
		String message = 
				applicant.kind.getClass().getSimpleName()    //kind가 가지고 있는 클래스.그클래스의 이름 
				+ "이(가) Couse2을 등록함";
		System.out.println(message);
		}
	//Student, HighStudent, MiddleStudet만 등록할 수 있다
	public static void registerCourse3(Applicant<? extends Student> applicant) {
		String message = 
				applicant.kind.getClass().getSimpleName()    //kind가 가지고 있는 클래스.그클래스의 이름 
				+ "이(가) Couse3을 등록함";
		System.out.println(message);
		}
}
