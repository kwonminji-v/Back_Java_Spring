package jungsuk_0616;

public class Ex_5_TryCatchFinally {

	public static void main(String[] args) {
		// #1. try-catch (fiㅜally 가 없는 구문)
		try {
			System.out.println(3 / 0); // 실행 예외 (ArithmeticException)
			System.out.println("try 구문 정상적 실행 후 종료");
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없다.");
			System.out.println("catch 구문 실행 후 프로그램 종료");
		}
		//예외 처리를 해주지 않았다면 프로그램 실행과 동시에 에러를 만났을 때 종료가 될 것이며, catch 블록을 작성해주었다는 거 자체가 예외처리를 한것이며,
		//JVM은 정상적으로 예외처리를 했다고 인식하며 그대로 프로그램을 실행 시켜주는 것이 가능해집니다.

		// #2. try-catch-finally

		try {
			System.out.println(3 / 0); // 실행 예외 (ArithmeticException)
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없다.");
		} finally {
			System.out.println("뭐든 실행 후 종료해주세용");
		}

	}
}