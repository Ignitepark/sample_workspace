package co.edu;

/*
 * 인스턴스를 담고 있는 참조 변수가 참고하는 객체가 없는 경우, null값에 대해 발생하는 예외
 */
public class NullPointerEx {
	public static void main(String[] args) {
		String name = "홍길동";
		name = null;
		
		
		try {
			System.out.println(name.toString());
			
			System.out.println("name의 값을 출력합니다.");
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료.");
	}
}
