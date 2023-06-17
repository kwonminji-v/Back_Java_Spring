package jungsuk_0616;

//#1. 사용자 일반 예외 (Checked exception)  -> 반드시  사용자가 예외처리를 해줄 의무가 생기는 예외

class MyException extends Exception {
	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message); // 부모 Exception 클래스 안에 있는 메서드를 그대로 사용합니다.
	}
}

//#2. 사용자의 실행 예외 (unChecked exception = runtime exception
class MyRTException extends RuntimeException {
	public MyRTException() {
		super();
	}

	public MyRTException(String message) {
		super(message);
	}
}

//#3. 사용자 예외 객체 생성 
class B {
	MyException me1 = new MyException();
	MyException me2 = new MyException(" 예외 메세지 : MyException ");

	MyRTException me3 = new MyRTException();
	MyRTException me4 = new MyRTException("예외 메세지 : MyRTException");

//#4. 예외 던지기 (throw) : 던진 시점에서 예외 발생 
//@방법 1 . 예외를 직접 처리
	void abc_1(int num) {
		try {
			if (num > 70)
				System.out.println("num이 70보다 크면 정상작동");
			else
				throw me1; // 예외를 던진 이 시점에서 예외가 100% 발생시킵니다.
		} catch (MyException e) {
			System.out.println("예외 처리 1");
		}
	}

	void bcd_1() {
		abc_1(65);
	}

	// @방법2 . 예외 전가
	void abc_2(int num) throws MyException {

			if(num > 70)
				System.out.println("정상작동");
			else
				throw me1;  //예외를 던진 시점에서 예외 발생
	}
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("예외 처리 2");
		}
	}
}

public class Ex_7_userException {
	public static void main(String[] args) {
		B b = new B();
		b.bcd_1();
		b.bcd_2();

	}
}
