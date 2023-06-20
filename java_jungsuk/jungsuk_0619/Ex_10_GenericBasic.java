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

public class Ex_10_GenericBasic {

	public static void main(String[] args) {

		MyClass	<String> mc1 = new MyClass<String>();
		MyClass <Integer> mc2 = new MyClass<Integer>();
		
		
		
		
		mc1.set("안녕하세요");
		System.out.println(mc1.get());
		
		mc2.set(8);
		System.out.println("제 나이는 " + mc2.get() + "살입니다.");
	}

}
