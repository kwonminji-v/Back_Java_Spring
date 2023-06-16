package java_jungsuk;



class A {  //A는 B의 내부 클래스
	int i = 100;
	B b = new B();

	class B {  //B는 A의 내부 클래스
		void method() {
//		A a = new A();
//		System.out.println(a.i);
			
		System.out.println(i);  //객체 생성 없이 외부 클래스의 멤버 접근 가능
		}
	}
}
		
//class C {
//	B b = new B();
//	//B를 A클래스 내부에서만 사용한다는 가정하에 내부클래스로 만들었기 때문에 class C에서는ㄴ 사용이 안된다.(캡슐화, 
//}
public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b = new B();
//		b.method();  -> 내부클래스화 됨과 동시에 class B는 class A의 멤버처럼 다뤄지게 된다.
		A a = new A();
	}

}
