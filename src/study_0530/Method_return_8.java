package study_0530;

public class Method_return_8 {
	

	public void add(int a, int b) {
		
		int sum = a + b;
		System.out.println("결과 값 " + sum);
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		Method_return_8 m = new Method_return_8();
		result = m.add(num1, num2);
		System.out.println("두 수의 합은"  + result);
		System.out.println("두 수의 합은"  + m.add(100,300));

	}

}
