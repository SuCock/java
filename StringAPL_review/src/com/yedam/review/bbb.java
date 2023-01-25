package com.yedam.review;

import java.util.Scanner;
//입력한 문자열 개수 세기
public class bbb {
	public static void main(String_review[] args) {
		Scanner sc = new Scanner(System.in);
		int alphabet[] = new int[26];
		System.out.println("문자열 입력> ");
		String b = sc.nextLine().toLowerCase();  //toLowerCase : 내가 작성한 문자열을 소문자로 바꿔준다.

		for (int i = 0; i < b.length(); i++) {
			char ch = b.charAt(i);   //다른 방식(subString) -> b.subString(i, i+1)
			alphabet[ch - 'a']++;     //ary[내가 입력한 문자 - 97] = 0~25(a~z)의 자리와 갯수를 의미.
		}
		for (int i = 0; i < 26; i++) {
			if (alphabet[i] != 0) {
				System.out.println((char) (97 + i) + " " + (alphabet[i]) + "개");
			}
		}

	}
}
