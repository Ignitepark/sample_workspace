package member;

import java.util.ArrayList;
import java.util.List;

import example.DAO;

public class MemberManagement extends DAO {

	private static MemberManagement mm = null;

	private MemberManagement() {
	}

	public static MemberManagement getInstance() {
		if (mm == null) {
			return new MemberManagement();
		} else {
			return mm;
		}
	}

	/*
	 * private static MemberManagement instance;
	 * 
	 * private MemberManagement() { }
	 * 
	 * public MemberManagement getInstance() { return instance; }
	 */

	public List<Member> getMemberList() {
		List<Member> list = new ArrayList<>();
		Member member = null;
		try {
			conn();
			String sql = "SELECT * FROM member";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				list.add(member);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	public Member getMember(String id) {
		Member member = null;
		try {
			conn();
			String sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return member;
	}

	public int insertMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	public int updateMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set pw = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getId());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

	public int deleteMember(String id) {
		int result = 0;
		try {
			conn();
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}
}
