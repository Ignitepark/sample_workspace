package co.edu.api;

class Member extends Object {
	String id;
	int age;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			boolean b1 = this.id.equals(((Member) obj).id);
			boolean b2 = this.age == ((Member) obj).age;
			return b1 && b2;
		}
		return false;
	}

	@Override
	public String toString() {
		return "아이디: " + id + ", 나이: " + age;
	}
}

public class ObjectEx {
	public static void main(String[] args) {

		Object obj1 = new Object(); // instance를 생성했으므로 주소값이 존재
		Object obj2 = new Object(); // instance를 생성했으므로 주소값이 존재

		System.out.println(obj1.toString());

		boolean result = obj1.equals(obj2); // 만들어진 instance가 다르기 때문에 주소값이 동일하지 않음 => false;

		System.out.println(result);

		result = (obj1 == obj2);
		System.out.println(result);

		String name1 = new String("홍길동");
		String name2 = new String("김길동");

		System.out.println(name1.toString());
		System.out.println(name2.toString());

		result = name1.equals(name2);
		System.out.println(result);

		result = (name1 == name2);
		System.out.println(result);

		Member member1 = new Member();

		member1.id = "user1";
		member1.age = 10;

		System.out.println(member1.toString());

		Member member2 = new Member();

		member2.id = "user1";
		member2.age = 10;

		System.out.println(member2.toString());

		System.out.println(result = member1.equals(member2)); // 물리적으로는 다른 개체이나, 논리적으로 동일한 개체.

	}
}
