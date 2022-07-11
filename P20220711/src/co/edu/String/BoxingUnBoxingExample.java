package co.edu.String;

import java.util.HashSet;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// 박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf(300);

		// 언박싱
//		int value1 = obj1.intValue();
//		int value2 = obj2.intValue();
//		int value3 = obj3.intValue();
//
//		System.out.println(value1);
//		System.out.println(value2);
//		System.out.println(value3);

		// 로또 번호 생성 1~45
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int temp = (int) ((Math.random() * 45) + 1);
			for (int j = 0; j <= i; j++) {
				if (temp != lotto[j]) {
					lotto[i] = temp;
					
				}System.out.println(temp+", "+i--);
			}
		}
		for (int num : lotto) {
			System.out.println(num);
		}

//		HashSet<Integer> set = new HashSet<Integer>();
//		while (true) {
//			set.add((int) (Math.random() * 45 + 1));
//			if (set.size() == 6) {
//				break;
//			}
//		}
//		for (int a : set) {
//			System.out.println(a);
//		}
	}
}
