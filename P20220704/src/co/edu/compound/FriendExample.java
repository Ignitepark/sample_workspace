package co.edu.compound;

import java.util.Scanner;

public class FriendExample {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String search;

		Friend f1 = new Friend();
		f1.setName("홍길동");
		f1.setTel("010-1234-4567");
		f1.setEmail("qwe123@google.com");
		f1.setBirth(" 12월 1일");
		f1.setWeight(88.4);
		f1.setHeight(183);

		Friend f2 = new Friend();
		f2.setName("박길동");
		f2.setTel("010-4321-4321");
		f2.setEmail("fking@google.com");
		f2.setBirth("7월 8일");
		f2.setWeight(132.4);
		f2.setHeight(163);

		Friend[] friends = { f1, f2 };
		
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		
		System.out.print("이름을 입력하시오> ");
		search = scn.nextLine();

		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(search)) {
				friends[i].showInfo();
			}
		}
	}
}
