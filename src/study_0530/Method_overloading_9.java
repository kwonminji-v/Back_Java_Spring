/*


 메소드 오버로딩(overloading) 작성 규칙에 대한 3가지 기술
 1. 메소드의 이름이 같아야한다.
 2. 매개변수의 자료형이 달라야 한다.
 3. 매개변수의 개수가 달라야한다.
 4. 매개변수의 순서가 달라야한다.
 
 다음 두 클래스의 차이점을 확인해보자.
 (1) public class 클래스명 { }
 	- 자바 소스 파일 내에 1개만 존재할 수 있는 클래스
 	- 자바 소스 파일명과 같은 이름으로 지정하며, 해당 소스를 대표하는 클래스
 	- 주로 주요 동작에 대한 내용을 작성하며, 소스 파일 Run 실행 시 해당 클래스를 우선으로 찾아 동작을 수행한다.
 	
 (2) class 클래스명 { }
 	- 소스파일 내에 여러 개를 생성 할 수 있는 클래스
 	- 주로 객체를 생성하여 사용하는 참조 클래스 형식으로 사용한다.
 	- 주요 동작에 대한 내용을 작성하여 Run As로 설정하여 실행 할 수 있다.

오버라이딩(overriding)에 대해 서술
1. 자식 클래스의 메소드로 부모 클래스의 메소드를 재정의한다. -> 확장한다.
2. 부모 클래스에서 물려준 메소드에서 형식은 같고 그 안의 실행문을 다르게 하여 작성한다.
3. 자식 클래스 객체 생성 후 메소드 호출 동작 순서
	- 호출한 메소드를 자식 클래스에서 탐색 -> 자식 클래스에 없으면 부모 클래스로 이동하여 탐색
	- 즉, 부모 클래스에 있는 메소드를 자식 클래스에서 재정의 했기 때문에 부모 클래스 메소드는 동작하지 않는다.
	
부모 클래스의 기존 메소드와 자식 클래스의 오버라이딩 메소드의 있는 메소드 이름이 같다.
기존 메소드와 오버라이딩 메소드의 자료형, 매개변수의 자료형, 개수, 순서가 같아야한다. 
(같은 형식)

** 오버라이딩 메소드는 반드시 자식 클래스에 정의해야 한다 (상속이 필수 조건 !)
	 즉, 오버라이딩은 메소드의 중괄호 { } 안에 실행문 내용만 다른 메소드를 자식 클래스에 재정의 하는 것

 */



package study_0530;

public class Method_overloading_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}