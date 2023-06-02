package study_0602;


/*
다운캐스팅 : 자식 클래스의 타입으로 부모 클래스의 객체를 참조하는 것 
다운캐스팅은 기본적으로 업캐스팅 된 객체에만 적용 가능하며, 이를 통해 자식 클래스의
필드와 메소드에 접근한다, 명시적으로 타입변환을 해야한다.
다운캐스팅은 항상 안전하게 이루어지지 않으므로, instanceof를 사용하여 실제
참조하는 객체가 해당 클래스의 인스턴스인지 확인하는 것이 좋다.
 */

class Parent {
	public void sayHello( ) {
		System.out.println("Hello from Parent");
	}
}

class Child extends Parent {
	public void sayHello() {
		System.out.println("Hello from Child");
	}
	public void sayGoodbye() {
		System.out.println("Goodbyg from Child");
	}
}


public class Ex_8_DownCasting {

	public static void main(String[] args) {
		Parent p = new Child();   //업캐스팅
		p.sayHello();  // 출력 : "Hello from Child"
		
		if(p instanceof Child) {
			Child c = (Child) p;    //다운 캐스팅
			c.sayGoodbye();  //출력 : "Goodbye from Child"

		}
	}
}
//Parent p = new Child();  -> 업캐스팅
//Child c = (Child) p;  -> 다운캐스팅
