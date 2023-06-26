package study_0607;


interface Repairable {
	
} // 유닛이 갖는 공통 성질을 가진 최상위 클래스

class Unit {
	int hitPoint;
	final int MAX_UP;
	/*Reparable*/ String u;
	
	Unit(int hp) {
		MAX_UP = hp;
		System.out.println("hp");
	}
}

//유닛의 큰 범주를 나누는 클래스
class GroundUnit extends Unit {
	 GroundUnit(int hp) {
		super(hp);
	}
}

//유닛의 큰 범주를 나누는 클래스
class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

//세부 유닛 클래스 - 상위 클래스의 성질을 상속 받음
class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_UP;
	}
	@Override
	public String toString() {
		return "Tank";
	}
}

//세부 유닛 클래스 - 상위 클래스의 성질을 상속 받음
class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_UP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_UP;
	}
//repair 라는 세부 동작이 추가되어있다.
	void repair (Repairable r) {
		//Unit name = new Unit(r);  
		// instanceof ->  현재 레퍼런스가 어떤 클래스형의 객체 주소를 참조하고 있는지 알고 싶을 때 사용
		//결국 Repairable 타입의 객체를 수리하는 것이라는 소리이다.
		
		if (r instanceof Unit) { //-> r이 Unit 타입의 인스턴스를 가리키는 경우 true 아니면 false를 반환한다.
			Unit u = (Unit) r; 
			/*  r이 가르키는 객체를 unit 타입으로 캐스팅한다.
			 	  r이 Unit 타입의 객체를 가리키는 경우에만 r을 Unit으로 캐스팅하여 u에 할당하도록 하고 
			 	  그렇지 않으면 아무것도 안한다 이는 r이 Unit일 경우에만 특정작업을 수행한다는 말이다.*/
			
			while (u.hitPoint != u.MAX_UP) {
				u.hitPoint++;
			}
			System.out.println("Tank 수리완료");
			System.out.println(u.toString() + " 수리완료 ");
		}
	}
}

public class Ex_02_interFace {

	public static void main(String[] args) {
		//각 유닛의 객체 생성
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
/*
scv에 있는 repair 동작 수행
객체 변수 tank는 Repairable 인터페이스에 의해 동작이 일어나야 하는데 본 코드는 그렇나 동작이 없으므로 아무 일도 발생하지 않는다. 
*/
		scv.repair(tank);

	}

}
