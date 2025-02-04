package com.yedam.inheritance;

public class CastingExe {
	public static void main(String[] args) {
		// byte < short < int < long
		int n1 = 100;
		long n2 = 0;
		n1 = (int) n2;
		n2 = n1; // promotion 자동형변환

		Friend f1 = new ComFriend("", "", "", "");
//		ComFriend f2 = (ComFriend) new Friend("", "");
		f1 = new Friend("", "");
		if (f1 instanceof ComFriend) {
			ComFriend f2 = (ComFriend) f1;
			System.out.println(f2.showInfo());
		} else {
			System.out.println("형변환 못함.");
		}
	}
}
