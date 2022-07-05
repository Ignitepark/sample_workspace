package co.edu.reference;

import java.util.Scanner;

public class ForExample02 {

	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] intArray = new int[6];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100) + 1;
		}
		// intArray 배열의 합과 평균
		for (int num : intArray)
			System.out.print(num + " ");
		System.out.println("합 : " + sumAry(intArray));

	}

}
