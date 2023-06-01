package study_0601;

import java.util.Scanner;

public class CityData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City city = new City();  // City 객체 참조 변수
		
		Scanner input =  new Scanner(System.in);
		
		boolean again = true;
		
		int newPopulation;
		int years = 10;
		
		
		while(again) {
			System.out.print("도시이름을 입력하세요 = " );
			city.setCityname(input.next());
			System.out.print("인구를 입력하세요 : ");
			city.setPopulation(input.nextInt());
			System.out.print("인구 증가율(%)을 입력하세요 : ");
			city.setIncrease(input.nextInt());
			
			System.out.println(city.getCityname());
			
		}
		
		
		
		
//		City aCity = new City();  // City 객체 참조 변수
//		
//		
//		int newPopulation; // 예상인구
//		int years = 10; // 연도
//		
//		Scanner keyboard = new Scanner(System.in);  //계속 진행할 것인지의 여부
//		
//		boolean again = true;  // 사용자가 계속하기를 원하는 동안 도시의 10년 후 예상인구를 계산한다.
//		
//		while (again) {
//			//city 객체를 생성하고 aCity가 가리키게 한다
//			aCity = new City(); 
//			// aCity의 도시 이름, 인구와 인구 증가율을 읽어 들인다.
//			aCity.readInput();
//			//aCity의 도시 이름, 인구와 인구 증가율을 출력한다.
//			aCity.writeOutput();
//			// aCity의 10년 후 인구를 계산한다.
//			newPopulation = aCity.computeFutrePopulation(years);
//			//aCity의 예상인구를 출력한다.
//			System.out.println(years + "년 후 예상인구 : " + newPopulation );
//			//계속 여부를 입력받는다.
//			System.out.println("계속하기를 원하세요 ? (true or false : ");
//			again = keyboard.nextBoolean();
//		}
		
	}

}
