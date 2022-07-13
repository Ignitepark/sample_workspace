package co.edu.collect;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentExample2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		Scanner scn = new Scanner(System.in);
		set.add(new Student("김민수", 80));
		set.add(new Student("황현익", 75));
		set.add(new Student("이현승", 88));
		String maxName = null;
		int max, sum;
		max = sum = 0;

		System.out.print("학생 이름을 입력하시오 > ");
		String search = scn.nextLine();

		for (Student val : set) {
			sum += val.getScore();
			if (val.getScore() > max) {
				max = val.getScore();
				maxName = val.getName();
			}
			if (val.getName().equals(search)) {
				System.out.println(val.getName() + " 학생의 점수는 " + val.getScore() + "점 입니다.");
			}
		}
		System.out.printf("평균점수 : %.1f\n최고점수 : %d, 최고점수 학생의 이름: %s", ((double) sum / set.size()), max, maxName);
	}
}
