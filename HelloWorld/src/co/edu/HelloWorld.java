package co.edu;

public class HelloWorld {
	public static void main(String[] args) {
		// 변수의 종류 : int(정수), double(실수), boolean(논리), String(문자열)
		// int(4byte) < double(8byte)
		// 정수 : byte(1byte) < short(2byte) < int(4byte) < long(8byte)
		// 
		
		String name = "10";
		name = "진정욱";
		// 두 단어를 조합 할 때 , 뒷 단어의 첫 글자를 대문자로 표현하는 것이 관례
		int myAge = 28;//선언하면서 값을 할당 -> 초기화
		int yourAge;
		yourAge = 35;
		double height = 172.2;
		boolean isMarried = true;
		String myAddress = "대구광역시";
		
		myAge = 29;
		height = 173.2;
		isMarried = false;
		myAddress = "대구광역시 중구";
		
		int result = yourAge + 1; //변수는 사용을 위해서 값이 할당되어 있어야 함.
		double result1 = myAge + height;
		
		System.out.println("안녕하세요 " + name + "입니다.");
		System.out.println("나이는 " + result + "살 이며, 키는 " + height + "입니다");
	}
}
