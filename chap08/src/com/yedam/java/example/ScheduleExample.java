package com.yedam.java.example;

import java.util.Scanner;

public class ScheduleExample {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);   //배열, 페이스, 인터페이스만 null값으로 초기화 가능 
														//-> 배열은 대괄호가 없음으로 탈락, new연산자는 기본 클래스만 만들 수 있다 
			Scheduler scheduler = null;  //스케줄러는 인터페이스일 확률이 높다
										//만약 클래스로 만들어야 한다면 추상클래스로 만들어야 한다
										//스케줄러 변수가 체크하는 곳이 없다 -> 추상메소드를 품어야 함으로 인터페이스
			
			System.out.println("전화 상담 할당 방식을 선택하세요.");
			System.out.println("R : 한명씩 차례로 할당 ");
			System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
			System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
			
			
			String ch = scanner.next();
			
			if("R".equals(ch) || "r".equals(ch) ) {
				scheduler = new RoundRobin();   //자동 타입 변환이 일어나는 관계(연산자가 없다)
			}else if("L".equals(ch) || "l".equals(ch) ) {
				scheduler = new LeastJob();
			}else if("P".equals(ch) || "p".equals(ch)) {
				scheduler = new PriorityAllocation();
			}else {
				System.out.println("지원되지 않는 기능입니다.");
				return;
			}
			
			scheduler.getNextCall();        // 상담원 : 다음 콜의 기준    
			scheduler.sendCallToAgent();	// 배분방법
		}
	}

