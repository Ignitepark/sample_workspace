package co.edu;

import java.math.RoundingMode;

public class Example02 {
	public static void main(String[] args) {
	// 나의 키: 변수, 친구 키 : 변수
		double myHeight;
		double yourHeight;
		myHeight = 173.4;
		yourHeight = 170;
		
		double theDifference = 0;
		
		if(myHeight > yourHeight) {
			theDifference = myHeight - yourHeight;
			System.out.println("나의 키가 " + theDifference + "cm 만큼 더 큽니다");
		} else {
			theDifference = yourHeight - myHeight;
			System.out.println("나의 키가 " + theDifference + "cm 만큼 더 작습니다");
		}
	}
}