package com.yedam.api;

public class TimeExe {
	public static void main(String[] args) {
		// ?분 ?초 합은 ? 입니다. 출력.
		// 1부터 100000000 까지 짝수합을 구하는 시간.
	
		long sum = 0;
		long start = 0, end =0;
	
		for (int i = 0; i <= 10000000000l; i++) {
			if (i % 250 == 0)
			sum += i;
		}
		end = System.currentTimeMillis();
		long jobTime = (end - start) / 1000;
		long min = jobTime / 60;
		long sec = jobTime % 60;
		System.out.printf("%d분 %d초, 합: %d\n",min,sec,sum);
        

//		System.out.println("1~1000000000의 합은 :" + sum + "입니다.");
//		System.out.println("걸린시간은 총" + (time2 - time1) + "입니다.");
	}
}
