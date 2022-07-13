package com.edu;

public class BookMember extends Member {

	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	private String picName;
	private String className;

	public BookMember(int memberId, String memberName, String phone, String picName, String className) {
		super(memberId, memberName, phone);
		this.picName = picName;
		this.className = className;
	}

	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실

	@Override
	public String toString() {
		return super.toString() + ", 반장이름 : " + picName + ", 강의실 : " + className;
	}

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
