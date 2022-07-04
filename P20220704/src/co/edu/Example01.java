package co.edu;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("임의 숫자 입력 >> ");
		int num1 = scn.nextInt();
		
		boolean isTrue = num1 % 3 == 0;
		
		if(isTrue) {
			System.out.printf("입력한 %d은(는) 3의 배수입니다.",num1);
		} else {
			System.out.printf("입력한 %d은(는) 3의 배수가 아닙니다.",num1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
