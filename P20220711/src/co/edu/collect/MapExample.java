package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 학생의 이름과 점수 => Map 타입에 저장. 
 * 김민수, 80 / 황현익, 75 / 이현승, 88
 * Scanner 클래스를 이용하여 사용자를 입력받아(학생의 이름) > 학생의 점수 반환
 */
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		String maxName = null;
		map.put("김민수", 80);
		map.put("황현익", 75);
		map.put("이현승", 88);

		System.out.print("학생 이름을 입력하시오 > ");
		String search = scn.nextLine();

		Set<String> set = map.keySet();

		Set<Entry<String, Integer>> setEntry = map.entrySet();

		for (Entry<String, Integer> ent : setEntry) {
			String key = ent.getKey();
			Integer val = ent.getValue();
			sum += val;
			if (val > max) {
				maxName = key;
				max = val;
			}
		}
		for (String key : set) {
			if (search.equals(key)) {
				Integer score = map.get(key);
				System.out.println(search + " 학생의 점수는 " + score + "점 입니다.");
			}
		}
		System.out.printf("평균점수 : %.1f\n최고점수 : %d, 최고점수 학생의 이름: %s", ((double) sum / set.size()), max, maxName);
	}
}
