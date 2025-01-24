package com.yedam.reference;

import java.util.Scanner;

public class ReferenceExe3 {
	public static void main(String[] args) {
		exe();
	} // end of main.
	
	public static void exe() {
		Scanner scn = new Scanner(System.in);
		// 이름, 연락처, 성별 => 100개 공간.
		String[][] friends = new String[100][3];
		friends[0][0] = "홍길동";
		friends[0][1] = "010-1234-5678";
		friends[0][2] = "남";
		friends[1] = new String[] {"김민수", "010-8765-4321", "남"};
		
		System.out.println("이름을 입력>>");
		String name = scn.nextLine();
		System.out.println("연락처를 입력>>");
		String phone = scn.nextLine();
		System.out.println("성별을 입력>>");
		String gender = scn.nextLine();
		
//		friends[1] = "홍길동";
//		friends[1][1] = "010-1234-5678";
//		friends[1][2] = "남";
		
		for(int i=0;i<friends.length;i++) {
			if(friends[i] !=null && friends[i][0] !=null) {
				System.out.printf("이름은 %s, 연락처는 %s, 성별은 %s\n"
						, friends[i][0], friends[i][1], friends[i][2]);
			}
		}
		
	}
}
