package com.yedam.interfaces.emp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExe {
	
	static Scanner scn = new Scanner(System.in);
	static EmpDAO dao = new EmpAryExe();
	
	public static void main(String[] args) {
		// 스캐너, run.
		boolean run = true;

		// 배열, 컬렉션.

		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 9.종료");
			System.out.print("선택>> ");
			int menu = 0;

			try {
				menu = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("메뉴를 확인하세요.");
				scn.nextLine();
				continue;
			}
			scn.nextLine();
			switch (menu) {
			case 1: // 추가. 사원번호, 이름, 전화번호.
				int empNo = 0;
				while (true) {
					try {
						System.out.print("사원번호>> ");
						empNo = Integer.parseInt(scn.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("사원번호를 확인하세요.");
					}
				} // end of while.

				System.out.print("이름>> ");
				String eName = scn.nextLine();
				System.out.print("전화번호>> ");
				String tel = scn.nextLine();

				if (dao.registerEmp(new Employee(empNo, eName, tel))) {
					System.out.println("등록성공");
				}
				break; // end of case 1.
			case 2: // 수정항목: 전화번호, 입사일자, 급여. + 사원번호
				System.out.print("사원번호>> ");
				empNo = Integer.parseInt(scn.nextLine());
				System.out.print("전화번호>> ");
				tel = scn.nextLine();
				System.out.print("입사일자>> ");
				String hdate = scn.nextLine();
				
				if (hdate.equals("")) {
					hdate = "1900-01-01";
				}
				System.out.print("급여>> ");
				String salString = scn.nextLine();
				if (salString.equals("")) {
					salString = "0";
				}

				int sal = Integer.parseInt(scn.nextLine());

				if (dao.modifyEmp(new Employee(empNo, "", tel, hdate, sal))) {
					System.out.println("수정완료");
				}
				break; // case 2 종료.
			case 3: // 삭제.
				
				try {
					remove();
				} catch (NumberFormatException e) {
					System.out.println("사원번호 확인");
				}
				break;
				
			case 4: // 목록.
				// 조회조건(급여 이상)
//				System.out.print("조회 급여조건>> ");
//				sal = Integer.parseInt(scn.nextLine());
				System.out.print("조회 이름조건>> ");
				eName = scn.nextLine();

				Employee emp = new Employee();

				emp.setEmpName(eName); // empName 필드 저장.

//				emp.setSalary(sal); // salary 필드 저장.

				// 조회결과.
				Employee[] result = dao.search(emp);
				// 출력.
				System.out.println("사번  이 름  연락처    급여");
				System.out.println("-----------------------");
				
				for (Employee empl : result) {
					if (empl != null) {
						System.out.println(empl.empInfo());
					}
				}
				break;
			case 9:
				System.out.println("종료합니다");
				run = false;
				break;
			default:
				System.out.println("메뉴를 확인하세요.");
			}

		} // end of while.
		System.out.println("end of prog.");

	}// end of main.

	// 예외 떠넘기기 예제.
	static void remove() throws NumberFormatException {
		System.out.print("사원번호>> ");
		int empNo = Integer.parseInt(scn.nextLine());
		if (dao.removeEmp(empNo)) {
			System.out.println("삭제완료");
		}
	} // end of remove.

}// end of prog.
