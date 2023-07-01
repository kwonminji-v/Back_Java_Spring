package jungsuk_0624;

interface AAA {
	void abc();
}

class BBB {
	void bcd() {
		System.out.println("class BBB의 bcd()메소드");
	}
}

interface D {
	void abc(int k);
}

public class RefOfInterfaceMethod {
	
	public static void main(String[] args) {
		
				//#1. 인스턴스 메서드 참조 Type 1
				AAA a1 = new AAA () {
					@Override
					public void abc() {
						BBB b = new BBB();
						b.bcd();
					}
				};
				
				//#2. 람다식
				//BBB 라는 클래스 객체인 b를 생성한 후  b객체 안에 들어있는 bcd()를 호출할 것
				//결국 a2에 있는 미완성 메서드는 bcd() 메서드와 동일하다는 의미
				//abc() = bcd()
				AAA a2 = () -> {
					BBB b = new BBB();
					b.bcd();
				};
				
				//abc를 호출하라는 것의 의미는 bcd() 를 만들어서 호출하라는 것
				//#3. 인스턴스 참조 Type 1의 표현 (객체를 먼저 만들어야 함)
				BBB b = new BBB();
				AAA a3 = b::bcd;
				
				
				a1.abc();
				a2.abc();
				a3.abc();
				
				//#1. 인스턴스 메서드 참조 type1의 익명 이너 클래스
				D d = new D() {
						public void abc(int k) {
							System.out.println(k);
						}
				};
				
				//#2. 람다식 줄인 표현
				D d1 = (int k) -> { System.out.println(k);};
				
				//#3. 인스턴스 메서드 참조 type 1 문법 
				//D d2 = 객체 이름 :: 메서드 이름
				D d2 = System.out::println;
				
				
	}
}
