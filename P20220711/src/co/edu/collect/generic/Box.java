package co.edu.collect.generic;
/*
 * 제네릭 : 타입을 클래스 정의 시점이 아닌, 사용 시점에 정하는 방식.
 */
public class Box<T> {
	private T obj;

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}
}
