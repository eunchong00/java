package com.yedam.reference;

public class Book {
	// 필드.
	private String bookName;
	private String bookPub;
	private String bookWrt;
	private int bookPri;
	
	// public, default, private => 접근지시사(access modifier)
	// 생성자.
	Book(String bookName,
	String bookPub,
	String bookWrt,
	int bookPri) {
		this.bookName = bookName;
		this.bookPub = bookPub;
		this.bookWrt = bookWrt;
		this.bookPri = bookPri;
	}
	// 제목 , 저자 , 가격.
	String showBookInfo() {
		return bookName + " " + bookWrt  + " " + bookPri;
	}
	void showDetailInfo() {
		// 도서명: 이것이 자바다		출판사: 한빛미디어
		// 저 자: 신용권			가 격: 25000원
		String strFormat = "도서명: %10s\t출판사: %6s\n 저 자: %3s\t\t가 격: %5d 원\n";
		System.out.printf("", bookName, bookPri, bookWrt, bookPub);
	}
	// setter.
	public void setBookPrice(int bookPri) {
		if (bookPri < 0) {
			this.bookPri = 0;
			return;
		}
		this.bookPri = bookPri;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setBookPub(String bookPub) {
		this.bookPub = bookPub;
	}
	public void setBookWrt(String bookWrt) {
		this.bookWrt = bookWrt;
	}
	// getter.
	public String getBookName() {
		return bookName;
	}
	public int getBookPri() {
		return bookPri;
	}
	public String getBookPub() {
		return bookPub;
	}
	public String getBookWrt() {
		return bookWrt;
	}
}

