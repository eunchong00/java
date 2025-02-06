package com.yedam.api;

import java.util.Objects;

public class Member {
	String memberId;
	int memPoint;
	
	Member(){}
	
	Member(String id, int point){
		memberId = id;
		memPoint = point;
	}

	@Override
	public int hashCode() {
//		return super.hashCode(); // Object의 hashcode는 주소값.
		return hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return memPoint == other.memPoint && Objects.equals(memberId, other.memberId);
	}
}
