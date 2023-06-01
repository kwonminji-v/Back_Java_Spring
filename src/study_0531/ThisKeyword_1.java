package study_0531;

//묵시적 this 키워드 자동 추가

//
//#1. 클래스 내부에서 필드, 메서드에 앞에 붙는 자동으로 붙는 this 키워드

class V {
	int m;
	int n;

	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a; // this. 생략시 자동 추가
		this.n = b; // this. 생략시 자동 추가
	}

	void work() {
		this.init(2, 3); // this. 생략시 자동 추가
	}
}

public class ThisKeyword_1 {
	public static void main(String[] args) {
//		#2. 클래스 객체 생성
		V v = new V();
//		#3. 매서드호출 / 필드값 활용
		v.work();
		System.out.println(v.m);
		System.out.println(v.n);
		v.init(5, 7);
		System.out.println(v.m);
		System.out.println(v.n);
	}
}
