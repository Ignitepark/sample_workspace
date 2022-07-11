package co.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		try {
			int num = scn.nextInt(); // 정수가 들어와야하나, 문자열이 들어올 경우
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하시오");
		}

		System.out.println("프로그램 종료");

	}
}
