package co.edu.io.memo;

import java.io.FileInputStream;
import java.io.Serializable;

/*
 * 번호, 날짜, 내용
 */
public class Memo implements Serializable { // 바이트 Type의 자료와 직렬화 하는 방식
	private int no;
	private String date;
	private String content;
	public Memo(int no, String date, String content) {
		this.no = no;
		this.date = date;
		this.content = content;
	}
	
	public Memo() {
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "[번호 : " + no + ", 날짜 : " + date + ", 내용 : " + content + "]";
	}
	
	
}
