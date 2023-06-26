package jungsuk_0619;


class MyClass<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class Ex10_SingleGenericBasic {

	public static void main(String[] args) {

		MyClass	<String> mc1 = new MyClass<String>();
		mc1.set("안녕하세요");
		System.out.println(mc1.get());
		
		
		
		MyClass <Integer> mc2 = new MyClass<>(); //= 뒤의 Integer는 생략가능
		mc2.set(8);
		System.out.println("제 나이는 " + mc2.get() + "살입니다.");
		
		MyClass<Integer> mc3 = new MyClass<>();
		//mc3.set("안녕"); //강한 타입체크 Integer로 정해진 타입에 String 타입을 넣어서 바로 에러가 발생
	}

}
