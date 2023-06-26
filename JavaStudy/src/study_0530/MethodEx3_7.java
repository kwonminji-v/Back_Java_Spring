package study_0530;

public class MethodEx3_7 {
// 매개변수가 2개인 메서드를 선언한다.
	public void print(int a , int b) {
		int c = a + b;
		System.out.println("결과 값" + c);
		
	}
// 매개변수로 문자열을 받는 메서들르 선언한다.
	public void print1 (String str) {
		System.out.println(str);
	}
	
//변수 선언!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		int result = 0;

		MethodEx3_7 m = new MethodEx3_7();
//메서드 호출
		m.print(10, 30);
		m.print(num1, num2);
		m.print1("");
	}

}
