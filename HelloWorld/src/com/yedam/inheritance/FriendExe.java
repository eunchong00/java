package com.yedam.inheritance;

import java.util.Scanner;
/*
 * 친구목록, 등록, 수정, 삭제.
 * 수정: 이름, 연락처 입력.
 */

public class FriendExe {
	// 싱글톤.
	// 1. 필드선언.
	private static FriendExe instance = new FriendExe();

	// 2. 생성자 은닉.
	private FriendExe() {
	}

	// 인스턴스를 반환하는 메소드.
	public static FriendExe getInstance() {
		return instance;
	}

	Friend[] friends = new Friend[100]; // 저장공간.

	//초기데이터.
	public void init() {
		// 초기데이터
		friends[0] = new Friend("홍길동", "010-1111-2222");
		friends[1] = new UnivFriend("김민수", "010-2222-1111", "예담", "역사학과");
		friends[2] = new ComFriend("박민규", "010-3333-4444", "구글", "개발팀");
	}

	Scanner scn = new Scanner(System.in);

	// 시작메소드.
	public void run() {
		boolean run = true;
		while (run) {
			System.out.println("1.친구목록 2.등록 3.수정 4.삭제 9.종료");
			System.out.print("메뉴선택>> ");
			int menu = scn.nextInt();

			switch (menu) {
			case 1:// 목록.
				friendList();
				break;
			case 2:// 등록.
				addFriend();
				break;
			case 3:// 수정.
				editFriend();
				break;
			case 4:// 삭제.
				delFriend();
				break;
			case 9:// 종료.
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 확인하세요.");
			}
		}
	} // end of run().

	// 추가 메소드.
	void friendList() {
		boolean isExit = true;
		System.out.println("친구목록");
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i].showInfo());
			isExit = true;
//			if (friends[i] != null) {
//				if (friends[i] instanceof Friend) {
//					System.out.println("이름:" + friends[i].getFriendName());
//				} else if (friends[i] instanceof UnivFriend) {
//
//				}
			}
		
		if(!isExit) {
			System.out.println("	 - no data -	 ");
		}
	}// end of FriendList.

	// 친구: 이름. 연락처
	// 학교: 친구+학교명+전공.
	// 회사: 친구+회사명+부서.
	String name = "";
	String phone = scn.nextLine();
	void addFriend() {
		while (true) {
			

			System.out.println("1.친구 2.학교친구 3.회사친구 4.종료");
			System.out.print("선택>> ");
			int choice = scn.nextInt();
			scn.nextLine();
			
			if (choice == 4) {
				return;
			}

			if (choice > 3 || choice < 1) {
				System.out.println("메뉴를 확인하세요.");
			}
			while (true) {
				// 이름, 연락처.
				System.out.print("이름을 입력하세요 >");
				name = scn.nextLine();
				// 이름의 정상값의 범위.
				if (name.length() >= 2 && name.length() <= 10) {
					break;
				} else {
					System.out.print("이름은 2글자 이상 10글자 이하...");
				}
			}
			System.out.print("연락처를 입력하세요 >");

			Friend friend = null;
			if (choice == 1) {
				friend = new Friend(name, phone);

			} else if (choice == 2) {// 학교, 전공
				System.out.print("학교입력>> ");
				String univ = scn.nextLine();
				System.out.print("전공입력>> ");
				String major = scn.nextLine();
				friend = new UnivFriend(name, phone, univ, major);

			} else if (choice == 3) {// 회사, 부서
				System.out.print("회사입력>> ");
				String univ = scn.nextLine();
				System.out.print("부서입력>> ");
				String major = scn.nextLine();

				friend = new ComFriend(name, phone, univ, major);
			} else {

			}
			// 빈공간에 저장.
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = friend;
					System.out.println("등록완료.");
					break;
				}
			}
		}
	}// end of addFriend.

	void editFriend() {
		boolean isExit = false;
		System.out.print("이름을 입력하세요 >");
		name = scn.nextLine();
		
		System.out.println("친구수정");
		// 친구연락처 
		for (int i=0;i< friends.length;i++) {
			if(friends[i] !=null && friends[i].getFriendName().equals(name)) {
				System.out.print("새로운연락처를 입력하세요 >");
				friends[i].setPhoneNumber(phone);
				System.out.println("수정완료.");
				isExit = true;
				break;
			}
		}
		if (!isExit) {
			System.out.println("찾는 정보가 없습니다.");
		}
	}// end of editFriend.

	void delFriend() {
		
		System.out.println("친구삭제");
	}// end of delFriend.
}
