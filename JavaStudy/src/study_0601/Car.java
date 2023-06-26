
package study_0601;

import java.util.Scanner;

public class Car {

	Scanner input = new Scanner(System.in);

	private String carType;

	String choice;
	

	
	public void setCarSearch() {

		boolean again = true;


		do {
			System.out.println("차량종류를 선택하세요 = ");
			System.out.println("1.그랜저 2.아반떼  3.포르쉐 4.제네시스 5. 벤틀리");

			String carType = input.next();

			switch (carType) {
			case "1":
				System.out.println("선택한 차량 종류 = " + "그랜저");
				System.out.println("선택한 차량 번호 = " + "34저 1568");
				System.out.println("선택한 차량 색상 = " + "검정");
				System.out.println("선택한 차량 브랜드 = " + "현대차");
				break;

			case "2":
				System.out.println("선택한 차량 종류 = " + "아반떼");
				System.out.println("선택한 차량 번호 = " + "351다 4153");
				System.out.println("선택한 차량 색상 = " + "빨강");
				System.out.println("선택한 차량 브랜드 = " + "현대차");
				System.out.println();
				break;
			case "3":
				System.out.println("선택한 차량 종류 = " + "포르쉐");
				System.out.println("선택한 차량 번호 = " + "15바 1234");
				System.out.println("선택한 차량 색상 = " + "빨강");
				System.out.println("선택한 차량 브랜드 = " + "포르쉐");
				System.out.println();
				break;

			case "4":
				System.out.println("선택한 차량 종류 = " + "제네시스");
				System.out.println("선택한 차량 번호 = " + "65저 1234");
				System.out.println("선택한 차량 색상 = " + "빨강");
				System.out.println("선택한 차량 브랜드 = " + "기아");
				break;

			case "5":
				System.out.println("선택한 차량 종류 = " + "벤틀리");
				System.out.println("선택한 차량 번호 = " + "45나 5784");
				System.out.println("선택한 차량 색상 = " + "빨강");
				System.out.println("선택한 차량 브랜드 = " + "벤틀리");
				break;
				
				default :
					System.out.println("잘못된 입력입니다. 올바른 값을 입력해주세요");
					continue;
					
			}

            System.out.println();
            System.out.println("해당 차량을 선택하겠습니까? Y or N");

            String choice = input.next();
            input.nextLine();
            
            

            if (choice.equalsIgnoreCase("Y")) {
            	
                System.out.println("차량이 등록되었습니다.");
                again = false;
                
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("뒤로 돌아가시겠습니까? Y or N");
                String goBack = input.next();
                input.nextLine();

                if (goBack.equalsIgnoreCase("Y")) {
                    again = true;
                } else {
                    again = false;
                }
			}
			
		}while (again);

	}

}
