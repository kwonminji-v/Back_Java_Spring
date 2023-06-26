package jungsuk_0621;

//#1. Apple, Pencil 클래스를 모두 담을 수 있는 클래스
class Apple { }

class Pencil { }

class Goods<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}


public class Ex1_SolutionGeneric {
	public static void main(String[] args) {
		// #1. 아래의 객체는 <T>의 위치에 Apple 타입이 적히게되며, 다운캐스팅이 필요 없어짐

		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get();

		// #2. Goods2를 통해서 Pencil 객체 추가 및 가져오기
		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil =  goods2.get();

		// #3. 잘못된 캐스팅 (강한 타입체크)
		//Goods<Apple> goods3 = new Goods();
		//goods3.set(new Apple());
		//Pencil pencil2 = goods3.get();  //강한 타입 체크

	}

}
