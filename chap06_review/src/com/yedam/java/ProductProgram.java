package com.yedam.java;

import java.util.Scanner;

import com.yedam.java.Product;

public class ProductProgram {
//주석 처리한 부분이 다 메소드
	Scanner sc = new Scanner(System.in);
	private Product[] list = null;
	public ProductProgram() {
		while (true) {
			// 메뉴출력
			menuPrint();

			// 메뉴선택
			int selectNo = menuSelect();

			if (selectNo == 1) {
				// 상품 수 입력
				inputProducNum();

			} else if (selectNo == 2) {
				// 상품 및 가격 입력
				inputProductInfo();

			} else if (selectNo == 3) {
				// 제품별 가격 출력
				productInfoPrint();

			} else if (selectNo == 4) {
				// 분석한 결과
				productAnalysis();

			} else if (selectNo == 5) {
				// 프로그램 종료
				exit();
				break;  //메소드에 걸면 메소드만 중지되고 while문에는 영향을 주지 않아서 여기에 적어야한다
			} else {
				// 잘못된 메뉴를 선택한 경우 안내 메세지 출력ㄹ
				printErrorMessage();

			}
		}
	}

	private void printErrorMessage() {
		System.out.println("메뉴를 잘못 선택했습니다.");
		
	}

	private void exit() {
		System.out.println("프로그램을 종료합니다.");
		
	}

	private void productAnalysis() {
		int max = 0;
		int productIndex = 0;
		for (int i = 0; i < list.length; i++) {
			Product product = list[i];
			if (max < product.getProPrice()) {
				max = product.getProPrice();
				productIndex = i;

			}
		}
	}

	private void productInfoPrint() {
		for (Product temp : list) {
			System.out.printf("%s : %d\n", temp.getProName(), temp.getProPrice());
		}
	}

	private void inputProductInfo() {
		for (int i = 0; i < list.length; i++) {
			System.out.println("상품 명> ");
			String name = sc.nextLine();
			System.out.println("상품 가격> ");
			int price = Integer.parseInt(sc.nextLine());

			Product product = new Product(name, price);

			list[i] = product; // for문안에 product를 선언했음으로 for문안에 배열을 넣어준다
		}
	}

	private void inputProducNum() {
		System.out.println("상품 수> "); // 배열의 크기를 정할려고 중간에 변동이 안된다
		int productNum = Integer.parseInt(sc.nextLine());
		list = new Product[productNum];
		
	}

	private int menuSelect() {
		System.out.println("선택> ");
		return Integer.parseInt(sc.nextLine());
	}

	private void menuPrint() {
		System.out.println("===1. 상품 수 | 2. 상품 및 가격입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료===");
		
	}
}