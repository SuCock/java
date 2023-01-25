package com.yedam.review;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Lotto2 {
	public static void main(String[] args) {
		
	
	//Lotto 프로그램
	//List 활용한 Lotto
	//1. 중복되지 않은 번호 6개
	//2. 입력한 금액에 따라 한장당 1~5줄 생성
	//3. 한 줄당 천원, 입력한 금액 만큼 생성
	//4. 구매 금액, 생셩된 번호 출력 가능
	//5. 5장씩 끊어서 츨력 할 것.
		
		HashSet set = new HashSet();
		
		for(int i =0; i<set.size(); i++) {
			int lotto = (int)(Math.random()*6)+1;
			set.add(lotto);
		}
		LinkedList list = new LinkedList(set);
		Collection.sort(list);
		System.out.println(list);
		
	
	}	
}
