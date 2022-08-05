package com.bank.account;

import java.util.Scanner;

public class AccountService {
	Scanner scn = new Scanner(System.in);

	public void makeAccount() {
		Account ac = new Account();

		System.out.print("계좌 번호 > ");
		String accountId = scn.nextLine();
		System.out.print("고객 ID > ");
		String customerId = scn.nextLine();

		ac.setAccountId(accountId);
		ac.setMemberId(customerId);

	}

	public void money() {
		Account account = new Account();
		System.out.println("| 1.입금 | 2.출금 |");
		int cmd = Integer.parseInt(scn.nextLine());
		System.out.print("계좌 번호 > ");
		String accountId = scn.nextLine();
		if (cmd == 1) {
			System.out.print("입금 금액 > ");
		} else if (cmd == 2) {
			System.out.print("출금 금액 > ");
		}
		int money = Integer.parseInt(scn.nextLine());

		account.setAccountId(accountId);
		account.setBalance(money);

		int result = AccountManage.getInstance().updateMoney(account, cmd);

		if (result == 1 && cmd == 1) {
			System.out.println("입금 완료");
		} else if (result == 1 && cmd == 2) {
			System.out.println("출금 완료");
		}
	}

	public void deleteAccount() {
		System.out.println("---------------계좌 해지---------------");
		System.out.print("계좌 입력 > ");
		String accountId = scn.nextLine();
		int result = AccountManage.getInstance().delAccount(accountId);
		if (result == 1) {
			System.out.println("정상적으로 해지되었습니다.");
		} else if (result == 2) {
			System.out.println("해지되지 않았습니다.");
		}
	}

	public void transfer() {
		System.out.println("이체");

		System.out.print("보낼 계좌 > ");
		String account1 = scn.nextLine();

		System.out.print("받을 계좌 > ");
		String account2 = scn.nextLine();

		System.out.print("금액 > ");
		int money = Integer.parseInt(scn.nextLine());

		AccountManage.getInstance().transferMoney(account2, account1, money);

	}

}
