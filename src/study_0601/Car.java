
package study_0601;

import java.util.Scanner;

public class Car {

	Scanner input = new Scanner(System.in);

	private String carType;
//	private String carColor;
//	private String carNumber;
//	private String carFlu;
//	private String carMaker;

	String choice;
	public void setCarSearch() {

		boolean again = true;


		do {
			System.out.println("차량종류를 선택하세요 = ");
			System.out.println("1.그랜저 2.아반떼  3.포르쉐 4.제네시스 5. 벤틀리");

			String carType = input.next();

			switch (carType) {
			case "1":
				System.out.println("선택한 차량 종류 = " + carType);
				System.out.println("선택한 차량 번호 = " + 1234);
				System.out.println("선택한 차량 색상 = " + "검정");
				System.out.println("선택한 차량 브랜드 = " + "현대차");
				break;

			case "2":
				System.out.println("선택한 차량 종류 = " + carType);
				System.out.println("선택한 차량 번호 = " + 1234);
				System.out.println("선택한 차량 색상 = " + "빨강");
				System.out.println("선택한 차량 브랜드 = " + "현대차");
				System.out.println();
				break;
			case "3":
				System.out.println("선택한 차량 종류 = " + carType);
				System.out.println("선택한 차량 번호 = " + 1234);
				System.out.println("선택한 차량 색상 = " + "빨강");
				System.out.println("선택한 차량 브랜드 = " + "포르쉐");
				System.out.println();
				break;

			case "4":
				System.out.println("선택한 차량 종류 = " + carType);
				System.out.println("선택한 차량 번호 = " + 1234);
				System.out.println("선택한 차량 색상 = " + "빨강");
				System.out.println("선택한 차량 브랜드 = " + "기아");
				break;

			case "5":
				System.out.println("선택한 차량 종류 = " + carType);
				System.out.println("선택한 차량 번호 = " + 1234);
				System.out.println("선택한 차량 색상 = " + "빨강");
				System.out.println("선택한 차량 브랜드 = " + "벤틀리");
				
					}

			//input.nextLine();
			System.out.println();
			System.out.println( "해당 차량을 선택하겠습니까?  Y or N" );
		
			String choice = input.next();
			
		
			if( choice.equalsIgnoreCase("Y")) {
				System.out.println("차량이 등록 되었습니다.");
				
			} else if (choice.equalsIgnoreCase("n")) {
				System.out.println("뒤로 돌아가기  -  y or n를 입력하세요");
				input.nextLine();
			}
			
		}while (again);

	}

}
