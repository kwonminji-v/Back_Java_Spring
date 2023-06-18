package jungsuk_0616;

public class Ex_8_ExceptionMethod_1 {

	public static void main(String[] args) {
		// #1. 예외 객체 생성 시 메세지 전달하지 않는 경우
		try {
			throw new Exception(); // 이 시점에서 예외 발생 (JVM에게 전달) - 전달되는 메세지는 x
			//기본생성자 같은 경우에는 아무런 메세지를 가지고 있지 않는다.
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e객체 안에 들어 있는 메세지를 전달해주는 getMessage메서드를 활용해 메세지 전달
		}

		// #2. 예외 객체 생성 시 메세지 전달하는 경우
		try {
			throw new Exception("예외메세지 전달할거야"); //시작하자마자  이 시점에서 예외 발생
			//생성자에 인자로 메세지를 전달해주면 getMessage메서드를 활용해 전달된 메세지를 출력할 수 있습니다.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
