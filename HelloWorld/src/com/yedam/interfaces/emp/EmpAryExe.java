package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * 배열활용.
 */
public class EmpAryExe implements EmpDAO {

    Employee[] employees = new Employee[10]; // 저장.

	public EmpAryExe() {
		// 초기값.
		employees[0] = new Employee(1001, "홍길동", "432-1234", "2000-01-03", 250);
		employees[1] = new Employee(1023, "박길동", "432-3245", "2000-01-03", 250);
		employees[2] = new Employee(1017, "김길동", "432-4353", "2000-01-03", 250);
		employees[3] = new Employee(1020, "박사장", "432-6766", "2000-01-03", 500);
	}

	@Override
	public boolean registerEmp(Employee emp) {

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				employees[i] = emp;
				return true;
				
			}
		}
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < employees.length; i++) {
			// 사원번호 비교.
			if (employees[i] != null && employees[i].getEmpNo() == emp.getEmpNo()) {
				// 연락처값이 "" 이 아닐때 변경.
				if (!emp.getTelNo().equals("")) {
					employees[i].setTelNo(emp.getTelNo());
				}
				try {
					if (emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						employees[i].setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				if (emp.getSalary() != 0) {
					employees[i].setSalary(emp.getSalary());
				}
				return true; // 정상수정.
			}
		}
		return false; // 수정 못함.
	}

	@Override
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getEmpNo() == empNo) {
				employees[i] = null; // 삭제.
				return true;
			}
		}
		return false;
	}

	@Override
	public Employee[] search(Employee emp) {
		Employee[] result = new Employee[10];
		int idx = 0;
		String name = emp.getEmpName();

		for (int i = 0; i < employees.length; i++) {
			// indexOf
			if (employees[i] != null && employees[i].getEmpName().indexOf(name) >= -1) {
				result[idx] = employees[i];
				idx++; // 0부터 1씩 증가.
			}

		}
		return result;

	}
}
