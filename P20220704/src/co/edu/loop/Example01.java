package co.edu.loop;

public class Example01 {
	public static void main(String[] args) {
		// 10번 반복
		// num 변수 <= 1 ~ 10 까지의 임의 정수
		// sum 변수 <= 2의 배수.
		// 2의 배수의 합 :

		int num = 0;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i <= 10; i++) {
			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0) {
				sum1 += num;
			}
			if (num % 3 == 0) {
				sum2 += num;
			}
		}
		System.out.println("2의 배수의 합계 : " + sum1);
		System.out.println("3의 배수의 합계 : " + sum2);

	}
}
