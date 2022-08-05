package com.bank.member;

import com.bank.common.DAO;

public class MemberManage extends DAO {

	private static MemberManage mm = new MemberManage();

	private MemberManage() {
	}

	public static MemberManage getInstance() {
		return mm;
	}

	public Member loginInfo(String id) {
		Member member = null;
		try {
			conn();
			String sql = "select * from bankmember where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberName(rs.getString("member_name"));
				member.setRole(rs.getString("role"));
			}
		} catch (Exception e) {
		} finally {
			disconnect();
		}
		return member;
	}

	public int registerCustomer(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into bankmember(member_id, member_pw, member_name, member_role) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getRole());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
}
