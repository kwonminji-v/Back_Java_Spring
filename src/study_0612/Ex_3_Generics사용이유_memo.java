package study_0612;

public class Ex_3_Generics사용이유_memo {

}
/*
Generics를 사용하는 이유
1. 타입의 안정성, 코드의 간결화
	- 구체적인 데이터 타입을 인스턴스에 다라 지정할 수 있어 중복의 제거와 타입의 안정성을 동시추구 가능
2. 복수의 제네릭
	- class Person<T, S>
3. 기본 데이터 타입과 제네릭
	- 참조 데이터 타입에서만 사용할 수 있다. 래퍼 (wrapper)클래스를 사용해야 한다.
4. 제네릭의 생략
	- 매개변수의 데이터 타입을 알고 있다면 (위에서 사용되었다면) 생략해도 된다.
5. 메소드의 적용
	- 클래스에서만 쓸 수 있는 것이 아니라 메소드에서도 쓸 수 있다.
6. 제너릭의 제한(Extends)
	- 제너릭으로 올 수 있는 데이터 타입을 특정 클래스의 자식으로 제한할 수 있다.
	- class Person< T extends Info> { }
	
Generics 클래스 사용법
제너릭 타입은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
제너릭 타입은 클래스 또는 인터페이스 이름 뒤에 < > 부호가 붙고 사이에 타입 파라미터가 위치한다.
public class 클래스명 < T > { ... }
public interface 인터페이스명 <T> {...}

Generics 클래스 예시
public class GenericBox<T> {
	private T data;
	여기서 <T>를 타입파라미터라고 한다. 또는 가상의 자료형이라고 하고 메서드 호출과 비슷하게 이해할수도 있는데,
	GenericBox라는 메서드에 String이라는 인자를 넘겨서 String타입의 GenericBox를 리턴받는다는 의미입니다.
	GenericBox<String> genericBox = new GenericBox<>();
			genericBox.setData("내 문자열");
			
	Interface ExInterfaceGeneric<T> {
			T example();
		}
		
	class ExGeneric implements ExInterfaceGeneric<String> {
			@Override
			public String example() {
				return null;
			}
			
인터페이스도 클래스처럼 제네릭으로 설정해두고 활용할 수 있다.
*/
