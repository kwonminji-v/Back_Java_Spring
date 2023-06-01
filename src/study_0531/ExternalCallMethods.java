package study_0531;

class A {

	void print() {
		System.out.println("키키키");
	}

	double sum(int a, double b) {
		return a + b;
	}

	int data() {
		return 3;
	}

	void printMonth(int c) {
		if (c < 0 || c > 12) {
			System.out.println("올바른 달을 입력하세요");
			return;
		}
		System.out.println(c+"월입니다");
	}
}

public class ExternalCallMethods {
	public static void main(String[] args) {
		// #2. 객체생성
		A a = new A();

//		#3. 메서드호출(멤버활용)
		a.print();
		int k = a.data();
		System.out.println(k);
		double result = a.sum(3, 5.2);
		System.out.println(result);
		a.printMonth(5);
		a.printMonth(15);
	}
}
