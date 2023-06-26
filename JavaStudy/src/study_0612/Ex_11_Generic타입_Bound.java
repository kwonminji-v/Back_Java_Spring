package study_0612;

import model.Study_0612_Ex_11_Bag;

/* 제네릭(Generic) 타입 범위 제한(Bound)의 종류
 	#1. 제네릭 클래스의 타입 제한
 	#2. 제네릭 메서드의 타입 제한
 	#3. 일반 메서드 매개변수로서의 제네릭 클래스 타입제한*/


class Book {
	//Book 클래스 생성
}
class PencilCase {
	//PencilCase 클래스 생성
}
class Notebook {
	//Notebook 클래스 생성
}

public class Ex_11_Generic타입_Bound {

	public static void main(String[] args) {
			Study_0612_Ex_11_Bag <Book> bag = new Study_0612_Ex_11_Bag<>(new Book());  //생략됨

		//Bag<Book> bag은 제너릭 타입으로 Book을 포함하는 Bag 객체를 참조하는 변수
		//(new Book())은 Bag 클래스의 인스턴스(객체)를 생성하면서 Book을 생성한 후 인자로 전달
			
			Study_0612_Ex_11_Bag<PencilCase> bag2 = new Study_0612_Ex_11_Bag<>(new PencilCase());
			Study_0612_Ex_11_Bag<Notebook> bag3 = new Study_0612_Ex_11_Bag<>(new Notebook());
		
		//클래스명<타입  인자  목록  > 변수명  = new 클래스명 <타입  인자  목록>(생성자 인자 목록);
			
			bag.showType();    //bag은 Book의 타입을 보여줌
			bag2.showType(); //bag2는 PencilCase의 타입을 보여줌
			bag3.showType();//bag3는 Notebook의 타입을 보여줌
			
	}

} //자식 클래스의 제네릭 변수의 개수는 부모보다 같거나 클 수 있다.

/* class Parent<K> { .... }
 	 class Child <K, V> extends Parent<K> { .... } */
