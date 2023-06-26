package study_0531;

class O {
	 int m;
	 int n;
	void init(int m, int n) {//this라는 키워드가 없다 --> 초기값으로
		m=m;
		n=n;
	}// 매개변수와 멤버변수의 이름이 다르면 대입되고, 같으면 초기값이 됨.
}
class P { //this가 있다.
	int m;
	int n;
	void init(int m, int n) {
		this.m=m;
		this.n=n;
	}
}
public class ThisKeyword_2 {
	public static void main(String[] args) {
		O o = new O();
		o.init(2, 4);
		
		System.out.println(o.m);
		System.out.println(o.n);
		
		P p = new P();
		p.init(5, 10);
		
		System.out.println(p.m);
		System.out.println(p.n);
	}
}
