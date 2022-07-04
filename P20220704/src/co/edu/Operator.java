package co.edu;

import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 20;
		
		int result = num1 + num2; // 더하기 연산자.
		result = num1 - num2; // 빼기 연산자.
		result = num1 * num2; // 곱하기 연산자.
		result = num1 / num2; // 나누기 연산자.
		result = num1 % num2; // 나머지 연산자.
		
		result = num1 % 2; //홀수, 짝수 구분
		
		System.out.println("임의의 값을 입력:");
		
		// num1 = scn.nextInt();
		if(num1 % 2 == 0) {
			System.out.printf("짝수입니다.\n",num1);
		} else {
			System.out.printf("홀수입니다.\n",num1);
		}
		result = 20 + 2 * 3 ;
		System.out.println(result);
		
		num1++; // num1 = num1 + 1;
		System.out.println(num1); // 11
		num1--; // num1 = num1 - 1;
		System.out.println(num1); // 10
		
		System.out.println(++num1); // 11
		
		result = num1++ + num2++; // 31
		
		System.out.println(result);

		result = num1 + num2;
		
		System.out.println(result);
		
		// 논리 부정 연산자 : !
		boolean isEven = result % 2 == 0;
		if (!isEven) {
			System.out.println("결과값이 홀수입니다.");
		}
		
		
		
		
	}
}
