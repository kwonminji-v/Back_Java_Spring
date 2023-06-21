package jungsuk_0621;

//#1. Apple, Pencil 클래스를 모두 담을 수 있는 클래스
class Apple1 {
}

class Pencil1 {
}

class Goods1 {
	// 최상위 컴포넌트인 Object로 객체를 생성함으로써
	// 새로운 타입이 오더라도 모든 타입의 수용이 가능
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}

public class Ex1_1_solution {
	public static void main(String[] args) {
		// #1. Goods1을 통해서 Apple 객체 추가 및 가져오기

		Goods1 goods1 = new Goods1();
		goods1.setObject(new Apple1());
		Apple1 apple = (Apple1) goods1.getObject();
		// 항상 getObject의 리턴타입은 Object인데, Apple타입으로 꺼내고자 한다면
		// Apple은 Object의 하위타입으로서 명시적으로 다운캐스팅이 필요

		// #2. Goods2를 통해서 Pencil 객체 추가 및 가져오기
		Goods1 goods2 = new Goods1();
		goods2.setObject(new Pencil1());
		Pencil1 pencil = (Pencil1) goods2.getObject();

		// #3. 잘못된 캐스팅 (약한 타입체크)

		//Goods goods3 = new Goods();
		//goods3.setObject(new Apple1());
		//Pencil1 pencil2 = (Pencil1) goods3.getObject();
		// 실행예외가 발생하게되서 사전체크가 안되어 프로그램이 강제종료가 될것임

	}

}
