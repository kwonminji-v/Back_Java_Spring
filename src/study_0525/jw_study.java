package study_0525;

import java.util.Scanner;

public class jw_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력해");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println(" number1 의 값은 = " + number1);
		System.out.println(" number2 의 값은 = " + number2);

		int sum = number1 + number2;
		System.out.println("두 수의 합은 = " + sum);
		
		
		if(sum >= 50) {
			System.out.println("합격 입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}

}
