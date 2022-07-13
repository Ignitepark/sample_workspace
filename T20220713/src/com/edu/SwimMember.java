package com.edu;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	

	private String teacherName;
	private String swimGrade;

	public SwimMember(int memberId, String memberName, String phone, String teacherName, String swimGrade) {
		super(memberId, memberName, phone);
		this.teacherName = teacherName;
		this.swimGrade = swimGrade;
	}

	// 정보출력시 => 강사이름: 홍길동, 등급: A 

	@Override
	public String toString() {
		return super.toString() + ", 강사이름 : " + teacherName + ", 수영등급 : " + swimGrade;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSwimGrade() {
		return swimGrade;
	}

	public void setSwimGrade(String swimGrade) {
		this.swimGrade = swimGrade;
	}
	
}
