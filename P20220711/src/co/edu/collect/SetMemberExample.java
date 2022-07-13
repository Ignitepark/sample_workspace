package co.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 중복요소 제거.
 * Set 컬렉션에 중복 여부 체크 => HashCode, Equals 값이 동일해야 동일한 값으로 이해
 */

class Member {
	private int id;
	private String name;

	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return this.id == member.id && this.name.equals(member.name);
		}
		return false;
	}
}

public class SetMemberExample {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<Member>();

		members.add(new Member(10, "홍길동"));
		members.add(new Member(20, "김길동"));
		members.add(new Member(30, "홍길동"));
		members.add(new Member(10, "홍길동"));

		members.clear();
		if (members.isEmpty()) {
			System.out.println("컬렉션이 비어있음");
		}

		for (Member j : members) {
			System.out.println(j.toString());
		}

	}
}
