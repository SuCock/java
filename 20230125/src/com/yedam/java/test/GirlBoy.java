package com.yedam.java.test;

public class GirlBoy {
	public static void main(String[] args) {
		String[] arr = { "010102-4", "991012-1", "960304-1", "881012-2", "040403-3" };
		int[] gender = new int[2];
		for (int i = 0; i < arr.length; i++) {
			char arr1 = arr[i].charAt(7);
			if (arr1 == '1' || arr1 == '3') {
				gender[0]++;
			} else {
				gender[1]++;
			}
		}
		System.out.println("남" + gender[0] + " " + "여" + gender[1]);
	}
}