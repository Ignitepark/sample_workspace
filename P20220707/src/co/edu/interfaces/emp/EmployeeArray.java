package co.edu.interfaces.emp;

import java.util.Scanner;

/*
 * 배열기반 기능 구현(implement)
 */
public class EmployeeArray implements EmployeeList {

	private static EmployeeArray instance = new EmployeeArray();

	private EmployeeArray() {
	}

	public static EmployeeArray getInstance() {
		return instance;
	}

	Employee[] list; // 사원 정보를 담기 위한 배열 선언.
	int empNum;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() { // 추가 기능.
		System.out.print("사원 수를 입력하시오 > ");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];
	}

	@Override
	public void input() {
		System.out.printf("%d사번을 입력하시오 > ", (empNum + 1));
		int no = Integer.parseInt(scn.nextLine());

		System.out.print("사원 이름을 입력하시오 > ");
		String name = scn.nextLine();

		System.out.print("급여 정보를 입력하시오 > ");
		int sal = Integer.parseInt(scn.nextLine());

		list[empNum++] = new Employee(no, name, sal);
	}

	@Override
	public Employee search(int empId) {
		for (int i = 0; i < empNum; i++) {
			if (list[i].getEmployeeId() == empId) {
				return list[i];
			}
		}
		return null;
	}

	@Override
	public void printList() {
		for (int i = 0; i < empNum; i++) {
			if (list[i] != null) {

				System.out.printf("사원번호 :%5d, 이름 :%10s, 급여 :%7d\n", list[i].getEmployeeId(), list[i].getName(),
						list[i].getSalary());
			}
		}
	}
}
