package study_0602;

/*
업캐스팅 (upcasting)은 객체 지향 프로그래밍에서 특히 상속 계층에서 사용되는 개념
업캐스팅은 자식 클래스의 객체를 부모 클래스의 객체로 취급하는 것 
업캐스팅이 자동으로 이루어진다. 

 */

class Animal {
		public void makeSound() {
			System.out.println("Animal is making a sound");
		}
}

	class Dog extends  Ex_7_Upcasting {
		public void makeSound () {
			System.out.println("Dog is barking");
		}
		public void wagTail() {
			System.out.println("Dog is wagging its tail");
		}
	}
//부모클래스를 선언하고 자식클래스를 생성하여 부모는 자식을 사용할 수 있다.
	
	public class Ex_7_Upcasting {
			public static void main(String[] args) {
				Dog myAnimal = new Dog();   // Upcasting
				myAnimal.makeSound();  // Outputs "Dog is barking"
				// myAnimal.wagTail()'  // Error!
			}//업캐스팅은 특히 다형성을 활용할 때 주로 사용한다.
	}

/*
다형성이란, 부모 클래스 타입의 참조 변수가 자식 클래스 타입의 객체를 참조하도록 할 때, 같은 메소드를
호출하더라도 자식 클래스에 따라 다른 동작을 하는 기능을 말한다.
다형성의 장점으로는 코드를 유연하게 작성할 수 있다 

 */
 