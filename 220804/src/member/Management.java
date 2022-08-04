package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import example.DAO;

public class Management extends DAO {

	Scanner scn = new Scanner(System.in);

	public Management() {
		// 전체 조회
		showInfo();
		// 한건 조회
//      getMember();
		// 한건 입력
//      insertInfo();
		// 수정
//      updateInfo();
		// 삭제
//      deleteInfo();
	}

	private void deleteInfo() {
		int result = 0;
		try {
			conn();
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, scn.nextLine());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		if (result == 1) {
			System.out.println(result + "건이 삭제 완료되었습니다.");
		} else {
			System.out.println("삭제에 실패하였습니다.");
		}
	}

	private void updateInfo() {
		int result = 0;
		try {
			conn();
			String sql = "update member set pw = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "4321");
			pstmt.setString(2, "B");
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		if (result == 1) {
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("수정에 실패하였습니다.");
		}

	}

	// 한건 입력
	private void insertInfo() {
		int result = 0;
		try {
			// 1.db연결
			conn();
			// 2.query 작성
			String sql = "insert into member values(?,?,?)";
			// 3.창구 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "F");
			pstmt.setString(2, "1234");
			pstmt.setString(3, "싫담");
			// DML (insert, update, delete) -> executeUpdate()
			// Select -> executeQuery()
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		if (result == 1) {
			System.out.println("정상적으로 입력되었습니다.");
		} else {
			System.out.println("입력에 실패하였습니다.");
		}

	}

	private void getMember() {
		Member mem = null;

		try {
			conn();
			String sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "B");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				mem = new Member();
				mem.setId(rs.getString("id"));
				mem.setPw(rs.getString("pw"));
				mem.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		System.out.println(mem.toString());
	}

	// 전체 조회
	private void showInfo() {
		List<Member> list = new ArrayList<>();
		Member mem = null;

		try {
			// 1. 데이터 베이스 연결 conn() 메소드 이용
			conn();
			// 2. query 작성
			String sql = "select * from member";
			// 3. 연결된 DB(java<->Database)에 query 문 보낼 수 있는 창구 생성
			stmt = conn.createStatement();
			// 4. 3번에서 만든 창구로 query 문 보냄
			// ResultSet(rs) select 조회할 때만 사용
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				mem = new Member();
				mem.setId(rs.getString("id"));
				mem.setPw(rs.getString("pw"));
				mem.setName(rs.getString("name"));
				list.add(mem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		for (Member member : list) {
			System.out.println(member.toString());
		}
	}
}