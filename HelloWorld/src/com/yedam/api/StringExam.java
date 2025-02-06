package com.yedam.api;

public class StringExam {
	public static void main(String[] args) {
		연습();
		no1();
		no2();
		no3();
	}
	static void 연습() {
		String str = "hello";
		String str1 = "world";
		StringUtil.연결하기(str,str1);
	}
	
	static void no1() {
		String ssn1 = "0209091230123";
		String ssn2 = "020909 3230123";
		String ssn3 = "020909-4230124";
		StringUtil.checkGender(ssn1);
		StringUtil.checkGender(ssn2);
		StringUtil.checkGender(ssn3);
	}
	static void no2() {
		String file1 = "C:/temp/flower.jpg";
		String file2 = "D:/web/project/guide.mp3";
		StringUtil.checkExtesion(file1);
	}
	
	static void no3() {
		String str1 = " suggest ";
		String str2 = " currently ";
		String str3 = " particular ";
		StringUtil.getLength(str3);
	}
}
