package com.yedam.reference;

import java.util.Scanner;

/*
 * << 도서명, 저자, 출판사, 판매가격 >>
 */
public class BookExe {
	public static void init() {
		bookRepository[0] = new Book("이것이자바다", "신용권", "한빛미디어", 30000);
		bookRepository[1] = new Book("자바스크립트기초", "김기초", "한빛미디어", 20000);
		bookRepository[2] = new Book("혼자공부하는자바", "김자바", "자바바라", 50000);

	}

	public static void searchList() {
		System.out.println("조회할 출판사를 입력>>");
		publi = scn.nextLine();
		boolean isExist = false;

		System.out.println("도서명		저자		가격");
		System.out.println("=======================");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookPub().equals(publi)) {
				System.out.println(bookRepository[i].showBookInfo());
				isExist = true;
				break;
			}
		}
		System.out.println("=======================");
		if (!isExist) {
			System.out.println("찾는 출판사가 없습니다.");

		}
	}

	public static void printList() {
		System.out.println("도서명		저자		가격");
		System.out.println("=======================");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null) {
				System.out.println(bookRepository[i].showBookInfo());
			}
		}
		System.out.println("=======================");

	}

	public static void addBook() {
		System.out.println("도서이름을 입력>>");
		String name = scn.nextLine();
		System.out.println("저자를 입력>>");
		String writer = scn.nextLine();
		System.out.println("출판사를 입력>>");
		publi = scn.nextLine();
		System.out.println("가격을 입력>>");
		price = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] == null) {
				bookRepository[i] = new Book(name, writer, publi, price);

				System.out.printf("등록완료.");
				break; // for 종료.
			}
		}
	}

	public static void modifyBook() {
		System.out.println("도서이름을 입력>>");
		name = scn.nextLine();
		System.out.println("가격을 입력>>");
		price = Integer.parseInt(scn.nextLine());
		boolean exit = false;
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookName().equals(name)) {
				bookRepository[i].setBookPrice(price);
				System.out.println("수정완료.");
				
				break; // 수정완료되면 반복문 종료.
			}
		}
		if (!exit) {
			System.out.println("찾는 도서가 없습니다.");

		}
	}

	static Scanner scn = new Scanner(System.in);
	static Book[] bookRepository = new Book[100];
	static String name;
	static String publi;
    static int price;
    
    
	public static void main(String[] args) {
		init();
		
		boolean run = true;

		// 1.전체목록 2.도서등록 3.조회(출판사) 9.종료
		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 4.가격변경 5.상세조회 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				printList();
				break;
			case 2:
				addBook();
				break;
			case 3:
				searchList();
				break;

			case 4:
				modifyBook();
				break;
			case 5: // 상세조회
				System.out.println("도서이름을 입력>>");
				name = scn.nextLine();
				Calculator cal = new Calculator();
				cal.getBookInfo(name, bookRepository).showDetailInfo();
				System.out.println("=================================");
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
	}// end of main.
}
