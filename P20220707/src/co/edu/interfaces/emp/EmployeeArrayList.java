package co.edu.interfaces.emp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayList implements EmployeeList {

	ArrayList<Employee> list;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		System.out.println("사원 ");
	}

	@Override
	public void input() {
		System.out.printf("%d사번을 입력하시오 > ", list.size());
		int no = Integer.parseInt(scn.nextLine());
		System.out.print("사원 이름을 입력하시오 > ");
		String name = scn.nextLine();

		System.out.print("급여 정보를 입력하시오 > ");
		int sal = Integer.parseInt(scn.nextLine());

		list.add(new Employee(no, name, sal));
	}

	@Override
	public Employee search(int empId) {
		return null;
	}

	@Override
	public void printList() {

	}

}
