package co.edu.api;

import java.lang.reflect.Method;

public class ClassEx {
	public static void main(String[] args) {
		// 클래스의 정보 얻어오기.

		try {
			Class cls = Class.forName("java.lang.String");
			cls = String.class;

			System.out.println(cls.getName());

			Method[] methods = cls.getMethods();

			for (Method method : methods) {
				System.out.println(method.getName());
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // 자바라고하는 패키지에 있는 lang이라고 하는 패키지에 String에 있는 정보를 읽어오고 싶습니다.

	}
}
