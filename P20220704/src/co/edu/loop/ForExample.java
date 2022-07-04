package co.edu.loop;

public class ForExample {
	public static void main(String[] args) {

//		int sum = 0;
//
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				sum = sum + i;
//				System.out.println("i의 값: " + i + ", sum의 값 : " + sum);
//			}
//		}
//		System.out.println("결과값 : " + sum);

		// 1 ~ 10까지 result => 누적

		int sum1 = 0;
		for (int i = 1; i <= 10; i += 3) {
			sum1 += i;
		}
		System.out.println("1 ~ 10 까지의 누적 합 : " + sum1);

		// 1 ~ 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// 10 ~ 1까지 출력
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 2;
//
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		for (int i = 1; i <= 20; i++) {
//			num1 = num3;
//			num3 = num3 + num2;
//			num2 = num1;
//			System.out.println(num3);
//		}
	}
}
