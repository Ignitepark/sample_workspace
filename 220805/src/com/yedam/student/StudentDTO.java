package com.yedam.student;

public class StudentDTO {

//	이름              널?       유형            
//			--------------- -------- ------------- 
//			STUDENT_ID      NOT NULL NUMBER(5)     
//			STUDENT_NAME    NOT NULL VARCHAR2(15)  
//			STUDENT_CLASS            VARCHAR2(15)  
//			STUDENT_ADDRESS NOT NULL VARCHAR2(100) 
//			STUDENT_TELL             VARCHAR2(15)  
//			STUDENT_KOR              NUMBER        
//			STUDENT_ENG              NUMBER        
//			STUDENT_MATH             NUMBER        

	private int studentId; // 학번
	private String studentName; // 학생이름
	private String studentClass; // 강의실
	private String studentAddress; // 학생주소
	private String studentTell; // 학생 전화번호
	private int studentKor; // 국어
	private int studentEng; // 영어
	private int studentMath; // 수학

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentTell() {
		return studentTell;
	}

	public void setStudentTell(String studentTell) {
		this.studentTell = studentTell;
	}

	public int getStudentKor() {
		return studentKor;
	}

	public void setStudentKor(int studentKor) {
		this.studentKor = studentKor;
	}

	public int getStudentEng() {
		return studentEng;
	}

	public void setStudentEng(int studentEng) {
		this.studentEng = studentEng;
	}

	public int getStudentMath() {
		return studentMath;
	}

	public void setStudentMath(int studentMath) {
		this.studentMath = studentMath;
	}

	@Override
	public String toString() {
		return "학생정보 [학번 : " + studentId + ", 이름 : " + studentName + ", 교실 : " + studentClass + ", 주소 : "
				+ studentAddress + ", 전화번호 : " + studentTell + "]";
	}

}
