package co.edu.reference;

public class ArrayExample03 {
	public static void main(String[] args) {
		// 배열 선언.
		int[] intAry = { 22, 33 };
		intAry = new int[] { 24, 56, 77, 43, 99 }; // 변수에 배열 재할당.
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		double avg = (double) sum / intAry.length;
		System.out.printf("합계 : %d, 평균 : %.1f\n", sum, avg);

		// 배열 선언
		int[][] nestAry = new int[2][3];
		nestAry[0][0] = 10;
		nestAry[0][2] = 30;
		nestAry[1][1] = 40;

		System.out.println("nestAry 첫번째 배열.");
		for (int i = 0; i < nestAry[0].length; i++) {
			System.out.println(nestAry[0][i]);
		}
		System.out.println("nestAry 첫번째 배열.");
		for (int i = 0; i < nestAry[0].length; i++) {
			System.out.println(nestAry[1][i]);
		}
		
		nestAry = new int[][] {{1,2},{3,4,5},{6,7,8}};
		
		System.out.println("중첩배열");
		for (int i = 0; i < nestAry.length; i++) {
			for (int j = 0; j < nestAry[i].length; j++) {
				System.out.println("(" + i + "," + j + ") => " + nestAry[i][j]);
			}
		}

//		int temp = 0;
//		int i = 0;
//		while (true) {
//			if (i >= intAry.length - 1) {
//				break;
//			} else if (intAry[i] > intAry[i + 1]) {
//				temp = intAry[i];
//				intAry[i] = intAry[i + 1];
//				intAry[i + 1] = temp;
//				if(i>0) {
//					i--;
//				}
//			} else if (intAry[i] <= intAry[i + 1]) {
//				i++;
//			}
//		}
//		for (int j = 0; j < intAry.length; j++) {
//			System.out.println(intAry[j]);
//		}

	}
}
