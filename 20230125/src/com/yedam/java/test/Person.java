package com.yedam.java.test;

public class Person {
	// 필드
	int ssn;
	String name;
	String address;

	// 생성자
	private Person() {
	}
	
	Person(int ssn, String name, String address){
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	

	public int getssn() {
		return ssn;
	}

	public void setssn(int ssn) {
		this.ssn = ssn;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	// 메소드
}
