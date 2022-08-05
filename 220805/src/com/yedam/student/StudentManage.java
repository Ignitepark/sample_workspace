package com.yedam.student;

import com.yedam.common.DAO;

//std 관련 sql을 다 작성
public class StudentManage extends DAO {
	private static StudentManage sm = null;

	private StudentManage() {
	}

	public static StudentManage getInstance() {
		if (sm == null) {
			sm = new StudentManage();
		}
		return sm;
	}

	public int insertStudent(StudentDTO student) {
		int result = 0;
		try {
			conn();
			String sql = "insert into student" + "(student_id,STUDENT_NAME,STUDENT_CLASS,STUDENT_ADDRESS,STUDENT_TELL)"
					+ "values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student.getStudentId());
			pstmt.setString(2, student.getStudentName());
			pstmt.setString(3, student.getStudentClass());
			pstmt.setString(4, student.getStudentAddress());
			pstmt.setString(5, student.getStudentTell());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 국어 점수 입력
	public int insertKor(StudentDTO student) {
		int result = 0;
		try {
			conn();
			String sql = "update student set student_kor = ?  where student_id= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student.getStudentKor());
			pstmt.setInt(2, student.getStudentId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 수학 점수 입력
	public int insertMath(StudentDTO student) {
		int result = 0;
		try {
			conn();
			String sql = "update student set student_math = ?  where student_id= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student.getStudentMath());
			pstmt.setInt(2, student.getStudentId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 영어 점수 입력
	public int insertEng(StudentDTO student) {
		int result = 0;
		try {
			conn();
			String sql = "update student set student_eng = ?  where student_id= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student.getStudentEng());
			pstmt.setInt(2, student.getStudentId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 학생 정보 변경
	// 전화번호 변경
	public int updateTell(StudentDTO student) {
		int result = 0;
		try {
			conn();
			String sql = "update student set student_Tell = ?  where student_id= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getStudentTell());
			pstmt.setInt(2, student.getStudentId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 학생정보 조회
	public StudentDTO getStudent(int id) {
		StudentDTO std = null;
		try {
			conn();
			String sql = "SELECT * FROM student where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				std = new StudentDTO();
				std.setStudentId(rs.getInt("student_id"));
				std.setStudentName(rs.getString("student_name"));
				std.setStudentTell(rs.getString("student_Tell"));
				std.setStudentAddress(rs.getString("student_address"));
				std.setStudentClass(rs.getString("student_class"));
				std.setStudentKor(rs.getInt("student_kor"));
				std.setStudentEng(rs.getInt("student_eng"));
				std.setStudentMath(rs.getInt("student_math"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return std;
	}
}
