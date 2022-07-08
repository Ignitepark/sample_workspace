package co.edu.emp;

import java.util.Scanner;

/*
 * 실행 Class
 */
public class EmployApp {
	public static void main(String[] args) {
		EmployeeList app = EmployeeList.getInstance();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1.초기화(사원수) | 2.사원입력 | 3.리스트 | 4.상세조회 | 5.달력보기 | 9.종료");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				app.init();
			} else if (selectNo == 2) {
				app.input();
			} else if (selectNo == 3) {
				app.printAll();
			} else if (selectNo == 4) {
				app.search();
			} else if (selectNo == 5) {
				CalendarEx.show();
			} else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}
}
