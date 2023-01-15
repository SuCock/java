package com.yedam.object;

public class MethodTest {

	public static void main(String[] args) {
		// StringUtil strUtil = new StringUtil();
		StringUtil.greet();
		// goodMorning 출력
		StringUtil.greet("goodMorning");
		int l = StringUtil.greetLength("goodMorning");
		System.out.println(l);
	}

}
