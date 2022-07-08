package co.edu;
/*
 * static 정적 메소드, 정적 필드 사용.
 */
public class StaticMain {
	public static void main(String[] args) {
		// 정적(static) 기능.

		Calculator cal = new Calculator();
		System.out.println(cal.pi);
		System.out.println(Calculator.pi);
		double result = Math.PI;
		System.out.println(result);

		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();

		System.out.println(sing1==sing2);
		
		
	}
}
