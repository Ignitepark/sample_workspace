package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {

//  java <-> DB 연결 할때 쓰는 객체
	protected Connection conn = null;
	// Select(조회) 결과 값 반환 반는 객체
	protected ResultSet rs = null;
	// Query문을 담고 Query문 실행하는 객체
	protected PreparedStatement pstmt = null;
	// Query문을 담고 Query문 실행하는 객체
	protected Statement stmt = null;

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "test";
	String pw = "1234";

	public void conn() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void disconnect() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
