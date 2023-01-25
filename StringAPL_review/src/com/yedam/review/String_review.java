package com.yedam.review;

public class String_review {
	public static void main(String[] args) {
		
		//메모리가 5개
		String a = "a";
		a += "a";
		a += "a";
		a += "a";
		a += "a";
		a += "a";
		
		//메모리가 한개
		StringBuilder sb = new StringBuilder();
		sb.append("aaa");  //aaa
		sb.append(11);
		sb.append(false);
		
		System.out.println(sb);
	}
}
