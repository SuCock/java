package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("iBATIS");
		boolean num = set.add("Java");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		System.out.println(num);
		System.out.println();
		
		Iterator<String> iterator = set.iterator();  //set안에 저장되어 있는 객체를 하나씩 가져오는 반복자 -> 순서도 질서도 없어서 하나씩 지정해서 확인을 못하니깐 
		while(iterator.hasNext()) {    //hasNext 다음순서로 가도되는지 여부 true->true->true->stop
			String element = iterator.next();  //set안에 있는 객체를 가져온다
			System.out.println("\t" + element);
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		for(String skill : set) {
			System.out.println("\t" + skill);
		}
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("내부가 비어있습니다.");
		}
		
		
		
		
		
		
		
		
	}
}