package co.edu.loop;

public class Ex030402 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int result = 0;
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				result = 4*x+5*y;
				if(result==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}

	}
}
