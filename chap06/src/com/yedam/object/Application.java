package com.yedam.object;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		// 클래스 생성해서 객체 만든 다음 객체 바로 사용
		// 객체를 하 ㄴ곳이 모아서 관리하는 형태
		// 배열
		// int[] atty = new int[40
		// student[] = nes Stduent[10];

		// 학생 정보 보관하는 배열
		Student[] stdAry = null;
		int stdNum = 0;
		Scanner sc = new Scanner(System.in);
		// while문을 활용해서 학생 관리 프로그램 작성
		while (true) {
			System.out.println("=====================================================");
			System.out.println("1. 학생 수 | 2. 정보 입력 | 3. 정보 확인 | 4. 분석 | 5. 종료");
			System.out.println("=====================================================");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				// Student 클래스로 만들어지는 객체를 몇개나 배열에 넣을지
				// 에 대한 값을 받아옴.
				System.out.println("학생 수> ");
				stdNum = Integer.parseInt(sc.nextLine());
			} else if (selectNo == 2) {
				stdAry = new Student[stdNum];
				for (int i = 0; i < stdAry.length; i++) {
					// 객체 배열에 각 인덱스에 존재하는 student객체에게
					// 데이터를 제공하기 위해서 임시 객체를 만듦.
					stdAry[i] = new Student(); // null에는 데이터를 못넣으니깐 배열을 만들어준다.
					System.out.println("이름>");
					stdAry[i].name = sc.nextLine();
					System.out.println("나이>");
					stdAry[i].age = Integer.parseInt(sc.nextLine());
					System.out.println("학교>");
					stdAry[i].schoolName = sc.nextLine();
					
					//성적 입력
					System.out.println("국어>");
					stdAry[i].kor = Integer.parseInt(sc.nextLine());
					System.out.println("영어>");
					stdAry[i].eng = Integer.parseInt(sc.nextLine());
					System.out.println("수학>");
					stdAry[i].meth = Integer.parseInt(sc.nextLine());

				}

			} else if (selectNo == 3) {
				for (Student std : stdAry) {
					std.getInfo();
				}
			} else if (selectNo == 4) {
				// 총합, 평균
				int total = 0;
				double avg = 0;
				System.out.println("전체 학생 총합/평균 조회");
				for (int i = 0; i < stdAry.length; i++) {
					total = stdAry[i].kor + stdAry[i].eng + stdAry[i].meth;
					avg = total / 3.0;
					System.out.println((i + 1) + "번째 학생>");
					System.out.println("총합 : " + total + "평균 : " + avg);
				}
				
				//시험 젤 잘 친 과목, 못 친 과목 확인
				int max = 0;
				int min = 0;
				for(int i = 0; i<stdAry.length; i++) {
							max = stdAry[i].kor;
							min = stdAry[i].kor;
						if(stdAry[i].eng < stdAry[i].meth) {
							if(max < stdAry[i].meth) {
								max = stdAry[i].meth;
							}
						}else {
							if(max < stdAry[i].eng) {
								max = stdAry[i].eng;
							}
						}if(stdAry[i].eng > stdAry[i].meth) {
							if(min < stdAry[i].meth) {
								min = stdAry[i].meth;
							}
						}else {
							if(min > stdAry[i].eng) {
								min = stdAry[i].eng;
							}
						}
						System.out.println(stdAry[i].name + "최고 성적 : " + max);
						System.out.println(stdAry[i].name + "최저 성적 : " + min);
						
				}
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}

//		Student s1 = new Student();
//		
//		Student s2 = new Student();
//		System.out.println(s1);
//		System.out.println(s2);
//		
		// dot 연산자(점)
//		s1.age = 20;
//		s1.name = "예담";
//		s1.schoolName = "예담대학교";
//		
//		s1.getInfo();
//		
//		s2.age = 30;
//		s2.name = "대예담";
//		s2.schoolName = "예담대학원";
//		
//		s2.getInfo();

//		s1.getInfo();
//		
//		s1.age = 20;
//		s1.name = "대학생";
//		System.out.println(("학생의 나이 : "+ s1.age));
//		System.out.println(("학생의 이름 : "+ s1.name));
//		System.out.println(("재학중인 학교 : "+ s1.schoolName));
//		

//		Korean k1 = new Korean("김또치", "001111-0147852");
//		
//		System.out.println("k1이 가지고 있는 필드 값>");
//		System.out.println(k1.nation);
//		System.out.println(k1.name);
//		System.out.println(k1.ssn);

//		Book java = new Book( 24000,  "yedam-001");
//		Book linux = new Book( 32000,  "yedam-002");
//		
//		System.out.println("혼자공부하는 자바");		
//		java.getInfo();
//		System.out.println("\t");
//		System.out.println("이것이 리눅스다");		
//		linux.getInfo();

//		Car c1 = new Car();
//		System.out.println("c1.company : " + c1.company);
//		System.out.println();
//		Car c2 = new Car("자가용");
//		System.out.println("c2.company : " + c2.company);
//		System.out.println("c2.model : " + c2.model);
//		System.out.println();

//		Calculator ca = new Calculator();
//		ca.sub(1, 1);
//		double result = ca.sub(1, 1);
//		System.out.println(result);
//		
//		ca.powerOn();
//		ca.powerOff();

//		int sumResult = ca.sum2(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		System.out.println("총 합 : " + sumResult);
//		sumResult = ca.sum2(1, 2, 3, 4, 5);
//		System.out.println("총 합 : " + sumResult);

//		Score sc = new Score(50,30,70);
//		sc.getInfo();
//		
//		System.out.println("A");
//		System.out.println(1);
//		System.out.println("C");
//		System.out.println("0.1");
//		System.out.println("true");

	}
}
