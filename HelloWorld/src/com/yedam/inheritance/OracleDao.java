package com.yedam.inheritance;

public class OracleDao extends Dao{
	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	public void register() {
		System.out.println("등록기능.");
	}
	public void remove() {
		System.out.println("삭제기능.");
	}
	public void select() {
		System.out.println("조회기능.");
	}
}
