package study_0526;

import java.util.Scanner;

public class CarParkingFee {

/* 
 주차 시간이 주어지면 주차요금을 계산한다. 
@입력 매개변수들 : ptime - 주차시간 @반환값 : 주차요금
*/

	static double calculateFee(double ptime) {
		double fee = 0.0;
		
		if (ptime > 0.0) {
			if (ptime <= 1.0)
				fee = 1000;
			else {
				fee = 1000 + Math.ceil(ptime - 1.0) * 500;
				if (fee > 10000) fee = 10000;
			}
		}
		return fee;
	}
	
	public static void main(String[] args) {
		
		// 주차장에 들어온 시간, 나간 시간과 주차요금을 저장하는 변수들을 선언한다.
		
		
		double entertime;
		
		
		// 반복문의 계속 수행 여부를 나타내변수를 선언한다.
		
		Scanner scan = new Scanner(System.in);
		//사용자가 계속하기를 원하는 동안 주차장에 들어온 시간과 나간 시간을 입력받아 주차요금을 계산한다.
		
		String flag=" ";
		// 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
		
		do {
			
				//주차장에 들어온 시간과 나간 시간을 입력하라고 요청한다.
			
			System.out.println("주차장에 들어온 시간을 입력하세요 : \t ");
			entertime = scan.nextDouble();
									// 여기에 코드를 삽입하세요.
			//주차요금을 계산하고 출력한다.
									// 여기에 코드를 삽입하세요
			//사용자가 계속하기를 원하는 지를 예(Y) 혹은 아니오(N)로 입력하라고 요청한다. 그리고 입력된 값을 읽는다.
									// 여기에 코드를 삽입하세요
			
		} while (flag.equalsIgnoreCase("y"));
	
	}

}
