package study_0601;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reserve {
	String resCarNumber;
	String useBeginDate;
	String returnDate;
	
	LocalDate now = LocalDate.now();
	
	Pattern pattern = Pattern.compile("((19|20)\\d{2})-((0[1-9]|1[012]))-(0[1-9]|[12][0-9]|3[01])");
	
	
	Scanner scanner = new Scanner(System.in);
	
	
	public void reserveCar() {
		System.out.print("차량을 선택해라 : ");
		resCarNumber = scanner.next();
		System.out.println("차량이 예약되었다. 10만원이다.");
		
		
		
		while(true) {
			System.out.print("시작 날짜를 입력해(yyyy-mm-dd) : ");
			useBeginDate = scanner.next();
			
			Matcher matcher = pattern.matcher(useBeginDate);
			
			if(matcher.matches() == false) {
				System.out.println("다시 입력해");
				continue;
			}else {
				break;
			}
		}
		
		while(true) {
			System.out.print("반납 날짜를 입력해(yyyy-mm-dd) : ");
			returnDate = scanner.next();
			Matcher matcher = pattern.matcher(returnDate);
			if(matcher.matches() == false) {
				System.out.println("다시 입력해");
				continue;
			}else {
				break;
			}
		}
		
		System.out.println("차량은 " + useBeginDate + "부터 " + returnDate + "까지 이용 가능합니다.");	
		System.out.println("예약날짜 : " + now);
		
		
		
		
	}
	public void modReserveInfo() {
		System.out.print("예약 수정할래?(Y/N) : ");
		String selectedAnswer = scanner.next();
		
		if(selectedAnswer.equalsIgnoreCase("Y")) {
			System.out.print("차량을 선택해라 : ");
			resCarNumber = scanner.next();
			System.out.println("차량이 예약되었다. 10만원이다.");
			
			while(true) {
				System.out.print("시작 날짜를 입력해(yyyy-mm-dd) : ");
				useBeginDate = scanner.next();
				
				Matcher matcher = pattern.matcher(useBeginDate);
				
				if(matcher.matches() == false) {
					System.out.println("다시 입력해");
					continue;
				}else {
					break;
				}
			}
			
			while(true) {
				System.out.print("반납 날짜를 입력해(yyyy-mm-dd) : ");
				returnDate = scanner.next();
				Matcher matcher = pattern.matcher(returnDate);
				if(matcher.matches() == false) {
					System.out.println("다시 입력해");
					continue;
				}else {
					System.out.println("차량은 " + useBeginDate + "부터 " + returnDate + "까지 이용 가능합니다.");	
					System.out.println("예약날짜 : " + now);
					break;
				}				
			}
		} else {
			System.out.println("예약 수정 취소");
		}
	}
	public void cancelReserveInfo() {
		System.out.println("예약이 취소되었다.");
	}
}
