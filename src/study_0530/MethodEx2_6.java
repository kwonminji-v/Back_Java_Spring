package study_0530;


//메서드 정의 - 자주 사용하는 기능을 미리 만들어놓고 필요할 때마다 불러서 재사용하는 개념
//인수를 받아 결과값을 리턴하는 작은 프로그램 - C언어의 함수에 해당한다.
public class MethodEx2_6 {
		public void print(int a) {  //반환 값이 없다.
			System.out.println("결과 값 = " + a);
		}
		
		public static void main(String[   ] args) {
			int a = 11;
			int b = 22;
			int result = 0;
			
			MethodEx2_6 m = new MethodEx2_6 (   ); 
			result = a+b;
			
			m.print(10);
			m.print(b);
			m.print(result);
		}
		

}
