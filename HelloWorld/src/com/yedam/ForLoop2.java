package com.yedam;

import java.util.Scanner;

public class ForLoop2 {
	public static void main(String[] args) {
		String[] infoAry = "홍길동, 80, 85".split(",");
		System.out.println(infoAry[0]);
		System.out.println(infoAry[1]);
		System.out.println(infoAry[2]);

//		System.out.println(Integer.parseInt(infoAry[1]));

//		String[] strAry = new String[10];
//		strAry[0] = "홍길동";
//		String name = "김길동";
//		for (int i = 0; i < strAry.length; i++) {
//			if (strAry[i] == null) {
//				strAry[i] = name;
//				break;
//			}
//		}
//
//		for (int i = 0; i < strAry.length; i++) {
//			if (strAry[i] != null) {
//				System.out.println(strAry[i]);
//			}
//		}

		Scanner scn = new Scanner(System.in);

		String[] studentAry = new String[3];
		studentAry[0] = "홍길동,80";
		studentAry[1] = "김길동,96";
		studentAry[2] = "창길동,92";
		
		boolean run = !true;

		while (run) {
			System.out.println("1.학생이름,점수 2.최고점수 3.학생입력(한건씩) 4.조회(이름) 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				for (int i = 0; i < studentAry.length; i++) {
					System.out.print("이름, 점수를 입력하세요>> ex) 홍길동, 80 >");
					studentAry[i] = scn.nextLine();
				}

				break;
			case 2:
				int max = 0;
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {
						int temp = Integer.parseInt(studentAry[i].split(",")[1]);
						if (max < temp) {
							max = temp;
						}
					}
				}
				System.out.printf("최고점수는 %d입니다.\n", max);
				break;
			case 3:
				System.out.print("이름, 점수를 입력하세요>> ex) 홍길동, 85 >");
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == null) {
						studentAry[i] = scn.nextLine();
						break;
					}
				}
			case 4:
				String searchName = scn.nextLine();
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {
						if (studentAry[i].split(",")[0].equals(searchName)) {
							System.out.printf("%s의 점수는 %s입니다.\n");
						}
					}
				
				}
				
				
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}

		} // end of while.

		System.out.println("end of prog.");

		scn.close();
	} // end of main.
} // end of class.
