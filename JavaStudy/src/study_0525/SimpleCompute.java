package study_0525;

import java.util.Scanner;

public class SimpleCompute {
	   public static void main (String[] args) {
		// 변수들을 선언한다 number1, number2, sum, diff, product	
	    	// Scanner 객체를 생성하고 변수 scan이 그 객체를 가리키게 한다
		   
		Scanner sc = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		int diff;
		int product;

		System.out.println("첫번째 정수를 입력하세요:\t" );
		number1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요:\t" );
		number2 = sc.nextInt();
		
		sum = number1 + number2;
		System.out.println("합 =\t" + sum);
		
		diff = number1 - number2;
		System.out.println("차 =\t" + diff);
		
		product = number1 * number2;
		System.out.println("곱 =\t" + product);
	   
	   }
	}
//	출력결과
//	첫 번째 정수를 입력하세요: 50
//	두 번째 정수를 입력하세요: 30
//	합 = 80
//	차 = 20
//	곱 = 1500
