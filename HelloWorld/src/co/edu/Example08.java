package co.edu;

import java.util.Scanner;

public class Example08 {
public static void main(String[] args) {
	System.out.println("[필수 정보 입력]");
	System.out.print("1. 이름 : ");
	Scanner sn = new Scanner(System.in);
	String name = sn.nextLine();

	System.out.print("2. 주민번호 앞 6자리 : ");
	Scanner sn2 = new Scanner(System.in);
	int num = sn2.nextInt();
	
	System.out.print("3. 전화번호 : ");
	Scanner sn3 = new Scanner(System.in);
	String tel = sn3.nextLine();
	
	System.out.println("[입력한 내용]");
	System.out.printf("%s\n%d\n%s", name, num, tel);
	
	
	}
}
