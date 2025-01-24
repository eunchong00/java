package com.yedam.reference;

public class ReferenceExe1 {

	public static void main(String[] args) {
		// 배열선언.
		double[] dblAry = new double[5];
		dblAry[0] = 171.3;
		System.out.println(dblAry.length);
		for (int i = 0; i < dblAry.length; i++) {

		}

		dblAry = new double[] { 160.5, 174.6 };
		System.out.println(dblAry.length);

		// 배열[][] => 다차원배열.
		int[][] intAry = new int[2][3]; // 2 * 3 배열선언.
		intAry[0][0] = 10;
		intAry[0][1] = 20;
		intAry[0][2] = 30;
		intAry[1][0] = 20;
		intAry[1][1] = 30;
		intAry[1][2] = 40;
		for (int j = 0; j < intAry.length; j++) {
			for (int i = 0; i < intAry[0].length; i++) {
				System.out.println("[" + j + "][" + i + "] => " + intAry[j][i]);
			}
		}
	}

	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public void method1() {
		System.out.println("method1()이 호출되었습니다.");
	}

	private void method2() {
		System.out.println("method2()이 호출되었습니다.");
	}
}
