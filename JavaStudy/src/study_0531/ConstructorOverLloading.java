package study_0531;

//다양한 생성자를 사용한다양한 객체 생성 방법
class Z {
	Z() {
		System.out.println("첫번째 생성자");
	}

	Z(int a) {
		System.out.println("두번째 생성자");
	}

	Z(int a, int b) {
		System.out.println("세번째 생성자");
	}
}

public class ConstructorOverLloading {
	public static void main(String[] args) {
		Z z1 = new Z();
		Z z2 = new Z(3);
		Z z3 = new Z(3,5);
	}
}
