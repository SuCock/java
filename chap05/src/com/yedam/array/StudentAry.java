package com.yedam.array;

import java.util.Scanner;

public class StudentAry {
	public static void main(String[] args) {
		// 한 학생의 성적을 입력
		// 과목 수
		int subjectNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=======================================================");
			System.out.println("1. 과목 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("=======================================================");
			System.out.println("메뉴 입력>");

			int selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) {
				// 몇 과목을 쳤는지에 대한 과목수는 배열의 크기를 의미한다
				subjectNum = Integer.parseInt(sc.nextLine());
			} else if (selectNo == 2) {
				//배열 크기를 여기에 설정하면 수정 할 수 있다
				scores = new int [subjectNum];
				// 데이터 입력
				for(int i = 0; i<scores.length; i++) {
				scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if (selectNo == 3) {
				// 출력
				for(int i = 0; i<scores.length; i++) {
				System.out.println((i+1)+"번째 점수는 "+scores[i]);
				}
			} else if (selectNo == 4) {
				// 입력한 값의 평균과 총합
				int sum = 0;
				for(int i = 0; i<scores.length; i++) {
					sum += scores[i];
				}
				double avg = (double)sum/scores.length;
				System.out.println("점수의 총 합은 : "+sum);
				System.out.println("점수의 평균은 : "+ avg);
					
			} else if (selectNo == 5) {
				System.out.println("end of prog");
				break;
			}

		}

	}
}
