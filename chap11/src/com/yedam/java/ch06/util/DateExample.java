package com.yedam.java.ch06.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM원 dd일 mm분 ss초");
		String strNow = sdf.format(date);
		System.out.println(strNow);
		
		
		
		
	}
}
