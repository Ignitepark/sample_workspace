package member;

import java.util.List;
import java.util.Scanner;

public class Application {
	Scanner scn = new Scanner(System.in);

	public Application() {
		run();
	}

	private void run() {
		boolean flag = true;
		while (flag) {
			System.out.println("| 1.전체조회 | 2.단건조회 | 3.회원입력 | 4.회원수정 | 5.회원삭제 | 6.종료 |");
			System.out.print("입력 > ");
			int menuNo = Integer.parseInt(scn.nextLine());

			switch (menuNo) {
			case 1:
				System.out.println("-------------------전체 회원 조회-------------------");
				List<Member> list = MemberManagement.getInstance().getMemberList();
				for (Member member : list) {
					System.out.println(member.toString());
				}
				break;
			case 2:
				System.out.println("-------------------회원 조회-------------------");
				System.out.print("조회할 ID 입력 > ");
				String id = scn.nextLine();
				Member member = MemberManagement.getInstance().getMember(id);
				if (member == null) {
					System.out.println("등록되지 않은 ID 입니다.");
				} else {
					System.out.println(member.toString());
				}
				break;
			case 3:
				System.out.println("-------------------회원 등록-------------------");
				System.out.print("등록할 ID 입력 > ");
				String str1 = scn.nextLine();
				System.out.print("등록할 비밀번호 입력 > ");
				String str2 = scn.nextLine();
				System.out.print("등록할 이름 입력 > ");
				String str3 = scn.nextLine();
				member = new Member();
				member.setId(str1);
				member.setPw(str2);
				member.setName(str3);
				int result = MemberManagement.getInstance().insertMember(member);
				if (result == 1) {
					System.out.println(result + "건이 입력 되었습니다.");
				} else {
					System.out.println("입력이 실패하였습니다.");
				}
				break;
			case 4:
				Member member2 = new Member();
				System.out.println("-------------------회원 수정-------------------");
				System.out.print("수정할 ID 입력 > ");
				String str4 = scn.nextLine();
				member2.setId(str4);
				System.out.print("수정할 비밀번호 입력 > ");
				String str5 = scn.nextLine();
				member2.setPw(str5);
				int result2 = MemberManagement.getInstance().updateMember(member2);
				if (result2 == 1) {
					System.out.println(result2 + "건이 수정되었습니다.");
				} else {
					System.out.println("수정에 실패하였습니다.");
				}
				break;
			case 5:
				System.out.println("-------------------회원 삭제-------------------");
				System.out.print("삭제할 회원 ID 입력 > ");
				String str6 = scn.nextLine();
				int result3 = MemberManagement.getInstance().deleteMember(str6);
				if (result3 == 1) {
					System.out.println(result3 + "건이 삭제되었습니다.");
				} else {
					System.out.println("삭제에 실패하였습니다.");
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			}
		}
	}
}
