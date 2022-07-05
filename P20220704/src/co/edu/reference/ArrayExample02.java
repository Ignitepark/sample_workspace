package co.edu.reference;

public class ArrayExample02 {
	public static void main(String[] args) {
		int[] intAry = { 20, 27, 15, 33, 29 };
		// 배열의 크기 : 5, intAry.length
		int a;
		// 위치 세번째 => 15 -> 30;
		intAry[2] = 30;
		a = intAry[0];
		intAry[0] = intAry[1];
		intAry[1] = a;
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
//			if (i % 2 == 0) {
			System.out.println(intAry[i]);
//			}
			sum += intAry[i];
		}
		System.out.println("합계 : " + sum);
//		int temp = 0;
//		int i = 0;
//		while (true) {
//			if (i >= intAry.length - 1) {
//				break;
//			} else if (intAry[i] < intAry[i + 1]) {
//				temp = intAry[i];
//				intAry[i] = intAry[i + 1];
//				intAry[i + 1] = temp;
//				if (i > 0) {
//					i--;
//				}
//			} else if (intAry[i] >= intAry[i + 1]) {
//				i++;
//			}
//		}
//		for (int j = 0; j < intAry.length; j++) {
//			System.out.println(intAry[j]);
//		}
	}

}
