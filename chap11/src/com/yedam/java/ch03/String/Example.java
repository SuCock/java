package com.yedam.java.ch03.String;

import java.io.UnsupportedEncodingException;

public class Example {
	public static void main(String[] args) {
		//디코딩 : byte[]바이트 -> String
		byte[] bytes1 = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str1 = new String(bytes1);
		System.out.println(str1);
		
		//별도의 문자셋(기준)을 지정하는 경우
		String str = "안녕하세요";  //한국어의 한글자는 3바이트 => 15바이트
		byte[] bytesx = str.getBytes();
		System.out.println("bytesx.length : " + bytesx.length);
		String strx = new String(bytesx);
		System.out.println("bytesx -> strx : "+ strx);
		
		try {
			byte[] bytesy = str.getBytes("UTF-8");   //지원되지 않는 인코딩 기준일때 오타가 나면 안됨으로 try-catch로 예외를 준다
			System.out.println("bytesy.length : " + bytesy.length);
			String stry = new String(bytesy, "EUC-KR");
			System.out.println("bytesy -> stry : "+ stry);
		} catch (UnsupportedEncodingException e) {
			
			
			e.printStackTrace();
		}
	}
}
