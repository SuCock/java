package com.yedam;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmpMain {
	static EmpDAO dao = new EmpDAO();
	static Scanner scn = new Scanner(System.in);

	public void exe() {

		while (true) {
			System.out.println("=== 1.목록조회 | 2. 단건조회 | 3. 입력 | 4. 급여변경 | 5. 삭제 | 9. 종료 ===");
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 5) {
				remove();
			} else if (menu == 4) { // 사원번호, 급여, 입력. updateEmp(int id, int sal)
				modify();
			} else if (menu == 3) {
				add();
			} else if (menu == 2) {
				// 단건조회.
				search();
			} else if (menu == 1) {
				// 목록조회.
				list();
			} else if (menu == 9) {
				// 종료.
				break;
			}
		}// end of while
		System.out.println("end of program.");

	}// end of main()

	// 목록조회
	public void list() { // static메소드 or 인스턴스메소드 구분필요!
		List<Map<String, Object>> result = dao.empList(); // 반환유형.
//		for (Map<String, Object> map : result) {
//			System.out.println("사원번호 : " + map.get("emp_id") + ", 이름 : " + map.get("first_name") + "-"
//					+ map.get("last_name"));
//		}
		List<EmpVO> list = dao.empVoList();
		for (EmpVO emp : list) {
			System.out.println(emp.toString());
		}
	}

	// 단건조회
	public void search() {
		System.out.println("조회할 사원 번호 입력>> ");
		int id = Integer.parseInt(scn.nextLine());
		// 사용자 입력값을 받아서 처리.

		EmpVO emp = dao.getEmp(id);
		if (emp == null) {
			System.out.println("조회된 정보 없음.");
			//continue;
		}
		; // 반환유형: EmpVO
		System.out.println("결과 : " + emp);
	}

	// 입력. add
	public void add() {
		// 입력처리. :=> 사번, last_name, email, hire_date, 직무 not null항목들.
		System.out.println("사번입력>> ");
		int eid = Integer.parseInt(scn.nextLine());
		System.out.println("이름입력>> ");
		String name = scn.nextLine();
		System.out.println("이메일입력>> ");
		String mail = scn.nextLine();
		System.out.println("입사일자입력>> ");
		String hDate = scn.nextLine();
		System.out.println("직무입력>> ");
		String job = scn.nextLine();

		EmpVO emp = new EmpVO();
		emp.setEmployeeId(eid);
		emp.setLastName(name);
		emp.setEmail(mail);
		emp.setHireDate(hDate);
		emp.setJobId(job);

		if (dao.addEmp(emp) > 0) {
			System.out.println("입력완료!!");
		} else {
			System.out.println("처리 중 에러발생!!");
		}
		;
	}

	// 수정. modify
	public void modify() {
		System.out.println("사원번호 입력>> ");
		int eid = Integer.parseInt(scn.nextLine());
		System.out.println("변경 할 급여 입력>> ");
		int sal = Integer.parseInt(scn.nextLine());

		if (dao.updateEmp(eid, sal) > 0) {
			System.out.println("수정완료!!");
		} else {
			System.out.println("처리 중 에러발생!!");
		}
		;

	}

	// 삭제. remove
	public void remove() {
		System.out.println("삭제 할 사원번호 입력>> ");
		int eid = Integer.parseInt(scn.nextLine()); // return값이 문자열이다
		if (dao.deleteEmp(eid) > 0) {
			System.out.println("삭제완료!!");
		} else {
			System.out.println("처리 중 에러발생!!");
		}
		;
	}
}
