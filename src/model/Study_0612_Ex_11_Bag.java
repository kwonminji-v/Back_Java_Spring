package model;

public class Study_0612_Ex_11_Bag <T>{
		//클래스 이름 다음에 <T>를 지정하여 Bag을 제네릭 클래스로 선언한다.
		//Bag 선언된 모든 T는 인스턴스 생성 시 전달되는 타입으로 대체한다.
		//타입 매개변수로 전달되는 값을 타입 인자라고한다.
	
	private T thing;
		//Bag<T> 클래스 내에서만 사용할 수 있게 지정
	
	public Study_0612_Ex_11_Bag(T thing) {
		this.thing = thing;
	}// thing는 Bag의 thing에 저장된다.
	
	public T getThing() {
		return thing;
	} // T를 thing에서 가져오면 thing를 되돌려줌
	
	public void setThing(T thing) {
		this.thing = thing;
	} // Thing의 값을 내보낸다.
	
	public void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}//thing에 저장된 타입을 보여줌 (getClass().getName()은 thing타입을 추출하는 메서드
}
