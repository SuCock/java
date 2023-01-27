package com.yedam.java;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.yedam.EmpVO;

public class LoginMain {
	static MemDAO dao = new MemDAO();
	static Scanner sc = new Scanner(System.in);
	static String user;

	public static void main(String[] args) {

		System.out.println("┍━━━━━♥♠♣♦━━━━━┑");
		System.out.println("| Welcome Dart |");
		System.out.println("┕━━━━━♥♠♣♦━━━━━┙");
		while (true) {
			
			System.out.println("° 𐐪𐑂 ♡ 𐐪𐑂 1. 회원가입 | 2. 로그인 | 99. 종료 𐐪𐑂 ♡ 𐐪𐑂 °");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				// 회원가입
				add();
			} else if (menu == 2) {
				// 로그인
				login();
			} else if (menu == 99) {
				// 종료.
				break;
			}
		} // end of while
		System.out.println("∘◦ ✂ ———게임종료—–✂ ◦∘");
	}// end of main

//회원가입
	public static void add() {
		System.out.println("아이디 생성>> ");
		String id = sc.nextLine();
		System.out.println("비밀번호 생성>> ");
		String pass = sc.nextLine();
		System.out.println("이름 입력>> ");
		String name = sc.nextLine();
		System.out.println("주소 입력>> ");
		String addr = sc.nextLine();
		System.out.println("전화번호 입력>> ");
		String tel = sc.nextLine();

		MemVO mem = new MemVO();
		mem.setMemId(id);
		mem.setMemPass(pass);
		mem.setMemName(name);
		mem.setMemAddr(addr);
		mem.setMemTel(tel);

		if (dao.addMem(mem) > 0) {
			System.out.println("☆♬○♩●♪✧♩　회원이 되신걸 환영합니다　♩✧♪●♩○♬☆");
		} else {
			System.out.println("ヽ｀、☁ヽ｀처리 중 에러발생 ☂˚｡ ლ(ಥ益ಥლ、ヽ｀☽ヽ｀");
		}
		;
	}

	// 로그인
	public static void login() {
		// 로그인 페이지에서 넘겨준 userID와 userPassword를 받아서 로그인 판별
		System.out.println("아이디 입력>> ");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력>> ");
		String pass = sc.nextLine();

		if (dao.login(id, pass) >= 1) {
			System.out.println("⭑･ﾟﾟ･*:༅｡.｡༅:*ﾟ:*:✼✿　로그인 되었습니다 ✿✼:*ﾟ:༅｡.｡༅:*･ﾟﾟ･⭑");
			user = id;
			System.out.println("▁ ▂ ▃ ▄ ▅ ▆ ▇ ▌　"+user+"님 환영합니다　 ▌ ▇ ▆ ▅ ▄ ▃ ▂ ▁");

			while (true) {
				System.out.println("☆○o。1. 회원목록 | 2. 다트 던지기 | 3. 회원수정 | 4. 회원탈퇴 | 5. 로그아웃　。o○☆");
				int gMenu = Integer.parseInt(sc.nextLine());
				if (gMenu == 1) {
					// 회원목록
					memList();
				} else if (gMenu == 2) {
					// 다트 던지기
					playDart();
					System.out.println("・‥…━━━━━━━━━━━━━━━☆현재 등수 입니다☆━━━━━━━━━━━━━━━…‥・");
					System.out.println("╔═══════════ ∘◦ ☆ ◦∘ ══════════╗");
					memRK();
					System.out.println("╚═══════════ ∘◦ ❉ ◦∘ ══════════╝");
				} else if (gMenu == 3) {
					// 회원수정
					memModify();
				} else if (gMenu == 4) {
					// 회원탈퇴
					System.out.println("현재 아이디 : " + user);
					System.out.println("정말로 탈퇴하시겠습니까?");
					System.out.println("네 or yes를 적으시면 바로 회원님의 데이터가 삭제됩니다.");
					String check = sc.nextLine();
					if (check.equals("네") || check.equals("yes")) {
						if (dao.remove(user) > 0) {
							System.out.println("*̩̩̥͙　-•̩̩͙-ˏˋ⋆　회원님의 정보가 삭제되었습니다　⋆ˊˎ-•̩̩͙-　*̩̩̥͙");
							break;
						} else {
							System.out.println("\"ヽ｀、☁ヽ｀처리 중 에러발생 ☂˚｡ ლ(ಥ益ಥლ、ヽ｀☽ヽ｀\"");
						}
						;
					} else {
						System.out.println("☆.｡.:*　회원탈퇴가 취소되었습니다　.｡.:*☆");
						break;
					}
				} else if (gMenu == 5) {
					// 로그아웃.
					System.out.println("⋇⋆✦⋆⋇　로그아웃 되었습니다 ⋇⋆✦⋆⋇");
					break;
				}
			}
			// end of game while
		}
		;
	}

	// 회원목록
	public static void memList() {
		List<Map<String, Object>> list = dao.memList();
		for (Map<String, Object> mem : list) {
			System.out.println("╔═══════════ ∘◦ ✾ ◦∘ ══════════╗");
			System.out.println("아이디: " + mem.get("mem_id"));	
			System.out.println("이름: " + mem.get("mem_name"));	
			System.out.println("주소: " + mem.get("mem_addr"));	
			System.out.println("전화번호: " + mem.get("mem_tel"));	
			System.out.println("╚═══════════ ∘◦ ❈ ◦∘ ══════════╝");
		}
	}

	// 다트던지기
	public static void playDart() {
		System.out.println("✧༝┉┉┉┉┉˚*❋" + user + "님의 차례입니다 ❋*˚┉┉┉┉┉༝✧");
		System.out.println("0을 눌러서 다트핀을 던져주세요 q(≧▽≦q)>> ");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int pin = Integer.parseInt(sc.nextLine());
			int dart = (int) (Math.random() * 50) + 1;
			if (pin == 0) {
				System.out.println(dart + "!");
				sum += dart;
			}
		}
		System.out.println("♥*♡∞:｡.｡　획득한 총 점수는 : \" " + sum + " \"점 입니다　｡.｡:∞♡*♥");
		MemVO point = new MemVO();
		point.setMemPoint(sum);
		point.setMemId(user);
		dao.playDart(point);
	}

	// 등수
	public static void memRK() {
		List<Map<String, Object>> list = dao.memRK();
		for (Map<String, Object> mem : list) {
			System.out.println("아이디: " + mem.get("mem_id"));
			System.out.println("점수 : " + mem.get("mem_point"));
			
		}
	}

	// 회원수정
	public static void memModify() {
		System.out.println("현재 아이디 : " + user);
		System.out.println("새로운 비밀번호 입력>> ");
		String mpass = sc.nextLine();
		System.out.println("새로운 이름 입력>> ");
		String mname = sc.nextLine();
		System.out.println("새로운 주소 입력>> ");
		String maddr = sc.nextLine();
		System.out.println("새로운 전화번호 입력>> ");
		String mtel = sc.nextLine();

		MemVO mem = new MemVO();
		mem.setMemPass(mpass);
		mem.setMemName(mname);
		mem.setMemAddr(maddr);
		mem.setMemTel(mtel);
		mem.setMemId(user);

		if (dao.memModify(mem) > 0) {
			System.out.println("*＊✿❀　수정완료 ❀✿＊*");
		} else {
			System.out.println("\"ヽ｀、☁ヽ｀처리 중 에러발생 ☂˚｡ ლ(ಥ益ಥლ、ヽ｀☽ヽ｀\"");
		}
		;

	}

	// 회원탈퇴
		
	}

