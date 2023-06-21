package jungsuk_0621;


class Aaa {}
class B extends Aaa {}
class C extends B {}

class D <T extends B>  { //B or B의 자식클래스(B와 C만 올 수 있음) 만 타입 사용이 가능
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	
}

public class Ex4_BoundedType {

		public static void main(String[] args) {
			
		//D<A> d1 = new D<>(); //불가능
			D<B> d2 = new D<>(); 
			D<C> d3 = new D<>(); 
			D d4 = new D(); 
			//제네릭타입을 아예 안적게 되면 여기서의 D라는 참조변수는 Object를 받게 됨  
			
			d2.set(new B());
			d2.set(new C());
			
			//d3.set(new B()); 
			//에러가 발생 d3에는 C만 들어갈 수 있고, B는 C의 상위클래스라 담을 수 없음
			
			d4.set(new C());
			
			
			
		}
}
