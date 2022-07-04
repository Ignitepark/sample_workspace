package co.edu;

public class Example03 {
	public static void main(String[] args) {
		// 월 => 30일입니다, 31일입니다, 28일입니다 (월 말일에 대한 정보)
//		System.out.println("월을 입력하시오(Month) : ");
		int month = (int) (Math.random() * 12) + 1;

		int lastDate = 0;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			lastDate = 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			lastDate = 30;
		} else {
			lastDate = 28;
		}

		System.out.printf("%d월은 %d일이 말일입니다.\n", month, lastDate);

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDate = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDate = 30;
			break;
		default:
			lastDate = 28;
		}
		System.out.printf("%d월은 %d일이 말일입니다.", month, lastDate);

//		switch (month) {
//		case 1:
//			System.out.printf("%d월의 말일은 31일입니다.",month);
//			break;
//		case 2:
//			System.out.printf("%d월의 말일은 28일입니다.",month);
//			break;
//		case 3:
//			System.out.printf("%d월의 말일은 31일입니다.",month);
//			break;
//		case 4:
//			System.out.printf("%d월의 말일은 30일입니다.",month);
//			break;
//		case 5:
//			System.out.printf("%d월의 말일은 31일입니다.",month);
//			break;
//		case 6:
//			System.out.printf("%d월의 말일은 30일입니다.",month);
//			break;
//		case 7:
//			System.out.printf("%d월의 말일은 31일입니다.",month);
//			break;
//		case 8:
//			System.out.printf("%d월의 말일은 31일입니다.",month);
//			break;
//		case 9:
//			System.out.printf("%d월의 말일은 30일입니다.",month);
//			break;
//		case 10:
//			System.out.printf("%d월의 말일은 31일입니다.",month);
//			break;
//		case 11:
//			System.out.printf("%d월의 말일은 30일입니다.",month);
//			break;
//		case 12:
//			System.out.printf("%d월의 말일은 31일입니다.",month);
//			break;			
//		}
	}
}
