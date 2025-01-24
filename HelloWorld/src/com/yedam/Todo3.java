package com.yedam;

import java.util.Scanner;

public class Todo3 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		String[][] friendAry = new String[100][3];
//		String[][] friends = new String[100][3];
//		friendAry[0][0] = "홍길동";
//		friendAry[0][1] = "010-1234-5678";
//		friendAry[0][2] = "남";
//		friendAry[1] = new String[] {"김민수", "010-8765-4321", "여"};
		while (run) {
			System.out.println("1.목록 2.등록 3.조회(성별) 9.종료");
			System.out.print("메뉴를 선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && friendAry[i][0] != null) {
						System.out.printf("이름은 %s, 연락처는 %s, 성별은 %s\n", friendAry[i][0], friendAry[i][1],
								friendAry[i][2]);
					}
				}
				break;
			case 2:
				System.out.println("이름을 입력>>");
				String name = scn.nextLine();
				System.out.println("연락처를 입력>>");
				String phone = scn.nextLine();
				System.out.println("성별을 입력>>");
				String gender = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][0] == null) {
//						System.out.printf("i의 값[" + i + "] =>" + friendAry[i]);
						friendAry[i] = new String[] { name, phone, gender };

					}
					if (friendAry[i] != null && friendAry[i][0] != null) {
						System.out.printf("이름은 %s, 연락처는 %s, 성별은 %s\n", friendAry[i][0], friendAry[i][1],
								friendAry[i][2]);
					}

				}

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][0] != null) {
						friendAry[i][0] = name;
						friendAry[i][1] = phone;
						friendAry[i][2] = gender;
						System.out.printf("등록완료.");
						break;
					}
				}
				break;
			case 3:
				System.out.print("조회할 성별 입력> ex) 남 or 여");
				gender = scn.nextLine();

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][2] != null) {
						if (friendAry[i][2].equals(gender)) {
							System.out.printf("이름은 %s, 연락처는 %s, 성별은 %s\n", friendAry[i][0], friendAry[i][1],
									friendAry[i][2]);
						}
					}
				}
				break;
			case 4:

			case 5:

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
		System.out.println("end of prog.");
	}// end of main.
}
