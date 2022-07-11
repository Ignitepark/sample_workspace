package co.edu.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		// 데이터를 여러 건 저장하기 위하여 배열 사용.
		// 배열보다 조금 더 편한 것이 컬렉션 ArrayList. => 인덱스 값 지정, 동일한 값을 다른 인덱스 값으로 저장가능.
		// 컬렉션 HashSet => 인덱스 값을 지정하지 않아 동일한 값을 저장할 수 없음.
		
		System.out.println("===HashSet===");
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("홍길동");
		set.add("박길동");
		set.add("홍길동");
		
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) { // 컬렉션에서 다음 번에 가지고 올 요소가 있는지 체크하는 명령어.
			System.out.println(iter.next()); // next : 실제 요소를 하나 선택하여 가지고 나오는 명령어.
		}
		
		System.out.println("===ArrayList===");
		
		ArrayList<String> aryList = new ArrayList<>();
		
		aryList.add("홍길동");
		aryList.add("김길동");
		aryList.add("홍길동");
		aryList.add("박길동");
		aryList.add("홍길동");
		
		System.out.println(aryList.size());
		for (int i = 0 ; i < aryList.size();i++) {
			System.out.println(aryList.get(i));
		}
	}
}
