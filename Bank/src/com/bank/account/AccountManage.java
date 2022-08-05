package com.bank.account;

import com.bank.common.DAO;

public class AccountManage extends DAO {
	private static AccountManage am = new AccountManage();

	private AccountManage() {
	}

	public static AccountManage getInstance() {
		return am;
	}

	// 계좌 개설
	public int insertAccount(Account account) {
		int result = 0;
		try {
			conn();
			String sql = "insert into account(Account_id,member_id) values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getAccountId());
			pstmt.setString(2, account.getMemberId());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

	public int updateMoney(Account account, int cmd) {
		int result = 0;
		try {
			conn();
			String sql2 = "select balance from account where account_id = ?";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, account.getAccountId());
			rs = pstmt.executeQuery();
			int balance = 0;
			if (rs.next()) {
				balance = rs.getInt("balance");
			}
			if (cmd == 1) {
				account.setBalance(balance + account.getBalance());
			} else if (cmd == 2) {
				if (balance >= account.getBalance()) {
					account.setBalance(balance - account.getBalance());
				} else {
					System.out.println("잔고가 부족합니다.");
					return 0;
				}
			}
			String sql = "update account set balance = ? where account_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, account.getBalance());
			pstmt.setString(2, account.getAccountId());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

	public int delAccount(String id) {
		int result = 0;

		try {
			conn();
			String sql = "delete from account where account_id = ?";
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

	// 이체
	public void transferMoney(String toAccount, String fromAccount, int balance) {
		int result = 0;
		try {
			conn();
			String sql = "select balance from account where account_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, fromAccount);
			rs = pstmt.executeQuery();

			int fromBalance = rs.getInt("balance");
			if (fromBalance < balance) {
				System.out.println("잔고가 부족합니다");
				return;
			}

			String sql2 = "update account set balance = balance - ? where account_id = ?";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, balance);
			pstmt.setString(2, fromAccount);

			result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("정상 출금");
				String sql1 = "update account set balance = balance + ? where account_id = ?";
				pstmt = conn.prepareStatement(sql1);
				pstmt.setInt(1, balance);
				pstmt.setString(2, toAccount);
				int result2 = pstmt.executeUpdate();
				if (result2 == 1) {
					System.out.println("이체 완료");
				} else {
					System.out.println("이체 실패");
				}
			} else {
				System.out.println("출금 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
