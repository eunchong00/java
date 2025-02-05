package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.inheritance.ComFriend;
import com.yedam.inheritance.Friend;
import com.yedam.reference.Student;

/*
 * String[] strAry;
 * Collection 1) List 2) Set 3) Map
 */
public class Exe {
	public static void main(String[] args) {
		System.out.println("홍길동".indexOf("호")); // -1보다 큰 값.
		
		
		
		// 학생정보를 저장하는 컬렉션 (ArrayList) 선언.
		// 3명 추가.
		String[] friAry = new String[3];
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("홍길동", 38 , 34));
		students.add(new Student("김길동", 33,70));
		students.add(new Student("박길동",23,23));
		// 출력.
		
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println("이름: "  + students.get(i));
		}
	}
	void method() {
		String[] strAry = new String[10]; // 배열.
		List<String> strList = new ArrayList<String>(); // 컬렉션.
		List<Friend> friends = new ArrayList<Friend>(); // 
		
		friends.add(new Friend("홍길동", "010-1111"));
		friends.add(new ComFriend("김길동", "010-2222", "국민은행", "신응보증팀"));
		
		friends.remove(new Friend("홍길동", "010-111"));
		System.out.println("friends크기: " + friends.size());
		
		System.out.println(friends.get(1).getFriendName());

		// 추가.
		strList.add("안녕하세요");
		strList.add("Hello");
		strList.add("반갑습니다");
		System.out.println("strList크기: " + strList.size());

		// 삭제.
		strList.remove(0);
		strList.remove("Hello");

		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
