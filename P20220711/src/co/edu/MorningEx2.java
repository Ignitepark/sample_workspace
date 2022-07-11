package co.edu;

public class MorningEx2 {
	public static void main(String[] args) {
		// 정수(int) 배열 (6개)

		int[] intAry = new int[6];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) ((Math.random() * 100) + 1);
			sum += intAry[i];
		}
		avg = (double) sum / intAry.length;

		for (int num : intAry) {
			System.out.println(num);
		}

	}
}
