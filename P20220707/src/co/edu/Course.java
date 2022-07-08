package co.edu;

public class Course {
	// 필드.
	private String tname;
	private String bname;
	private Student[] students;

	// 생성자.
	public Course() {
	}

	public Course(String tname) {
		this.tname = tname;
	}

	public Course(String tname, String bname, int studentNum) {
		this.tname = tname;
		this.bname = bname;
		this.students = new Student[studentNum];
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void getStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].showInfo();
			}
		}
	}

	public void setStudents(int studentNum) {
		this.students = new Student[studentNum];
	}

	// 학생 정보 등록.
	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	// 점수가 제일 높은 학생의 정보를 반환해주는 코드
	public Student getMaxStudent() {
		int max = 0;
		Student student = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (max < students[i].getScore()) {
					max = students[i].getScore();
					student = students[i];
				}
			}
		}
		return student;
	}

	public double getAvgScore() {
		int sum = 0;
		int num = 0;
		double avg = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				sum += students[i].getScore();
				num++;
			}
		}
		avg = (double) sum / num;
		return avg;
	}
}
