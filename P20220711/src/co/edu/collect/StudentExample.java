package co.edu.collect;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Scanner scn = new Scanner(System.in);
		students.add(new Student("김민수", 80));
		students.add(new Student("황현익", 75));
		students.add(new Student("이현승", 88));
		int max=0;
		int sum=0;
		String maxName=null;
		System.out.print("학생 이름을 입력하시오 > ");
		String search = scn.nextLine();

		for (int i = 0; i < students.size(); i++) {
			sum+=students.get(i).getScore();
			if(students.get(i).getScore()>max) {
				max=students.get(i).getScore();
				maxName=students.get(i).getName();
			}
			if (search.equals(students.get(i).getName())) {
				System.out.println(students.get(i).getName() + " 학생의 점수는 " + students.get(i).getScore() + "점 입니다.");
			}
		}
		System.out.printf("평균점수 : %.1f\n최고점수 : %d, 최고점수 학생의 이름: %s", ((double) sum / students.size()), max, maxName);
	}
}
