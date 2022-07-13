package co.edu.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {

		Queue<String> que = new LinkedList<>();

		que.offer("홍길동");
		que.offer("김민수");
		que.offer("황순호");

		while (!que.isEmpty()) {
			String hole = que.poll();
			System.out.println(hole);

			if (que.isEmpty()) {
				System.out.println("Queue에 더이상 값이 없습니다.");
			}
		}

	}
}
