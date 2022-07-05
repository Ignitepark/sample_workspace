package co.edu.reference;

public class MethodExample01 {
	public static void main(String[] args) {
		// 메소드의 실행구문.
//		long sum = sum(10); // arguments(매개값)
//		showInfo("진정욱", 30);
//		showInfo("홍길동", 400);
//		printStar(6, "♥");
//		printRe(6, "♥");

		printGugudan(9);
	}

	public static void printGugudan(int num) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= num; j++) {
				System.out.printf("%d × %d = %2d\t", j, i, j * i);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printStar(int times, String shape) {
		for (int i = 1; i <= times; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}
	}

	public static void printRe(int times, String shape) {
		for (int i = 1; i <= times; i++) {
			for (int j = times - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}
	}

	public static void showInfo(String name, int age) {
		System.out.println("반갑습니다. " + name + "입니다. 나이는 " + age + "살 입니다.");
	}

	// 메소드의 정의구문.
	public static long sum(int num) { // parameter(매개변수)
		int result = num * 2;
		return (long) result; // 자동 형 변환 (Promotion)
	}
}
