package com.yedam.java.ch02.set;

public class Member {
	public int id;
	public String name;

	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return id + name.hashCode(); // id중복검사 메모리가 다른경우의 중복으로 보지 않기 때문에  중복 검사
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj; // obj는 자동타입 변환 때문에 접근할 수 없다 obj클래스로 접근해야 한다
			return (id == member.id) && (name.equals(member.name)); //id와 name이 같으면 true

//			if (id == member.id) {
//				if(name.equals(member.name)) {
//					return true;
//				}
//			}
		}
		return false;
	}
}