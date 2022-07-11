package co.edu;

public class ThrowExceptionEx2 {
	public static void main(String[] args) {

		String[] str = { "100", "200", "300", "400" };
		try {
			subMethod(str);
		} catch (NumberFormatException e1) {
			System.out.println("예외 종류 : NumberFormat 예외");
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("예외 종류 : 배열의 범위를 초과하였습니다.");
		} catch (Exception e3) {
			System.out.println("예외 종류 : 알 수 없는 예외.");
		} finally {
			// 정상실행 혹은 예외 발생 경우에도 반드시 실행해야 하는 구문
			System.out.println("프로그램의 정상 종료");
		}

		System.out.println("프로그램 종료");
	}

	public static void subMethod(String[] strAry) //
			throws NumberFormatException, ArrayIndexOutOfBoundsException {

		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(strAry[i]);
			System.out.println(num);
		}
	}
}
