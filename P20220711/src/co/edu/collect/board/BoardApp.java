package co.edu.collect.board;

import java.util.List;
import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardDAO app = BoardDAO.getInstance();

		// 메뉴 선택 => 선택값 => 구현

		while (true) {
			System.out.println("1.목록 | 2.등록 | 3.조회(작성자) | 4.삭제 | 5.종료");
			System.out.print("번호를 선택하시오 > ");
			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				List<Board> list = app.boardList();
				for (Board board : list) {
					System.out.println("제목 : " + board.getTitle() + ", 작성자 : " + board.getWriter());
				}
			} else if (selectNo == 2) {
				System.out.print("제목을 입력하시오 > ");
				String title = scn.nextLine();
				System.out.print("작성자를 입력하시오 > ");
				String writer = scn.nextLine();
				System.out.print("내용을 입력하시오 > ");
				String content = scn.nextLine();
				app.add(new Board(title, writer, content));
			} else if (selectNo == 3) {
				System.out.print("조회 할 글의 작성자를 입력하시오 > ");
				String writer = scn.nextLine();
				List<Board> test = app.search(writer);
				for (Board board : test) {
					System.out.println("제목 : " + board.getTitle() + ", 작성자 : " + board.getWriter() + ", 내용 : "
							+ board.getContent());
				}
			} else if (selectNo == 4) {
				System.out.print("삭제할 글의 제목을 입력하시오 > ");
				String title = scn.nextLine();
				app.remove(title);
			} else if (selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
