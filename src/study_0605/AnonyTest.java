package study_0605;

//------익명클래스--------
public class AnonyTest {
	
	public void printB(Ex_6_Anony a) {
			a.print();
	}

	public static void main(String[] args) {
		
			AnonyTest t = new AnonyTest();
			//printB() 메소드에 인자로 전달되는 것은 new Anony()를 통해 만들어진 Anony 인터페이스의 익명 구현 객체이다.
			
			t.printB(new Ex_6_Anony () {
				public void print() {
					System.out.println(" 익명 클래스 사용중 ");
				}
			});
			
			t.printB(new Ex_6_Anony () {
				public void print() {
					System.out.println("안녕하세요");
				}
			});

	}

}
