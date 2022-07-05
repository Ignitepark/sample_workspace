package co.edu.reference;

public class Example02 {
	public static void main(String[] args) {
		boolean isTrue = true;
		int i = 1;
		while (isTrue) {
			System.out.println(i++);
			if (i > 10) {
				isTrue = false;
			}
		}
	}
}
