package com.yedam.inheritance;
// 추상 클래스.
public abstract class Animal {
	// 추상메소드.
	public abstract void sound();
	public void eat() {
		System.out.println("먹는다.");
	}
}
