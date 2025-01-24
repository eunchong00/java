package com.yedam.reference;

public class Reference2 {
	public static void main(String[] args) {

		String[][] scores = new String[5][2];
		scores[0][0] = "홍길동";
		
		scores[1][0] = "최기둥";
		scores[2][0] = "심상헌";
		scores[3][0] = "박헌수";
		scores[4][0] = "김길동";
		scores[0][1] = "80";
		scores[1][1] = "85";
		scores[2][1] = "88";
		scores[3][1] = "90";
		scores[4][1] = "75";

		for (int j = 0; j < scores.length; j++) {
			for (int i = 0; i < scores[j].length; i++) {
				System.out.println("[" + j + "][" + i + "] => " + scores[j][i]);
			}
		}
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수=> " + scores[i][1]);
			
		    sum = sum + Integer.parseInt(scores[i][1]) ; 
		}
		System.out.printf("점수의 총합은 %d\n", sum);
		
		int max = 0;
		String name = "";
		for (int i = 0; i < scores.length; i++) {
			if( max < Integer.parseInt(scores[i][1]) ) {
				max = Integer.parseInt(scores[i][1]);
				name = scores[i][0];
			}
			
		}
		
		System.out.println(max);
		System.out.println(name);
		

	} // end of main.

}
