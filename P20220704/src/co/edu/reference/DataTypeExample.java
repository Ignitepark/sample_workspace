package co.edu.reference;

class Person {
	String name;
	int age;
}

public class DataTypeExample {
	public static void main(String[] args) {

		int num1 = 100;
		int num2 = num1;
		num1 = 200;

		System.out.println("num1의 값 : " + num1); // stack : 100 -> 200
		System.out.println("num2의 값 : " + num2); // stack : 100 -> 100

		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;

		Person p2 = p1;

		p1.name = "박길동";
		p1.age = 22;
		
		p2.name = "김길동";
		p2.age = 25;
		
//		String name1 = "홍길동";
//		String name2 = "홍길동";
//		name1 = "박길동";

		System.out.println("p1의 값 : " + p1.name + p1.age + "살"); // stack :
		System.out.println("p2의 값 : " + p2.name + p2.age + "살"); // stack :
	}
}
