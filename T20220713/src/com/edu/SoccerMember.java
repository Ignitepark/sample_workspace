package com.edu;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	private String coachName;
	private String lockerName;

	public SoccerMember(int memberId, String memberName, String phone, String coachName, String lockerName) {
		super(memberId, memberName, phone);
		this.coachName = coachName;
		this.lockerName = lockerName;
	}

	// 정보출력시 => 코치이름: 홍길동, 락커룸: A
	@Override
	public String toString() {
		return super.toString() + ", 코치이름 : " + coachName + ", 락커룸 : " + lockerName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getLockerName() {
		return lockerName;
	}

	public void setLockerName(String lockerName) {
		this.lockerName = lockerName;
	}
	
}
