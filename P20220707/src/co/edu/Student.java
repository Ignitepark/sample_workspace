package co.edu;
/*
 * 클래스 연습 StudentMain에서 사용됨.
 */
public class Student {
	// 필드.
	private String sno;
	private String name;
	private int score;

	// 생성자 : 기본 생성자.
	public Student() {
	}
	// 생성자 오버로딩.
	public Student(String sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
	}

	// getter, setter 직접 작성
	public void setSno(String sno) { // 학번에 값을 대입
		this.sno = sno;
	}

	public String getSno() {
		return this.sno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return this.score;
	}

	// 전체 정보를 보여주는 showInfo()
	public void showInfo() {
		System.out.printf("학번 : %s, 이름 : %s, 점수 : %d\n", sno, name, score);
	}

}
