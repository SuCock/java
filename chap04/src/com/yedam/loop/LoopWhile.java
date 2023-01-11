package com.yedam.loop;

import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		// 1~100사이의 2의 배수
//		int i = 1;
//		while (i <= 100) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//		// 계산기 프로그램
//		// 무한 루프 조건으로 프로그램 실행
//		// event, trigger(방아쇠, 이슈발생) 프로그램 종료->break
//		boolean run = true; // 종료시킬 무언가
		Scanner sc = new Scanner(System.in);
//		while (run) {
//			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
//			System.out.println("입력>");
//
//			int num = Integer.parseInt(sc.nextLine());
//			switch (num) {
//			case 1:
//				System.out.println("더하고자 하는 두수를 입력>");
//				System.out.println("1>");
//				int num1 = Integer.parseInt(sc.nextLine());
//				System.out.println("2>");
//				int num2 = Integer.parseInt(sc.nextLine());
//				int result = num1 + num2;
//				System.out.println(num1 + " , " + num2 + "의 결과" + result);
//				break;
//			case 2:
//				System.out.println("빼고자 하는 두수를 입력>");
//				int num3 = 0;
//				int num4 = 0;
//				while (true) {
//					System.out.println("1>");
//					num3 = Integer.parseInt(sc.nextLine());
//					System.out.println("2>");
//					num4 = Integer.parseInt(sc.nextLine());
//					if (num3 > num4) {
//						break;
//					} else {
//						System.out.println("수를 다시 입력하세요");
//					}
//				}
//				int result2 = num3 - num4;
//				System.out.println(num3 + " , " + num4 + "의 결과" + result2);
//			case 3:
//				System.out.println("더하고자 하는 두수를 입력>");
//				System.out.println("1>");
//				int num5 = Integer.parseInt(sc.nextLine());
//				System.out.println("2>");
//				int num6 = Integer.parseInt(sc.nextLine());
//				int result3 = num5 * num6;
//				System.out.println(num5 + " , " + num6 + "의 결과" + result3);
//				break;
//			case 4:
//				run = false;
//				break;
//			default:
//				System.out.println("1~4사이 수를 입력해주세요.");
//				break;
//			}
//		}
//		System.out.println("end of program");

		// 게임 만들기
		// 컴퓨터와 가위, 바위, 보
		// 컴퓨터와 앞,뒤 맞추기
		// 한 판에 500원
		int money;
		System.out.println("====insert coin====");
		money = Integer.parseInt(sc.nextLine());
		// 10000원 -> 20번
		// 1500 -> 3번
		boolean flag = true;
		// money > 500 flag : 종료용(false)
		while (money >= 500 && flag) {

			System.out.println((money / 500) + "번의 기회가 남았습니다.");
			System.out.println("1. 가위바위보 | 2. 앞,뒤 맞추기 | 3. 종료");

			System.out.println("입력>");
			int gameNo = Integer.parseInt(sc.nextLine());

			switch (gameNo) {
			case 1:
				// 컴퓨터와 가위, 바위, 보
				// 가위 -> 1
				// 바위 -> 2
				// 보 -> 3
				// 컴퓨터가 내는 가위, 바위, 보 => 랜덤 값 추출
				// 입력 한 값이랑 비교해서 이겼다, 졌다, 비겼다.
				// 가위, 바위, 보 || String.equals(내용)

				System.out.println("가위, 바위, 보 중에서 하나를 입력하세요.");
				String RSP = sc.nextLine();
				// 가위 -> 1, 바위 -> 2, 보 -> 3 랜덤값
				int randomNo = (int) (Math.random() * 3) + 1;

				if (RSP.equals("가위")) {
					// 사용자: 가위, 컴퓨터: 1(가위)
					if (randomNo == 1) {
						System.out.println("비겼다.");
						// 사용자: 가위, 컴퓨터: 2(바위)
					} else if (randomNo == 2) {
						System.out.println("졌다.");
						// 사용자: 가위, 컴퓨터: 3(보)
					} else if (randomNo == 3) {
					}
					System.out.println("이겼다.");
				} else if (RSP.equals("바위")) {
					if (randomNo == 1) {
						// 사용자: 바위, 컴퓨터: 1(가위)
					}
					System.out.println("이겼다.");
				} else if (randomNo == 2) {
					// 사용자: 바위, 컴퓨터: 2(바위)
					System.out.println("비겼다.");
				} else if (randomNo == 3) {
					// 사용자: 바위, 컴퓨터: 3(보)
					System.out.println("졌다.");
				} else if (RSP.equals("보")) {
					if (randomNo == 1) {
						// 사용자: 보, 컴퓨터: 1(가위)
					}
					System.out.println("졌다.");
				} else if (randomNo == 2) {
					// 사용자: 보, 컴퓨터: 2(바위)
					System.out.println("이겼다.");
				} else if (randomNo == 3) {
					// 사용자: 보, 컴퓨터: 3(보)
					System.out.println("비겼다.");
				}
				money -= 500;
				break;
			case 2:
				// 컴퓨터와 앞,뒤 맞추기
				// 앞 -> 1
				// 뒤 -> 2
				// 컴퓨터가 내는 앞 뒤 => 랜덤 값 추출
				// 입력 한 값이랑 비교해서 이겼다, 졌다
				System.out.println("앞, 뒤중 하나를 적어주세요.");
				String coin = sc.nextLine();
				// 앞 = 1, 뒤 = 2
				int randomFB = (int) (Math.random() * 2) + 1;
				if (coin.equals("앞")) {
					if (randomFB == 1) {
						System.out.println("맞췄다.");
					} else if (randomFB == 2) {
						System.out.println("틀렸다.");
					}
				}
				if (coin.equals("뒤")) {
					if (randomFB == 1) {
						System.out.println("틀렸다.");
					} else if (randomFB == 2) {
						System.out.println("맞췄다.");
					}
				}
				money -= 500;
				break;
			case 3:
				// 종료 1) 투입한 금액이 소진이 다 되었을때
				// 2) 강제 종료
				flag = false;
				break;
			default:
				System.out.println("없는 메뉴 입니다. 다시 입력하세요.");
			}
		}
		// 거스름돈이 남으면 출력이 되도록
		if (money < 500) {
			System.out.println("금액이 부족해 더이상 게임 진행 불가합니다.");
		}
		System.out.println("게임 종료.");

	}

}
