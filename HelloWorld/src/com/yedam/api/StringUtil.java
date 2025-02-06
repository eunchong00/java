package com.yedam.api;

public class StringUtil {
	static void 연결하기(String str, String str1) {
		System.out.println(str.concat(",").concat(str1));
	}
	static void checkGender (String ssn1) {
		ssn1 = ssn1.replace(" ", "");
		ssn1 = ssn1.replace("-", "");
		char chr = ssn1.charAt(6);
		switch (chr) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("알수 없음.");
		}
		
	}
	static void checkExtesion(String file) {
		String ext = file.substring(file.indexOf(".") + 1);
		System.out.printf("파일 확정자명은 : %s입니다.\n", ext);
	}
	static void getLength(String str) {	
	    int len = str.trim().length();
		System.out.printf("문장의 길이는 %d글자입니다.", len);
		
	}
}

