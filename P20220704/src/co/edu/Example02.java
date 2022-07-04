package co.edu;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		// 사용자가 입력하는 값을 읽어서 100 ~ 90 : A, ~80 : B, ~70 : C, 그 외 : D
		// 출력값 : 점수 78은 C 등급 입니다.
		Scanner scn = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int score = scn.nextInt();

		String grade = "";
		if (score > 100 || score < 0) {
			System.out.println("입력 오류 입니다.");
		} else if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			grade = "D";
		}
		if (score <= 100 && score > 0) {
			System.out.printf("점수 %d점은 %s 등급입니다.\n", score, grade);
		}

		String result = (score > 100 || score < 0) ? ""
				: (score <= 100 && score >= 95) ? "A+"
						: (score >= 90) ? "A"
								: (score >= 85) ? "B+"
										: (score >= 80) ? "B" : (score >= 75) ? "C+" : (score >= 70) ? "C" : "D";
		if (score <= 100 && score > 0) {
			System.out.printf("점수 %d점은 %s 등급입니다.\n", score, result);
		}
	}
}
