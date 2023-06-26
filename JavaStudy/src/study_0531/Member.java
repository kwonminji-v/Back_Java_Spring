package study_0531;

// 3단 표기법
//student
//
//-name: string
//-address: string
//
//+study() : String
//+getTest(String) : String

class Student {
	private String name;
	private String address;

	public void study() {
		System.out.println("자바를 열공합니다.");
	}

	public String getTest(String score) {
		return score;
	}

}

public class Member {
	public static void main(String[] args) {
		Student a = new Student();
		a.study();
	}
}
//불변 클래스(즉, 한 번 생성된 후에는 상태가 변경되지 않는 클래스)는
//보통 set 메서드를 제공하지 않습니다.
//이러한 클래스의  객체는 새성 시에 모든 상태를 할당받고,
//그 이후에는 변경되지 않습니다. 따라서 set 메서드가 필요하지 않습니다.
//
//반면에, 가변 클래스(즉, 생성된 후에 상태가 변경될 수있는클래스)는 
//보통 set 메서드를 제공합니다.
//이는 객체의상태를 변경할 필요가 있을 수 있기 때문입니다.
//
//따라서 get 메서드와 set 메서드의사용 여부는 클래스의 설계에 따라 달라집니다.
//+: public
//-: private
//#: protected