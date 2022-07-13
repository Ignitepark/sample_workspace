package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp implements MemberService {

	List<Member> members = new ArrayList<Member>();
	Scanner scn = new Scanner(System.in);

	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 1)도서반=>기본정보+도서반장,강의실이름
		// 축구반=>기본정보+코치이름,락커룸이름
		// 수영반=>기본정보+강사이름,수영등급
		while (true) {
			System.out.println("메뉴 : 1.등록 | 2.수정 | 3.전체리스트 | 9.종료");
			System.out.print("메뉴를 입력하시오 > ");
			int menuNum = Integer.parseInt(scn.nextLine());
			if (menuNum == 1) {
				Member member = new Member();
				System.out.print("회원 번호를 입력하시오 > ");
				int memberId = Integer.parseInt(scn.nextLine());
				System.out.print("회원 이름을 입력하시오 > ");
				String memberName = scn.nextLine();
				System.out.print("연락처를 입력하시오 > ");
				String phone = scn.nextLine();
				System.out.println("1.도서반 | 2.축구반 | 3.수영반");
				System.out.print("반을 입력하시오 > ");

				int selectNo = Integer.parseInt(scn.nextLine());

				if (selectNo == 1) {
					System.out.print("도서반장 이름을 입력하시오 > ");
					String picName = scn.nextLine();
					System.out.println("도서반의 강의실 정보는 다음과 같습니다 : 지혜실, 지식실, 모험실");
					System.out.print("강의실 정보를 입력하시오 > ");
					String className = scn.nextLine();
					member = new BookMember(memberId, memberName, phone, picName, className);
				} else if (selectNo == 2) {
					System.out.print("축구 코치 이름을 입력하시오 > ");
					String coachName = scn.nextLine();
					System.out.println("축구반의 락커룸 정보는 다음과 같습니다 : A, B, C, D");
					System.out.print("락커룸 정보를 입력하시오 > ");
					String lockerName = scn.nextLine();
					member = new SoccerMember(memberId, memberName, phone, coachName, lockerName);
				} else if (selectNo == 3) {
					System.out.print("수영 강사 이름을 입력하시오 > ");
					String teacherName = scn.nextLine();
					System.out.println("수영반의 수영등급 정보는 다음과 같습니다 : A, B, C, D");
					System.out.print("수영등급 정보를 입력하시오 > ");
					String swimGrade = scn.nextLine();
					member = new SwimMember(memberId, memberName, phone, teacherName, swimGrade);
				} else {
					System.out.println("잘못된 숫자를 입력하셨습니다.");
				}
				addMember(member);
			} else if (menuNum == 2) {
				System.out.print("수정하고자 하는 회원의 회원번호를 입력하시오 > ");
				int searchId = Integer.parseInt(scn.nextLine());
				for (Member search : members) {
					if (search.getMemberId() == searchId) {
						modifyMember(search);
					}
				}
			} else if (menuNum == 3) {
				List<Member> list = memberList();
				for (Member member : list) {
					System.out.println(member.toString());
				}
			} else if (menuNum == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	@Override
	public void addMember(Member member) {
		members.add(member);
	}

	@Override
	public void modifyMember(Member member) {
		System.out.println("현재 이름 > " + member.getMemberName());
		System.out.print("수정하고자 하는 이름을 입력하시오 > ");
		String modifyName = scn.nextLine();
		System.out.println("현재 연락처 > " + member.getPhone());
		System.out.print("수정하고자 하는 연락처를 입력하시오 > ");
		String modifyPhone = scn.nextLine();
		member.setMemberName(modifyName);
		member.setPhone(modifyPhone);
		if (member instanceof BookMember) {
			BookMember searchBook = (BookMember) member;
			System.out.println("현재 도서반장의 이름 > " + searchBook.getPicName());
			System.out.print("수정하고자 하는 이름을 입력하시오 > ");
			String modifyPicName = scn.nextLine();
			System.out.println("현재 강의실의 정보 > " + searchBook.getClassName());
			System.out.print("수정하고자 하는 정보를 입력하시오 > ");
			String modifyClassName = scn.nextLine();
			searchBook.setPicName(modifyPicName);
			searchBook.setClassName(modifyClassName);
		} else if (member instanceof SoccerMember) {
			SoccerMember searchSoccer = (SoccerMember) member;
			System.out.println("현재 코치의 이름 > " + searchSoccer.getCoachName());
			System.out.print("수정하고자 하는 이름을 입력하시오 > ");
			String modifyCoachName = scn.nextLine();
			System.out.println("현재 락커룸의 정보 > " + searchSoccer.getLockerName());
			System.out.print("수정하고자 하는 정보를 입력하시오 > ");
			String modifyLockerName = scn.nextLine();
			searchSoccer.setCoachName(modifyCoachName);
			searchSoccer.setLockerName(modifyLockerName);
		} else if (member instanceof SwimMember) {
			SwimMember searchSwim = (SwimMember) member;
			System.out.println("현재 강사의 이름 > " + searchSwim.getTeacherName());
			System.out.print("수정하고자 하는 이름을 입력하시오 > ");
			String modifyTeacherName = scn.nextLine();
			System.out.println("현재 수영등급의 정보 > " + searchSwim.getSwimGrade());
			System.out.print("수정하고자 하는 정보를 입력하시오 > ");
			String modifySwimGrade = scn.nextLine();
			searchSwim.setTeacherName(modifyTeacherName);
			searchSwim.setSwimGrade(modifySwimGrade);
		}
	}

	@Override
	public List<Member> memberList() {
		return members;
	}
}
