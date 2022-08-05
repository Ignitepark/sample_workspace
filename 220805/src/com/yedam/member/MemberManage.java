package com.yedam.member;

import com.yedam.common.DAO;

//member 관련 sql을 다 작성
public class MemberManage extends DAO {
	private static MemberManage mm = null;

	private MemberManage() {
	}

	public static MemberManage getInstance() {
		if (mm == null) {
			mm = new MemberManage();
		}
		return mm;
	}

	public MemberDTO login(MemberDTO member) {
		MemberDTO mem = null;
		try {
			conn();
			String sql = "SELECT * FROM member WHERE member_id = ? AND member_pw = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				mem = new MemberDTO();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberName(rs.getString("member_name"));
				mem.setMemberBelong(rs.getString("member_belong"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return mem;
	}

}
