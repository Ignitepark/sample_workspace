package com.yedam.app;

import java.util.Scanner;

import com.yedam.member.MemberDTO;
import com.yedam.member.MemberService;
import com.yedam.student.StudentDTO;
import com.yedam.student.StudentService;

public class LMSApp {

	MemberService ms = new MemberService();
	StudentService ss = new StudentService();
	Scanner scn = new Scanner(System.in);
	int menu = 0;

	MemberDTO MD = null;

	public LMSApp() {
		run();
	}

	private void run() {
		while (true) {
			menuNo();
			if (MD == null) {
				if (menu == 1) {
					MemberDTO mem = new MemberDTO();
					System.out.print("아이디 입력 > ");
					String id = scn.nextLine();
					System.out.print("비밀번호 입력 > ");
					String pw = scn.nextLine();

					mem.setMemberId(id);
					mem.setMemberPw(pw);

					MD = ms.doLogin(mem);

				} else if (menu == 2) {
					System.out.println("프로그램 종료");
					break;
				}
			}
		}
	}

	private void menuNo() {
		if (MD == null) {
			System.out.println("| 1.로그인 | 2.종료 |");
			System.out.print("메뉴를 입력하시오 > ");
			menu = Integer.parseInt(scn.nextLine());
		} else {
			System.out.println("| 1.학생 등록 | 2.성적 입력 | 3.학생 정보 수정 | 4. 학생 정보 조회 |");
			System.out.print("메뉴를 입력하시오 > ");
			menu = Integer.parseInt(scn.nextLine());
			if (menu == 1) {
				StudentDTO std = new StudentDTO();
				System.out.println("---------학생 등록---------");
				System.out.print("학번 입력 > ");
				int id = Integer.parseInt(scn.nextLine());
				System.out.print("이름 입력 > ");
				String name = scn.nextLine();
				System.out.print("교실 입력 > ");
				String lecture = scn.nextLine();
				System.out.print("주소 입력 > ");
				String address = scn.nextLine();
				System.out.print("전화번호 입력 > ");
				String tell = scn.nextLine();
				std.setStudentId(id);
				std.setStudentName(name);
				std.setStudentClass(lecture);
				std.setStudentAddress(address);
				std.setStudentTell(tell);

				ss.insertStudent(std);
			} else if (menu == 2) {
				// 존재하면
				StudentDTO std = new StudentDTO();
				System.out.println("---------성적 입력---------");
				System.out.print("학번 입력 > ");
				int id = Integer.parseInt(scn.nextLine());

				std.setStudentId(id);

				std = ss.getStudent(std);
				if (std != null) {
					ss.insertSubject(std);
				} else {
					System.out.println("해당 학번의 학생이 없습니다.");
				}
			} else if (menu == 3) {
				System.out.println("---------학생 정보 수정---------");
				ss.updateTell();
			} else if (menu == 4) {
				System.out.println("---------학생 정보 조회---------");
				StudentDTO std = new StudentDTO();
				System.out.print("학번 입력 > ");
				int id = Integer.parseInt(scn.nextLine());
				std.setStudentId(id);

				std = ss.getStudent(std);
				if (std != null) {
					System.out.println(ss.getStudent(std).toString());
				} else {
					System.out.println("해당 학번의 학생이 없습니다.");
				}
			}

		}
	}
}
