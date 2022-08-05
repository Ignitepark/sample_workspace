package com.yedam.student;

import java.util.Scanner;

public class StudentService {
	Scanner scn = new Scanner(System.in);

	// 학생등록
	public void insertStudent(StudentDTO std) {
		int result = StudentManage.getInstance().insertStudent(std);
		if (result == 1) {
			System.out.println("학생 정보 입력에 성공하였습니다.");
		} else {
			System.out.println("학생 정보 입력에 실패하였습니다.");
		}
	}

	public void insertSubject(StudentDTO std) {
		// 성적입력 -> 1.국어, 2.영어, 3.수학
		int menu = 0;
		System.out.println("---------성적 입력---------");
		System.out.println("| 1.국어 | 2.영어 | 3.수학 |");
		System.out.print("메뉴 입력 > ");
		menu = Integer.parseInt(scn.nextLine());
		System.out.print("점수 입력 > ");
		int score = Integer.parseInt(scn.nextLine());
		if (menu == 1) {
			std.setStudentKor(score);
			checkResult(StudentManage.getInstance().insertKor(std));
		} else if (menu == 2) {
			std.setStudentEng(score);
			checkResult(StudentManage.getInstance().insertEng(std));
		} else if (menu == 3) {
			std.setStudentMath(score);
			checkResult(StudentManage.getInstance().insertMath(std));
		}

	}

	// 학생 정보 조회
	public StudentDTO getStudent(StudentDTO std) {
		return StudentManage.getInstance().getStudent(std.getStudentId());
	}

	public void updateTell() {
		StudentDTO std = null;
		System.out.print("학번을 입력하시오 > ");
		int id = Integer.parseInt(scn.nextLine());
		System.out.print("변경할 전화번호를 입력하시오 > ");
		String tell = scn.nextLine();
		std.setStudentId(id);
		std.setStudentTell(tell);
		int result = StudentManage.getInstance().updateTell(std);
		checkResult(result);
	}

	private void checkResult(int value) {
		if (value == 1) {
			System.out.println("성공하였습니다.");
		} else {
			System.out.println("실패하였습니다.");
		}
	}

}
