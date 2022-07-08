package co.edu.emp;

import java.util.Scanner;

public class CalendarEx {
	// 요일 정보
	//
	private CalendarEx() {
	}

	private static CalendarEx instance = new CalendarEx();

	public static CalendarEx getInstance() {
		return instance;
	}

	public static void show() {

		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		int[] lastdates = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int realdate = 1;
		int a = 6;
		int j = 0;
		int year;
		int y = 0;
		Scanner scn = new Scanner(System.in);
		boolean pass = true;
		while (pass) {
			System.out.print("보고자 하는 달력의 연도를 입력하시오 > ");
			y = Integer.parseInt(scn.nextLine());
			for (year = 2022; year < 2100; year++) {
				if (y == year) {
					System.out.printf("%4d년의 달력입니다.\n", year);
				}
				for (j = 0; j < lastdates.length; j++) {
					if (y == year) {
						System.out.printf("----------------%2d월----------------\n", (j + 1));
						System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", days[0], days[1], days[2], days[3], days[4],
								days[5], days[6]);
						if (j == lastdates.length - 1) {
							pass = false;
						}
					}
					if (a != 7) {
						for (int i = 0; i < a; i++) {
							if (y == year) {
								System.out.print("     ");
							}
						}
					}
					for (int i = 0; i < lastdates[j]; i++) {
						a++;
						if (y == year) {
							System.out.printf("%5d", (realdate));
						}
						if (a % 7 == 0) {
							if (y == year) {
								System.out.println();
							}
						}
						realdate++;
					}
					if (a > 35) {
						a -= 35;
					} else if (a > 28) {
						a -= 28;
					}
					realdate -= lastdates[j];
					if (y == year) {
						System.out.println();
					}
				}
				if (year % 4 == 3) {
					lastdates[1] = 29;
				} else {
					lastdates[1] = 28;
				}
			}
		}
	}

	public static void showOne() {

		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		int[] lastdates = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int realdate = 1;
		int a = 6;
		int j = 0;
		Scanner scn = new Scanner(System.in);
		System.out.printf("보고싶은 월을 선택하시오 > ");
		int choice = Integer.parseInt(scn.nextLine()) - 1;
		for (j = 0; j < lastdates.length; j++) {
			if (choice == j) {
				System.out.printf("----------------%2d월----------------\n", (j + 1));
				System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", days[0], days[1], days[2], days[3], days[4], days[5],
						days[6]);
			}
			if (a != 7) {
				for (int i = 0; i < a; i++) {
					if (choice == j) {
						System.out.print("     ");
					}
				}
			}
			for (int i = 0; i < lastdates[j]; i++) {
				a++;
				if (choice == j) {
					System.out.printf("%5d", (realdate));
				}
				if (a % 7 == 0) {
					if (choice == j) {
						System.out.println();
					}
				}
				realdate++;
			}
			if (a > 35) {
				a -= 35;
			} else if (a > 28) {
				a -= 28;
			}
			realdate -= lastdates[j];
			{
				if (choice == j)
					System.out.println();
			}
		}

	}
}
