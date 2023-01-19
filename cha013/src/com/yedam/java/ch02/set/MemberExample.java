package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Set;

public class MemberExample {
	public static void main(String[] args) {
		Set<Member>set = new HashSet<>();
		
		set.add(new Member(1000,"홍길동"));
		set.add(new Member(1000,"홍길동"));
		
		System.out.println("총 객체수 : " + set.size());  //new연산자로 만들었기 때문에 메모리에 두개가 있다(메모리 주소가 다르다) 자바는 이를 따로 본다
	}
}
