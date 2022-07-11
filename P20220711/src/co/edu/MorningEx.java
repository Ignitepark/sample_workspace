package co.edu;

import java.util.Scanner;

public class MorningEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] fruits = { "딸기", "바나나", "오렌지", "파인애플" };

		boolean pass = true;
		System.out.print("값을 입력하시오 > ");
		String fruit = scn.nextLine();
		for (int i = 0; i < fruits.length; i++) {
			if (fruit.equals(fruits[i])) {
				System.out.printf("%s는 %d번째 자리에 있습니다.", fruits[i], (i + 1));
				pass = false;
				break;
			}
		}
		if (pass) {
			System.out.println("찾는 값이 없습니다.");
		}
	}
}
