package co.edu;

public class Example03 {
	public static void main(String[] args) {
		
		String name= "진정욱";
		
		// {"name" : "홍길동", "age" : 20} json 데이터 타입.
		System.out.println("내 이름은 \"" + name + "\"입니다" );
		System.out.println("{\"name\" : \"홍길동\", \"age\" : 20}");
		
		// 문자열 -> 정수, 실수.
//		"100" => 100
		
		int num1 = Integer.parseInt("100"); // "100"->100(int)
		double num2 = Double.parseDouble("123.0"); // "123.4"->123.4(Double)
		double num3 = Double.parseDouble("122.21"); // "123.4"->123.4(Double)
		
		double result = sum(num1, num2);
		result = minus(num2, num3);
		System.out.println("나머지 : "+result);
		System.out.printf("차이는 %.2f 입니다\n", result);
		System.out.printf("저의 이름은 %s이고 나이는 %d 입니다.\n","\"홍길동\"",14);
		
		
		// 이름, 나이, 몸무게(소수점)
		
		int age = 30;
		String name1 = "진정욱";
		double weight = 111111.1111111;
		
		System.out.printf("제 이름은 %s이며,\n나이는 %d살 입니다.\n몸무게는 %.2fkg입니다", name1, age, weight);
	}
	// 2개의 숫자를 받아서 합한 결과를 반환해주는 메소드(method) 작성
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public static double sum(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	public static double minus(double n1, double n2) {
		double sum = n1 - n2;
		return sum;
	}

}
	
