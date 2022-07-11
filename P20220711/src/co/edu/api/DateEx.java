package co.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/*
 * Date, Calendar => 시간, 날짜 정보.
 */
public class DateEx {
	public static void main(String[] args) {
		Date today = new Date(); // LocalDate, LocalDateTime
		today.getDate();
		today.getDay();

		System.out.println(today.toString());
		System.out.println(today.toGMTString());
		System.out.println(today.toLocaleString());

		// 2022년 07월 11일 14시 53분 12초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초");
		System.out.println(sdf.format(today));

		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(today));

		today = new Date("2022/07/15 13:23:12");
		System.out.println(sdf.format(today));

		// Calendar 클래스
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR) + "년");
		System.out.println(now.get(Calendar.MONTH) + 1 + "월");
		now.set(2022, 10, 11);
		System.out.println(now.get(Calendar.DATE) + "일");

		// LocalDate
		LocalDate lDate = LocalDate.now(); // 정적 메소드
		System.out.println(lDate.toString());

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(lDate.format(dtf));

	}
}
