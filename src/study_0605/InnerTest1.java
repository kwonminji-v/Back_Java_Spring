package study_0605;

public class InnerTest1 {

	public static void main(String[] args) {
		
		MyOuter1 myOuter = new MyOuter1("홍길동", 20);
		MyOuter1.Inner inner = new MyOuter1.Inner("세종시 세종구");

		System.out.println("고객정보 >> " + inner.getUserInfo());
	}

}
