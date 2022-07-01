package co.edu;

public class Example01 {
	public static void main(String[] args) {
/*	int nu;
	double price;
	double sum;
	int box;
	int div;
	int etc;
	boolean isTrue;
	String name;
	
	name = "사과";
	nu = 100;
	price = 450;
	sum = nu * price ;
	box = 15;
	div = nu/box;
	etc = nu - box*div;
	
	System.out.println("제품 " + name + "의 총 수량은 " + nu + "개 이며, 단가는 " + price + "원 입니다.");
	isTrue = sum > 10000;
	if(isTrue) {
		sum = sum /10000;
		System.out.println("총액은 " + sum + "만원 입니다.");
	} else {
		sum = sum;
		System.out.println("총액은 " + sum + "원 입니다.");
	}
	System.out.println("한 박스에 " + box + "개 이며, 총 " + div + "박스입니다.");
	System.out.println("낱개로 남은 제품은 " + etc + "개 입니다.");
*/
//	boolean isTrue = false;
//	
//	int myAge = 10;
//	int yourAge = 11;
//	myAge = 30;
//	
//	isTrue = myAge > yourAge;
//	
//	if(isTrue) {
//		System.out.println("나의 나이가 더 많다");
//	} else {
//		System.out.println("나의 나이가 더 적다");
//	}
	
	//float, double : double default.
	float f1 = 23.4f;  // 4byte
	System.out.println(Float.MIN_VALUE);
	System.out.println(Float.MAX_VALUE);
	double d1 = 23.4; // 8byte
	
	// 0 ~ 10 정수
	double result = 1.1+2.2;
	System.out.println(result);
	
	// long(8byte), float(4byte)
	float sum = 2345.41f + 22.31F;
	System.out.println(sum);
	
	}
}
