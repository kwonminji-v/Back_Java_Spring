/*
final 정의와 용도
* 정의 - "금지"의 의미를 가지는 지정자다.
* 용도 - 클래스 : 상속을 금지한다.
			 - 멤버 메서드 : 오버라이딩을 금지한다.
			 - 멤버 변수 : 값 변경을 금지한다 (상수로 사용)
			 
* 인터페이스 정의 - interface 키워드로 선언된 추상 클래스
* 인터페이스도 추상 클래스처럼 그 자체로는 인스턴스를 생성할 수 없으며, 추상 클래스가 상속을 통해 완성되는 것처럼 인터페이스도 구현부를 만들어주는 클래스에 구현(상속) 되어야 한다.
해당 클래스에 인터페이스를 구현하고 싶다면, implements 키워드를 쓴 후에 인터페이스를 나열하며 된다.
인터페이스를 상속 받았으면, 자식 클래스에서 인터페이스가 포함하고 있는 추상 메소드를 구체적으로 구현해준다.
인터페이스의 가장 큰 특징은 여러개를 다중 구현(다중 상속)이 가능하다는 것이다.
자식 클래스에 클래스 상속(extends)와 인터페이스 구현(implements)는 동시에 가능하다.

* 인터페이스 특징
  - 추상 클래스가 발전한 개념이다.
  - 인스턴스 생성이 불가능하다.
  - Upcasting 타입으로 사용할 수 있다.
  - 멤버로는 상수, 추상메서드만 허용한다.
  - 하위 클래스와의 관계는 implements이다.
  - 하위 클래스에서는 여러 인터페이스를 동시에 implements 할 수 있다.
  - 자바의 단일 상속 긴으을 보완할 수 있다.
* 인터페이스 용도
  - 기능만을 하위 클래스에 강제하기 위해 사용된다.
  
 추상 클래스의 변형, 인터페이스는 추상클래스와 유사하지만 클래스가 아니다.
 클래스처럼 상속을 해주지만 클래스가 아닙므로 다수의 인터페이스의 상속을 받는 것도 가능하다.
 인터페이스는 interface I_NAME 이런 문법으로 선언하며, 인터페이스에서 상속은 class C_NAME implements I_NAME 이런 식으로 작성된다.
 
*/

/*
interface 인터페이스이름{
    public static final 타입 상수이름 = 값;
    public abstract 타입 메서드이름(매개변수목록);
}

// --------------------------------------------------------

interface TV {
    int MAX_VOLUME = 10; // public static final 생략 가능
    int MIN_VOLUME = 10;

    void turnOn(); // public abstract 생략 가능
    void turnOff();
    void changeVolume(int volume);
    void changeChannel(int channel);
}
 */

package study_0605;


interface PhoneInterface{
	//인터페이스에서 선언되는 필드 변수는 모두 상수 변수 (final)이다.
	//아니어도 되지만 대부분 final을 사용한다.
	final int TIMEOUT = 10000;
	void sendCall();
	void SendCall();
	void receiveCall();

//default 메서드 :  이너페이스의 메서드 중 하나는 일반 클래스의 메서드처럼 동작이 정의될 수 있다.
//default 메서드를 활용하면 자바에서도 다중 상속을 할 수 있다.
		default void printLogo() { //default 메서드
			//인터페이스 내부에 메서드, 일치하면 가져다 사용할 수 있다.
			System.out.println("**PHONE**");
			
		}
}

/*
인터페이스 구현은 implements 키워드 활용
인터페이스느 ㄴ두개의 오버라이딩을 받을 수 있다.
다중으로 인터페이스 다중 상속을 받을 수 있다. EX_03을 확인해보자
*/

class SamsungPhone implements PhoneInterface {
	@Override
	public void SendCall() {
		System.out.println("따르릉");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 옴");
	} // @은 앳 이라고 불리우고 어노테이션의 약어이다.
	public void flash() {
		System.out.println("전화에 불 켜짐");
	} // 추상 클래스와 인터페이스는 객체 생성을 할 수 없다.
}

public class Ex_1_Final {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.SendCall();
		phone.receiveCall();
		phone.flash();
	}
}
/*
자체로는 객체 생성이 불가하나 이를 사용하려면 추상클래스를 일반 클래스에 상속하여 객체를 생성할 수 있다
익명 이너클래스를 사용하면 컴파일러가 내부적으로 클래스를 생성한 후 메서드 오버라이드를 수행 
(클래스 이름은 알 수 없고 1회용이다.)
미완성 메서드로 완성하여 해당객체를 생성할 수 있다.
 
 */




