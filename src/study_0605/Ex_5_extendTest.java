package study_0605;

public class Ex_5_extendTest {

	public static void main(String[] args) {
		//Ex_2_extends_Car c1 = new EX_2_extends_Car(); 인터페이스는 인스턴스 생성이 불가능하다.
		Ex_2_extends_Car c = new Ex_4_extend_sportscar();
		Ex_4_extend_sportscar s = new Ex_4_extend_sportscar();
		Ex_3_implements_truck t = new Ex_3_implements_truck();
		
		System.out.println("Car.SAFE_SPEED = " + Ex_2_extends_Car.SAFE_SPEED);
		
		t.speedUp();
		t.speedDown();
		t.stop();
		
		System.out.println();
		s.speedUp();
		s.speedDown();
		s.stop();
		s.turbo();
	}

}
