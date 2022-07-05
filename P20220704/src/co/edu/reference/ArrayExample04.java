package co.edu.reference;

public class ArrayExample04 {
	public static void main(String[] args) {
		// A반 80, 85, 83
		// B반 79, 84, 90

		int[][] banAry = new int[2][3];
//		banAry[0][0] = 80;
//		banAry[0][1] = 85;
//		banAry[0][2] = 83;
//		banAry[1][0] = 79;
//		banAry[1][1] = 84;
//		banAry[1][2] = 90;
		banAry = new int[][] { { 80, 85, 83 }, { 79, 84, 90 } };

		int sumA, sumB;
		double avgA, avgB;
		sumA = sumB = 0;
		avgA = avgB = 0;

//		sumA = banAry[0][0] + banAry[0][1] + banAry[0][2];
//		for (int i = 0; i < banAry[0].length; i++) {
//			sumA += banAry[0][i];
//		}
		sumB = banAry[1][0] + banAry[1][1] + banAry[1][2];
		
		
		for (int i = 0; i < banAry.length; i++) {
			for (int j = 0; j < banAry[i].length; j++) {
				if (i == 0) {
					sumA += banAry[i][j];
				} else {
					sumB += banAry[i][j];
				}
			}
		}
		avgA = (double) sumA / banAry[0].length;
		avgB = (double) sumB / banAry[1].length;

		System.out.printf("A반의 평균은 %.1f점 입니다.\n", avgA);
		System.out.printf("B반의 평균은 %.1f점 입니다.\n", avgB);
	}
}
