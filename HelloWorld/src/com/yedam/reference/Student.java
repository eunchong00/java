package com.yedam.reference;

public class Student {
	String studName;
	String studentName;
	int engScore;
	int mathScore;
	// 생성자: 필드의 초기값을 지정해서 인스턴스 생성.
	Student() { // 기본생성자: 매개값이 없는 기본생성자.
		
	}
	
	Student(String studentName, int engScore){
		this.studentName = studentName;
		this.engScore = engScore;
	}
	Student(String studentName, int engScore, int mathScore){
		this.studentName = studentName;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	// 메소드(기능)
	void printInfo() {
		System.out.printf("이름은 %s, 영어는 %d, 수학은 %d\n", studentName, engScore, mathScore);
	}
	// 기능추가: 평균을 반환.
	double getAverage() {
		return (engScore + mathScore) / 2.0; // (88 + 89) / 2
	}

}
