package co.edu;
/*
 * 인스턴스를 여러개 생성하지 않고, 하나만 생성하여 돌려쓰겠습니다.
 */
public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
