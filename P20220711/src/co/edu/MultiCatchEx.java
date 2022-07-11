package co.edu;

import java.util.Scanner;

public class MultiCatchEx {
	public static void main(String[] args) {

		int[] intAry = new int[2];
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하시오 > ");

		try {
			intAry[0] = (int) (Math.random() * 100 + 1);
			intAry[1] = (int) (Math.random() * 100 + 1);

			intAry[2] = Integer.parseInt(scn.nextLine()); // 문자열 숫자 -> 숫자.
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과합니다.");
		} catch (NumberFormatException e1) {
			System.out.println("숫자를 입력하세요.");
		} catch (Exception e2) {
			System.out.println("알 수 없는 예외");
		}
	}
}
