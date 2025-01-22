package com.yedam;

import java.util.Scanner;

/*
 * 친구정보 관리 앱 v.1
 * 이름, 연락처, 성별(남,여) => 홍길동,010-1234-5678, 남.
 * 1.목록 (이름,연락처,성별) 2.등록 3.조회(성별) 4.삭제(이름) 5.수정(이름):연락처를 수정 9.종료
 * String[]	friendAry 크기는 100개 ;
 */
public class Todo2 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		String[] friendAry = new String[100];

		while (run) {
			System.out.println("1.이름,연락처,성별 2.등록 3.조회(성별) 9.종료");
			System.out.print("메뉴를 선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());
			
			
			switch (menu) {
			case 1:
				for (int i = 0; i < friendAry.length; i++) {
					if(friendAry[i] != null) {
						System.out.printf(friendAry[i]);
					}
				}
				break;
			case 2:
				for (int i = 0; i < friendAry.length; i++) {
					System.out.print("이름, 연락처, 성별을 입력하세요.>> ex) 홍길동, 010-xxxx-xxxx, 남or여 >>");
					friendAry[i] = scn.nextLine();
				}
				break;
			case 3:
				String searchName = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						if (friendAry[i].split(",")[0].equals(searchName)) {
							System.out.printf("%s의 성별은 %s입니다.\n",searchName, friendAry[i].split(",")[2]);
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
	}
}
