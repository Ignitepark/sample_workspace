package co.edu.loop;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		boolean game = true;
		while (game) {
			System.out.println("범위를 지정하십시오 : ");
			Scanner scn = new Scanner(System.in);
			int size = scn.nextInt();
			int temp = (int) (Math.random() * size) + 1;
			int inputVal = 0;
			int i = 1;
			int a = 0;
			boolean isTrue1 = true;
			boolean isTrue2 = true;
			while (isTrue1) {
				System.out.print(i++ + "번째 시도 : 1 ~ " + size + " 사이의 숫자를 입력하시오 >> ");
				inputVal = scn.nextInt();
				if (inputVal > temp) {
					System.out.println("목표값이 입력값보다 작습니다");
				} else if (inputVal == temp) {
					System.out.printf("정답입니다.");
					break;
				} else {
					System.out.println("목표값이 입력값보다 큽니다");
				}
			}
			while (isTrue2) {
				System.out.println("다시 하시겠습니까?");
				System.out.println("1.예, 2.아니오");

				a = scn.nextInt();
				if (a == 1 || a == 2) {
					if (a == 1) {
						isTrue2 = false;
					} else if (a == 2) {
						isTrue2 = false;
						game = false;
					}
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			}
		}

	}
}
