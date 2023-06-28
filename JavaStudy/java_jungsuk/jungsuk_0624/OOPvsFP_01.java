package jungsuk_0624;

//추상메서드를 담고 있는 인터페이스를 정의
interface A {
	void abc();
}

//인터페이스를 구현한 자식클래스이기 때문에 미완성 메서드를 구현할 의무가 있음
class B implements A {
	@Override
	public void abc() {
		System.out.println("메서드 내용 : 자식클래스로 객체를 생성한 후 A 인터페이스 안에 정의된 메서드 호출");
	}
}

public class OOPvsFP_01 {
	public static void main(String[] args) {

		// #1. 객체지향 프로그래밍 문법(OOP에서 메서드를 생성)
		// 클래스 속에 있는 모든 메서드를 호출하기 위해서는 객체를 생성해야 함
		A a1 = new B();
		a1.abc();

		// #2. 객체 지향 프로그래밍 문법 -> 익명이너클래스 사용 방법
		// 자식 클래스를 컴파일러에게 만들어 달라고 한 후 객체를 사용
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("메서드 내용 : 익명 이너클래스 사용하여 호출");
			}
		};
		a2.abc();
		
		//#3. 함수적 프로그래밍 문법(람다식) : 익명 이너클래스를 축약
		A a3 = () -> {System.out.println("메서드 내용 : 람다식으로 정의된 메서드 호출");};
		a3.abc();
	}

}







