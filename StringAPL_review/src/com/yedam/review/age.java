package com.yedam.review;

import java.util.Calendar;
import java.util.Scanner;
//만 나이 계산기(올해 기준 +- 100살)
//1. 계산식(하드 코딩) -> 올해만 사용가능
//1-1) 2000년 이후 2023년 이전 출생 -> (23-태여난 년도)+1 
//1-2) 1922년 이후 2000년 이전 출생 -> (123(한세기가 차이난다)-태어난 년도)

//1. 계산식(일반화)
//Calendar, data(simpledataFormat) => 오늘 날짜, 년도
//1-1) 2000년 이후 2023년 이전 출생 -> (기준 년도-태여난 년도)+1 
//1-2) 1922년 이후 2000년 이전 출생 -> (기준 년도-태어난 년도)

//하드 코딩
public class age {
	public static void main(String_review[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		Integer currentYear = now.get(Calendar.YEAR);
		
		System.out.println("생년월일 입력> ");
		String age = sc.nextLine();
		Integer birthYear = Integer.parseInt(age.substring(0, 2));
		if(birthYear <= 23) {    //1-1) 2000년 이후 2023년 이전 출생 -> (기준 년도-태여난 년도)+1
			System.out.println("나이 : "+(23 - birthYear) + 1);
		}else if(birthYear > 23) {  //1-2) 1922년 이후 2000년 이전 출생 -> (기준 년도-태어난 년도
			System.out.println("나이 : "+(123 - birthYear));
		}

	}
}
