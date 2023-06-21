package jungsuk_0621;


class Aa {
	public <T extends String> void method1 (T  t) {
		System.out.println(t.charAt(3) );
	}
}

interface MyInterface {
	public abstract void print();
}


class Bb {
	 public <T extends MyInterface> void method1(T t) { 
		 // ↑ <> 여기 올 수 있는 타입으로는 MyInterface라고 하는 인터페이스를 구현한 클래스들만 올 수 있음
		 // 그래서어떤 타입이 오든 print() 메서드를 가지고 있음
		 t.print();
	 }
}


public class Ex5_BoundTypegenericMethod {
	public static void main(String[] args) {
		Aa a = new Aa();
		a.method1("안녕하세요");
		
		Bb b = new Bb();
		b.method1(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("print() 구현됨 ");
			}
		});
		//b.method1(MyInterface를 구현한 클래스의 객체가 와야함 -> 인터페이스 구현방법 자식클래스 직접 생성 / 익명이너클래스);
	}
}
