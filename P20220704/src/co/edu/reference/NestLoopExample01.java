package co.edu.reference;

public class NestLoopExample01 {
	public static void main(String[] args) {

//		for (int j = 1; j <= 3; j++) {
//			System.out.println("jė ę° : " + j);
//			for (int i = 1; i <= 5; i++) {
//				System.out.println("   i ė ę° :" + i);
//			}
//		}
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		System.out.println();
		}
	}
}
