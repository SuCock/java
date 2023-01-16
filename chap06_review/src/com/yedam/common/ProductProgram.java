package com.yedam.common;

import java.util.Scanner;

import com.yedam.java.Product;

public class ProductProgram {

	public ProductProgram() {
		Scanner sc = new Scanner(System.in);
		Product[] list = null;
		int productNum = 0;

		boolean run = true;
		while (run) {
			System.out.println("===1. 상품 수 | 2. 상품 및 가격입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료===");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("상품 수> "); // 배열의 크기를 정할려고 중간에 변동이 안된다
				productNum = Integer.parseInt(sc.nextLine());
				list = new Product[productNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < list.length; i++) {
					System.out.println("상품 명> ");
					String name = sc.nextLine();
					System.out.println("상품 가격> ");
					int price = Integer.parseInt(sc.nextLine());

					Product product = new Product(name, price);

					list[i] = product; // for문안에 product를 선언했음으로 for문안에 배열을 넣어준다
				}

			} else if (selectNo == 3) { // 향상된 for문 => 순환하는것에 쓰기좋다(index), index상관없이 처음부터 끝까지 봐야할때 (홀수, 짝수)
				for (Product temp : list) {
					System.out.printf("%s : %d\n", temp.getProName(), temp.getProPrice());
				}
			} else if (selectNo == 4) {
				int max = 0;
				int productIndex = 0;
				for (int i = 0; i < list.length; i++) {
					Product product = list[i];
					if (max < product.getProPrice()) {
						max = product.getProPrice();
						productIndex = i;

					}
				}
				int sum = 0;
				for (int i = 0; i < list.length; i++) {
					if (i == productIndex)
						continue;
					//if문과 상관없다
					Product product = list[i];
					sum += product.getProPrice();
					
					//sum을 풀어서 쓰면
//					if ( i != productIndex) {
//						Product product = list[i];
//						sum += product.getProPrice
//					}
				}
				System.out.println("최고 가격을 가진 제품은 " + list[productIndex].getProName() + "입니다.");  //list의 productIndex의 번호를 가진 product클래스 변수
				System.out.println("최고 가격을 제외한 제품들의 합은" + sum + "입니다.");
				
			} else if (selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			} else {
				System.out.println("메뉴를 잘못 선택했습니다.");
			}
		}

	}
}