package com.bank.app;

import java.util.Scanner;

import com.bank.account.AccountService;
import com.bank.member.MemberService;

public class ManageMent {
	Scanner scn = new Scanner(System.in);
	int menuNo = 0;
	MemberService ms = new MemberService();
	AccountService as = new AccountService();

	public ManageMent() {
		bankJob();
	}

	private void bankJob() {
		menuInfo();
		if (MemberService.memberInfo.getRole().equals("1")) {
			if (menuNo == 1) {
				ms.registerCustomer();
			} else if (menuNo == 2) {
				as.makeAccount();
			} else if (menuNo == 3) {
				as.money();
			} else if (menuNo == 4) {

			} else if (menuNo == 5) {
				as.deleteAccount();
			} else if (menuNo == 6) {

			}
		} else if (MemberService.memberInfo.getRole().equals("0")) {

		}
	}

	private void menuInfo() {
		if (MemberService.memberInfo.getRole().equals("1")) {
			System.out.println("| 1.고객 등록 | 2.계좌 개설 | 3.입,출금 | 4.계좌 이체 | 5.계좌 해지 | 6.대출 |");
		} else if (MemberService.memberInfo.getRole().equals("0")) {
			System.out.println("| 1.계좌 조회 | 2.입금 | 3.출금 | 4.계좌 이체 | 5.대출 |");
		}
		System.out.print("메뉴를 입력하세요 > ");
		menuNo = Integer.parseInt(scn.nextLine());
	}
}
