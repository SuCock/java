package 권수민_HomeWork;

import java.util.Scanner;
public class homeWork4Method {
	private static Scanner sc = new Scanner(System.in);
	
	static Item[] itemAry = null;
	static int itemNo= 0;
	public static int itemNum() {
		
		
			System.out.println("상품 수>");
			int itemNum = Integer.parseInt(sc.nextLine());
			itemAry= new Item[itemNum];
			return itemNum;
		
	}
	public static String itemName() {
		
		
		System.out.println("상품명, 가격입력>");
		for(int i = 0; i<itemAry.length;i++) {
			String b = sc.nextLine();
			int a = Integer.parseInt(sc.nextLine());
			Item i1 = new Item (b,a);
			itemAry[i]=i1;
			return itemName;
		}
}
	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		

	
	while (true) {
		System.out.println("============================================================");
		System.out.println("1. 상품 수 | 2. 상품 및 가격입력 | 3. 재품별 가격 | 4. 분석 | 5. 종료");
		System.out.println("============================================================");
		int itemNo = Integer.parseInt(sc.nextLine());
		
	}

		
		if(itemNo == 1) {
			itemNum();
		}else if (itemNo == 2) {
			itemName();
		}else if (itemNo == 3) {
			for (Item i1 : itemAry) {
				i1.getInfo();
			}
		}else if (itemNo == 4) {
			int max = 0;
			int sum = 0;
			for(int i = 0; i<itemAry.length; i++) {
				max = itemAry[0].price;
				if(max<itemAry[i].price) {
				max = itemAry[i].price;
				}
				sum += itemAry[i].price;	
			}
			System.out.println("최고 가격 : "+ max+ "나머지 총 합 : "+ (sum-max));
			}
		else if (itemNo == 5) {
			System.out.println("프로그램 종료");
			break;
		}
	}
	}

