package study_0607;

//익명 클래스는 한번만 사용할 클래스를 정의, 정의된 이후 재사용 안함
//람다식은 재사용을 유연하게 할 수 있다.

interface MyFunction2 {
	void print();
}

public class Ex_6_anonyClass {

	public static void main(String[] args) {
		// 이번에는 매개변수 없는 메소드를 구현할 예제이다.
		//인터페이스 객체 명을 f로 선언하고 매개변수 괄호에 아무것도 없이 화살표로 동작을 구현하면 된다.
		
		MyFunction2 f = () -> {
			System.out.println("Hello");
		};
		f.print();
		//한 번 구현된 메소드를 재 사용 할 수도 있다.
		f = () -> {
			System.out.println("안녕");
		};
		f.print();
	}

}
