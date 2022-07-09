package co.edu.interfaces.emp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayList implements EmployeeList {

	private static EmployeeArrayList instance = new EmployeeArrayList();

	private EmployeeArrayList() {
	}

	public static EmployeeArrayList getInstance() {
		return instance;
	}

	ArrayList<Employee> list;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		System.out.println("배열을 초기화 합니다.");
		list = new ArrayList<>();
	}

	@Override
	public void input() {
		System.out.printf("%d사번을 입력하시오 > ", (list.size() + 1));
		int no = Integer.parseInt(scn.nextLine());
		System.out.print("사원 이름을 입력하시오 > ");
		String name = scn.nextLine();

		System.out.print("급여 정보를 입력하시오 > ");
		int sal = Integer.parseInt(scn.nextLine());

		list.add(new Employee(no, name, sal));
	}

	@Override
	public Employee search(int empId) {
		for (int i = 0; i < list.size(); i++) {
			if (empId == list.get(i).getEmployeeId()) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public void printList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("사원 번호 : %4d, 이름 : %5s, 급여 : %4d\n", list.get(i).getEmployeeId(), list.get(i).getName(),
					list.get(i).getSalary());
		}
	}

}
