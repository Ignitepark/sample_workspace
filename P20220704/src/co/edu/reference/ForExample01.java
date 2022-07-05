package co.edu.reference;

public class ForExample01 {
	public static void main(String[] args) {

		// 배열
		int[] tempAry = new int[10];
		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int) (Math.random() * 50) + 1;
		}

		for (int num : tempAry) {
			System.out.println(num);
		}
		int max = 0;
		for (int i = 0; i < tempAry.length; i++) {
			if (max <= tempAry[i]) {
				max = tempAry[i];
			}
		}

		System.out.println("제일 큰 값 " + max);

		int temp = 0;
		int a = 0;

		while (true) {
			if (a < tempAry.length - 1) {
				if (tempAry[a] > tempAry[a + 1]) {
					temp = tempAry[a + 1];
					tempAry[a + 1] = tempAry[a];
					tempAry[a] = temp;
					if (a > 0) {
						a--;
					}
				} else if (tempAry[a] <= tempAry[a + 1]) {
					a++;
				}
			} else {
				break;
			}
		}

		for (

		int num : tempAry) {
			System.out.println(num);
		}
	}
}
