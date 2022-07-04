package co.edu;

import java.util.Scanner;

public class BankAcct {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		int temp = 0;
		int mon = 0;

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			temp = scn.nextInt();
			if (temp == 1) {
				System.out.print("예금액>");
				mon = scn.nextInt();
				balance += mon;
			} else if (temp == 2) {
				System.out.print("출금액>");
				mon = scn.nextInt();
				if (mon > balance) {
					System.out.println("잔고가 부족합니다.");
				} else {
					balance -= mon;
				}
			} else if (temp == 3) {
				System.out.println("잔고>" + balance);
			} else if (temp == 4) {
				break;
			} else {
				System.out.println("잘못된 입력입니다");
			}
		}
		System.out.println("프로그램 종료");
	}
}
