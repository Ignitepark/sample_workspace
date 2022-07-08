package co.edu.reference;

import java.util.Scanner;

public class MorningEx {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());
			// 배열을 지정하지 않고 다른 메뉴를 선택하면 메세지 보여주기.

			if (scores == null) {
				if (!(selectNo == 1 || selectNo == 5)) {
					System.out.println("학생 수를 먼저 지정하시오");
					continue;
				}
			}
			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				System.out.println("정상적으로 처리 되었습니다.");
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
					if (max <= scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수 : " + max + "\n평균 점수 : " + (double) sum / studentNum);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
