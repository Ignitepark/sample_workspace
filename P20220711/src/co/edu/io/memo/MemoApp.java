package co.edu.io.memo;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		MemoManager memoApp = MemoManager.getInstance();
		boolean run = true;
		while (run) {
			System.out.println("1.등록 | 2.검색 | 3.삭제 | 4.목록 | 5.종료");
			int selectNo = Integer.parseInt(scn.nextLine());

			switch (selectNo) {
			case 1:
				memoApp.inputData();
				break;
			case 2:
				memoApp.search();
				break;
			case 3:
				memoApp.deleteData();
				break;
			case 4:
				memoApp.listUp();
				break;
			case 5:
				memoApp.storeToFile();
				run = false;
			}
//			if (selectNo == 1) {
//				memoApp.inputData();
//			} else if (selectNo == 2) {
//				memoApp.search();
//			} else if (selectNo == 3) {
//				memoApp.deleteData();
//			} else if (selectNo == 4) {
//				memoApp.listUp();
//			} else if (selectNo == 5) {
//				memoApp.storeToFile();
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
