package jungsuk_0621;


class A {
	public <T> void method (T t) {
		//System.out.println(t.length());
		//length() 메서드 에러 발생 불가능 -> type T 라는것이 아직 .length라는 걸 가지고 있지 않다고 인식
		//why? 직접 String 이라는 타입을 입력해서 String을 넣는다고 작성 했어도, 문법적으로 T는 다른 타입들도 받을 수 있는걸로 인식합니다.
		//그래서 어떤 타입의 클래스라도 가지고 있는 메서드만 호출이 가능하다. ->" Object 메서드만 호출이 가능합니다. "		
		System.out.println(t.equals("안녕하세요"));
	}
}




public class Ex3_genericMethod {

	public static void main(String[] args) {

		A a = new A();
		a.<String>method("안녕하세요");
		
	}

}
