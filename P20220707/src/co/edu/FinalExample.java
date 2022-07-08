package co.edu;
/*
 * 상수 vs 변수.
 * 변수에 final 선언 시, 상수로 지정됨.
 * 메소드에 final 이 붙으면 재정의(overriding) 불가.
 */

/*
 * 클래스 선언은 파일 하나에 클래스 하나가 원칙(프로그램상 문제X, 편의상의 문제)
 */
class Person {
	final String ssn; // 주민등록번호. private이나 public이 없으면 default 접근지점저장임.(동일 패키지 내에서)
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

public class FinalExample {
	public static void main(String[] args) {

		// 변수.
		String name = "홍길동";
		name = "김민수";

		// 상수
		final int num = 10;
//		num = 20; // The final local variable num cannot be assigned.

		Person person = new Person("930708-1234567","진정욱");
		person.name = "고길동";
//		person.ssn = "12345678";
		
		
		
	}
}
