package jungsuk_0616;

public class Ex_1_Inner {

	class InstanceInner {  //인스턴스 내부 클래스 
		int iv = 100;
		//static int cv = 100;
		final static int CONST = 100; 
		//다만 final과 static이 동시에 붙은 변수는 상수(constant) 이므로 모든 내부 클래스에서 정의가 가능하다.
	}
	
	static class StaticInner {   // static 내부 클래스
		int iv = 200;
		static int cv = 300;  //-> static class 만 static 멤버를 정의할 수 있다.
	}
	
	void myMethod() {  //인스턴스 메서드 (객체생성 필요)
			class LocalInner {  //지역 내부 클래스
				int iv = 300;
				//static int cv = 300; -> static 변수 선언 불가능
				final static int CONST = 300;
			}
			LocalInner in = new LocalInner();
			System.out.println("외부클래스 안의 인스턴스 메서드 = "  + in.iv);
			System.out.println("외부클래스 안의 인스턴스 메서드 = "  + in.CONST);
			
	}
	
	
	public static void main(String[] args) {
		System.out.println("내부 클래스 안의 멤버변수 = " + InstanceInner.CONST);
		System.out.println("내부 클래스 안의 멤버변수 = " + StaticInner.cv);
		
		
		Ex_1_Inner ex1 = new Ex_1_Inner();
		ex1.myMethod();

	}

}
