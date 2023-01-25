package com.yedam.review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
	Scanner sc = new Scanner(System.in);
	boolean lottoCheck = true;
	HashSet<Integer> set = new HashSet<Integer>();

	public LottoApp() {
		run(); // 실행
	}

	private void run() {
		System.out.println("====insert money====");
		int money = Integer.parseInt(sc.nextLine());
		if (money < 1000) {
			System.out.println("금액이 부족해 로또 번호를 생성할 수 없습니다.");
		}

		while (money >= 1000 && lottoCheck) {
			System.out.println("1. 로또 생성 | 2. 로또 조회 | 3. 종료");
			System.out.println("입력>");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				// 로또 생성
				for (int i = 0; set.size() < 6; i++) {
					int lottoNum = (int) (Math.random() * 45) + 1;
					i-=1;
					set.add(lottoNum);
				}
				break;
			case 2:
				// 로또 조회(내가 투입한 금액과 출력 번호)
				for (int i = 0; i < money / 1000; i++) {
					LinkedList<Integer> list = new LinkedList<Integer>(set);
					Collections.sort(list);
					System.out.println("로또 번호 : " + list);
				}
				System.out.println("내가 투입한 금액 : " + money);
				money -= 1000;
				break;

			case 3:
				lottoCheck = false;
				System.out.println("프로그램 종료");
				break;
			}
			if (money < 1000) {
				System.out.println("금액이 부족해 더이상 로또 번호를 생성할 수 없습니다.");
			}
		}

	}
}
