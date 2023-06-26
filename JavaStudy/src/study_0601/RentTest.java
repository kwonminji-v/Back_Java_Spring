package study_0601;


public class RentTest {

	public static void main(String[] args) {
		// 회원 가입하기
		Member member = new Member();
		member.member_main();
		
		
		// 예약을 한다.
		Reserve reserve = new Reserve();
		reserve.reserveCar();
		
		reserve.modReserveInfo();
		
		// 렌트카 등록
		Car car = new Car();
		car.setCarSearch();
		
		
	}

}
