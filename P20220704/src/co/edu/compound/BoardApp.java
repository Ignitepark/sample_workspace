package co.edu.compound;

import java.util.Date;
import java.util.Scanner;

/*
 * 등록/조회/수정/삭제/리스트
 * id:user1, passwd : 1212 => 로그인 되었습니다.
 */

public class BoardApp {
	public static void main(String[] args) {
		Board[] boards = new Board[100];
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		boolean checkid = true;
		boolean checkpw = true;
		String user1 = "user1";
		String passwd = "1212";

		while (checkid) {
			System.out.printf("아이디를 입력하시오 > ");
			String id = scn.nextLine();
			if (id.equals(user1)) {
				checkid = false;
				while (checkpw) {
					System.out.printf("비밀번호를 입력하시오 > ");
					String pw = scn.nextLine();
					if (pw.equals(passwd)) {
						checkpw = false;
					} else {
						System.out.println("비밀번호를 다시 확인하세요.");
					}
				}
			} else {
				System.out.println("아이디를 다시 확인하세요.");
			}
		}
		System.out.println("로그인 되었습니다!");
		
		
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.등록 | 2.조회 | 3.수정 | 4.삭제 | 5.리스트 | 6.종료");
			System.out.println("---------------------------------------------");
			System.out.print("메뉴를 입력하시오 >");

			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {
				// 게시글 등록(제목, 내용, 작성자, 작성일시, 조회수(0))
				System.out.println("제목을 입력하시오.");
				String title = scn.nextLine();

				System.out.println("내용을 입력하시오.");
				String content = scn.nextLine();

				System.out.println("작성자를 입력하시오.");
				String writer = scn.nextLine();

				Board board = new Board();

				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setCreateDate(new Date());
				board.setHitCount(0);
//				boards[i++] = board;
				// 배열의 비어있는 위치에 저장
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) {
						boards[i] = board;
						System.out.println("정상적으로 입력하였습니다.");
						break;
					}
				}
			} else if (selectNo == 2) {
				// 제목으로 조회
				System.out.println("제목을 입력하시오.");
				String findTitle = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.println("제목 : " + boards[i].getTitle() + "\n내용 : " + boards[i].getContent()
								+ "\n작성자 : " + boards[i].getWriter() + "\n작성 일시 : " + boards[i].getCreateDate()
								+ "\n조회 수 : " + boards[i].getHitCount() + "\n");
						int a = boards[i].getHitCount();
						boards[i].setHitCount(++a);
					}
				}

			} else if (selectNo == 3) {
				System.out.println("수정할 글의 제목을 입력하시오.");
				String findTitle = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.println("수정할 항목을 선택하세요.");
						System.out.println("1.제목 | 2.내용");
						int a = Integer.parseInt(scn.nextLine());
						if (a == 1) {
							System.out.println("기존 제목 : " + boards[i].getTitle());
							System.out.println("새로운 제목을 입력하세요.");
							String reTitle = scn.nextLine();
							boards[i].setTitle(reTitle);
						} else if (a == 2) {
							System.out.println("기존 내용 : " + boards[i].getContent());
							System.out.println("새로운 내용을 입력하세요.");
							String reContent = scn.nextLine();
							boards[i].setContent(reContent);
						}
					}
				}
			} else if (selectNo == 4) {
				System.out.println("삭제할 글 제목을 입력하시오.");
				String findTitle = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						boards[i] = null;
						System.out.println("정상적으로 삭제되었습니다.");
					}
				}
			} else if (selectNo == 5) {
				System.out.println("--------------------- 글 목 록 --------------------");
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.println("제목 : " + boards[i].getTitle() + "\n내용 : " + boards[i].getContent()
								+ "\n작성자 : " + boards[i].getWriter() + "\n작성 일시 : " + boards[i].getCreateDate()
								+ "\n조회 수 : " + boards[i].getHitCount() + "\n");
					}
				}

			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}

//				switch (selectNo) {
//				case 1:
//				case 2:
//				case 3:
//				case 4:
//				case 5:
//				}

		}
	}
}
