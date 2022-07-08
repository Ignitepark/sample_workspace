package co.edu.emp;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.YEAR) + "년");
//		System.out.println(cal.get(Calendar.MONTH) + 1 + "월"); // 0 ~ 11
//		System.out.println(cal.get(Calendar.DATE) + "일");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일"); // 1(일) ~ 7(토)
//		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일"); // 말일 날짜.0
//
//		cal.set(2022, 5, 1); // 2022년 6월 1일 지정.
//		System.out.println(cal.get(Calendar.YEAR) + "년");
//		System.out.println(cal.get(Calendar.MONTH) + 1 + "월"); // 0 ~ 11
//		System.out.println(cal.get(Calendar.DATE) + "일");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일"); // 1(일) ~ 7(토)
//		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일"); // 말일 날짜.0

		int year = 2022;
		int month = 8;
//		System.out.printf("%d년 %d월의 마지막 날짜는 %d\n", year, month, getLastDate(year, month));
//		System.out.printf("%d년 %d월의 1일의 요일 정보는 %d", year, month, getDayInfo(year, month));

		CalendarExample.showCalendar();
	}

	// 년, 월 정보 => 해당 년,월의 말일 정보(메소드) 2022년 9월 => 30일.
	public static int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1); // 7->6

		return cal.getActualMaximum(Calendar.DATE); // 말일정보를 가져오기.

	}

	// 년, 월 정보 => 해당 년,월의 1일의 정보(메소드) 2022년 9월 => 9월 1일은 5요일
	public static int getDayInfo(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		return cal.get(Calendar.DAY_OF_WEEK);
	}

	public static void showCalendar() {
		Scanner scn = new Scanner(System.in);
		System.out.println("달력 연도 입력>>");
		System.out.print("");
		int year = Integer.parseInt(scn.nextLine());
		System.out.println("달력 월 입력>>");
		System.out.print("");
		int month = Integer.parseInt(scn.nextLine());

		// 요일 정보. 1일의 위치. 말일의 날짜(28일인지,30일인지,31일인지).
		String[] days = { "Sun", "Mon", "Tue", "Wen", "Thr", "Fri", "Sat" };
		int firstDay = getDayInfo(year, month) - 1; // 일:0, 월:1, 화:2, 수:3, 목:4, 금:5, 토:6
		int lastDate = getLastDate(year, month);//

		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		// 1일의 요일정보를 맞추도록.
		for (int i = 0; i < firstDay; i++) {
			System.out.printf("%4s", " ");
		}
		// 날짜 출력하는 부분.
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + firstDay) % 7 == 0) {// 토요일까지 출력했으면 줄바꿈.
				System.out.println();
			}
		}
	}

}
