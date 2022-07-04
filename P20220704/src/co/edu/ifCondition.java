package co.edu;

public class ifCondition {
	public static void main(String[] args) {
		int num = 6;
		
		
		// if ~ else
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		} else {
			System.out.println(num + "은 홀수입니다.");
		}
		
		
		// if ~ else if ~ else
//		if(num % 2 == 0 && num % 3 == 0) {
//			System.out.println("2 와 3의 배수입니다.");
//		}
		
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("2 와 3의 배수입니다.");
		} else if(num % 3 ==0) {
			System.out.println("3의 배수입니다.");
		} else if(num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		} else {
			System.out.println("2 또는 3의 배수가 아닙니다.");
		}
		
		int score = 80;
		// 100 ~ 90 => A, 89 ~ 80 => B, 79 ~ 70 => C 그 외 D
		String grade = "";
		if(score >= 90 && score <= 100) {
			grade = "A";
		} else if(score >= 80 /*&& score < 90*/) {
			grade = "B";
		} else if(score >=70 /*&& score < 80*/) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.printf("%d 점은 %s 등급입니다.", score, grade);
		
		
	}
}
