package co.edu.loop;

public class star {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 4 - i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int n = 1; n <= i; n++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		int a = 7;
		for (int i = 0; i < a; i++) {
			for (int j = a - i; j > 0; j--) {
				System.out.print("*");
			}
			for (int k = i * 2; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = a - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = (a - i) * 2; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		int b = 40;
		int c = 3;
		for (int i = 1; i <= b; i += c) {
			for (int j = b - i; j >= 0; j--) {
				System.out.print("*");
			}
			for (int j = c; j <= i * 2; j++) {
				System.out.print(" ");
			}

			for (int j = b - i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= b; i += c) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			for (int j = c; j <= (b - i + 1) * 2; j++) {
				System.out.print(" ");
			}

			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
