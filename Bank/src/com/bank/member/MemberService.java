package com.bank.member;

import java.util.Scanner;

public class MemberService {
	Scanner scn = new Scanner(System.in);

	public static Member memberInfo = null;

	// 로그인
	public void doLogin() {
		Member member = new Member();

		System.out.print("ID > ");
		String id = scn.nextLine();
		System.out.print("PW > ");
		String pw = scn.nextLine();

		member = MemberManage.getInstance().loginInfo(id);

		if (member.getMemberPw().equals(pw)) {
			memberInfo = member;
		} else {
			System.out.println("로그인 실패.");
		}
	}

	// 로그아웃
	public void logout() {
		if (memberInfo != null) {
			memberInfo = null;
		}
	}

	public void registerCustomer() {
		Member member = new Member();
		System.out.print("고객 ID > ");
		String id = scn.nextLine();
		System.out.print("고객 PW > ");
		String pw = scn.nextLine();
		System.out.print("고객 이름 > ");
		String name = scn.nextLine();
		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberName(name);
		member.setRole("0");

		int result = MemberManage.getInstance().registerCustomer(member);
		if (result == 1) {
			System.out.println("고객 정보 등록 완료");
		} else {
			System.out.println("고객 정보 등록 실패");
		}

	}
}
