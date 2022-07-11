package co.edu.api;

public class StringText {
	public static void main(String[] args) {
		String[] str = { "자바", "자바다", "이것이자바다", "자바스크립트", "자 바" };
		// "자바" 문자열 포함.
		int num = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].indexOf("자바") != -1) {
				num++;
			}
		}
		System.out.println("자바 문자가 포함된 배열요소 : " + num);

		// 파일의 확장자, 파일명
		String path = "c:/images/hello.png";
		int pIndex = path.indexOf(".");
		/*
		 * int a = 0; int b = 0; int numSearch = 0; for (int i = 0; i < path.length();
		 * i++) { if (path.charAt(i) == '/') { a++; } } for (int i = 0; i <
		 * path.length(); i++) { if (path.charAt(i) == '/') { b++; if (b == a) {
		 * numSearch = i + 1; } } }
		 */
		int fromInd = path.lastIndexOf("/"); // 뒤에서부터 확인하는 명령어. lastIndexOf
		System.out
				.println("파일의 확장자 : " + path.substring(pIndex + 1) + ", 파일명 : " + path.substring(fromInd + 1, pIndex));

		String tel = "";
		String[] tels = { " 031", " 210 3", "34 78 " }; // tel에 031-2103-3478
		tel = tels[0].trim() + "-" + tels[1].trim().replace(" ", "") + "-" + tels[2].trim().replace(" ", "");

		/*
		 * for (int i = 0; i < tels.length; i++) { for (int j = 0; j < tels[i].length();
		 * j++) { if (tels[i].charAt(j) != ' ') { tel += tels[i].charAt(j); } } if (i !=
		 * tels.length - 1) { tel += "-"; } }
		 */
		System.out.println(tel);

		String[] ssn = { "970403-1234123", "010503 3456123", "980123/2412345", "0202023217891" };
		for (int i = 0; i < ssn.length; i++) {
			checkGender(ssn[i]);
		}
	}

	public static void checkGender(String ssn) {

		String[] str = ssn.split("");
		String replaceSsn = "";
		for (int i = 0; i < str.length; i++) {
			replaceSsn += str[i].replace("-", "").replace(" ", "").replace("/", "");
		}

		char sex = replaceSsn.charAt(6);

//		char num;
//		if (ssn.length() == 13) {
//			num = ssn.charAt(6);
//		} else {
//			num = ssn.charAt(7);
//		}
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}
	}
}
