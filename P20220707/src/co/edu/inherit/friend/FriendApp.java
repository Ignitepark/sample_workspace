package co.edu.inherit.friend;

import java.util.Scanner;

public class FriendApp {

	private static FriendApp instance = new FriendApp();
	int friendNum;

	private FriendApp() {

	}

	public static FriendApp getInstance() {
		return instance;
	}

	Friend[] friends = new Friend[10];
	Scanner scn = new Scanner(System.in);

	public void start() {
		while (true) {
			timerShow("-----------------------------");
			timerShow("1.등록 | 2.조회 | 3.목록 | 9.종료");
			timerShow("-----------------------------");
			timerShow("메뉴를 입력하세요 > ");
			int selectNo = 0;
			try {
				selectNo = Integer.parseInt(scn.nextLine()); // 예외처리
			} catch (Exception e) {
				timerShow("숫자를 입력하세요.");
			}

			if (selectNo == 1) {
				add();
			} else if (selectNo == 2) {
				search();
			} else if (selectNo == 3) {
				list();
			} else if (selectNo == 9) {
				timerShow("프로그램을 종료합니다.");
				break;
			}
		}
		timerShow("프로그램을 종료합니다.");
	}

	private void add() {
		if (friendNum >= 10) {
			timerShow("저장할 수 있는 친구 수를 초과하였습니다.");
		} else {
			timerShow("이름을 입력하세요 > ");
			String name = scn.nextLine();
			timerShow("연락처를 입력하세요 > ");
			String phone = scn.nextLine();
			int choice = 0;

			while (true) {
				timerShow("1.친구 | 2.학교 | 3.회사");

				System.out.print("선택하시오 > ");
				try {
					choice = Integer.parseInt(scn.nextLine()); // 예외처리
					break;
				} catch (Exception e) {
					System.out.println("1,2,3번 중에 선택하세요.");
				}
			}

			if (choice == 1) {
				friends[friendNum++] = new Friend(name, phone);
			} else if (choice == 2) {
				timerShow("학교 이름을 입력하세요 > ");
				String univ = scn.nextLine();
				timerShow("전공을 입력하세요 > ");
				String major = scn.nextLine();
				friends[friendNum++] = new UnivFriend(name, phone, univ, major);
			} else if (choice == 3) {
				timerShow("회사 이름을 입력하세요 > ");
				String com = scn.nextLine();
				timerShow("부서를 입력하세요 > ");
				String dep = scn.nextLine();
				friends[friendNum++] = new ComFriend(name, phone, com, dep);
			}
		}
	}

	private void search() {
		timerShow("검색할 이름을 입력하시오 > ");
		String sname = scn.nextLine();
		for (int i = 0; i < friendNum; i++) {
			if (sname.equals(friends[i].getName())) {
				friends[i].showInfo();
				System.out.println();
			}
		}
	}

	private void list() {
		timerShow("총 " + friendNum + "명의 친구가 있습니다.");
		for (int i = 0; i < friendNum; i++) {
			System.out.println(friends[i].toString());
		}
	}
	
	private void timerShow(String msg) {
		String[] message = msg.split("");
		for (int i = 0 ; i<message.length;i++) {
			System.out.print(message[i]);
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
