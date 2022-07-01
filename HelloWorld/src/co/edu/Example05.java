package co.edu;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		
//		String name = new String("진정욱");
//		System.out.println("값을 입력하시오");
		Scanner sn = new Scanner(System.in);
		
		
//		String input = sn.nextLine();// 문자열로 읽겠습니다.
//		int input = sn.nextInt();// 정수로 읽겠습니다.
//		System.out.printf("입력값은 %d 입니다", input);
		

		System.out.println("첫번째 값을 입력하시오");
		int num1 = sn.nextInt();
		System.out.println("두번째 값을 입력하시오");
		int num2 = sn.nextInt();
		int dif=0;
		
		if(num1 > num2) {
			dif = num1 - num2;
		} else {
			dif = num2 - num1;
		}		
		
		int result = num1 + num2 ;
		System.out.printf("\n입력된 두 값 %d, %d의 합은 %d, 차는 %d 입니다.\n", num1, num2, result, dif);
		
		
		
	}
}
