package co.edu.collect;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		// ArrayList vs. LinkedList

		ArrayList<String> aList = new ArrayList<String>();

		LinkedList<String> lList = new LinkedList<String>();

		long start = System.currentTimeMillis(); // 시작 시점
		for (int i = 0; i < 100000; i++) {
			aList.add(0, Integer.toString(i));
		}
		long end = System.currentTimeMillis(); // 종료 시점
		System.out.println("aList 걸린 시간 : " + (end - start));
		
		start = System.currentTimeMillis(); // 시작 시점
		for (int i = 0; i < 100000; i++) {
			lList.add(0, Integer.toString(i));
		}
		end = System.currentTimeMillis(); // 종료 시점
		System.out.println("lList 걸린 시간 : " + (end - start));
		
	}
}
