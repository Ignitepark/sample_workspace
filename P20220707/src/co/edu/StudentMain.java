package co.edu;

public class StudentMain {
	// 필드
	private static String name;

	// 메소드
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		Student kim = new Student();
		kim.setSno("22-001");
		kim.setName("김민수");
		kim.setScore(80);

//		System.out.println("이름 : " + kim.getName());
//		kim.showInfo();

		Student park = new Student("22-002", "박희수", 85);
//		park.showInfo();
//		학생 추가.
		Student jin = new Student("22-003", "진정욱", 100);

		Course course = new Course("김철수", "1-3", 25);
		System.out.println("선생님 : " + course.getTname());
		System.out.println("반정보 : " + course.getBname());

		course.addStudent(kim);
		course.addStudent(park);
		course.addStudent(jin);
		course.getStudents();

		Student maxStudent = course.getMaxStudent();

		System.out.printf("%s 반의 평균 점수는 %.1f입니다\n", course.getBname(), course.getAvgScore());

		System.out.println("최고 점수 학생\n학번 : " + maxStudent.getSno() + ", 이름 : " + maxStudent.getName() + ", 점수 : "
				+ maxStudent.getScore());

	}
}
