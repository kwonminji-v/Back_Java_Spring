package study_0602;

import study_0601.Student_2;

/*
abstract 정의
실체가 없는, 구현되지 않은 상태를 의미한다.
기능이 없고 선언만 되어있다는 의미
- 클래스 : 추상 클래스로 사용된다
- 멤버 메서드 : 추상 메서드로 사용된다
추상 메서드(abstract method)
- 구현되지 않은 메서드. 즉 본체가 없는 메서드
예) run () ;
구현 메서드 (concreate method)
- 구현된 메서드, 즉 본체가 있는 메서드 예) run () {.....}
추상 클래스 정의 ...클래스 선언 시 abstract로 지정된 클래스
추상 클래스 특징 - 추상 클래스는 인스턴스 생성이 불가능하다.
 - 추상 클래스 멤버 : 멤버 변수 , 멤버 메서드 , 생성자, 추상 메서드
 - 추상 메서드가 없어도 추상 클래스로 선언할 수 있다.
 - 클래스의 멤버에 추상 메서드가 있으면 그 클래스는 반드시 추상 클래스로 선언해야한다.
 - 업캐스팅 타입으로 사용 가능하다. 
 추상 클래스의 용도
  - 하위 클래스에서 구현해야 하는 기능을 상위 클래스의 추상 메서드의 형식을 빌려와
     하위 클래스에서 구현 하는 방법으로 통일성과 강제성을 띈다 표준화가 가능하다.

*/
public class Ex_10_StudentTest {

	public static void main(String[] args) {
			//Student st = new Student();   -> 추상 클래스는 객체 생성이 불가능하다.
			Ex_4_Student st  = new EX_5_University("홍길동", 3, 22, "차범근");  //Upcasting
			Ex_3_Elementary m = new Ex_3_Elementary("이순신", 2 , "홍명보");
			
			System.out.println("학생 이름" + st.getName());
			System.out.println(st.getTeacher());
			System.out.println(m.getTeacher());
	}

}
