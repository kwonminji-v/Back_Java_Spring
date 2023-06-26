package study_0531;


import java.util.Scanner;

//final의 정의
//자바 언어에서 final은 오직 한 번만 할당할 수 있는 entity를 정의할 때 사용된다.
//final로 선언된 변수가 할당되면 항상 같은 값을 가진다. 
//만약 final 변수가객체를 참조ㅗ하고 있다면,
//그 객체의 상태가 바뀌어도 final 변수는 매번 동일한 내용을 참조한다. 
//final을 클래스에서 사용하게 되면 그 클래스는 최종 상태가 되어
//더 이상 상속이 불가능하다. 
//이렇게 하면 보안이나 효율성 측면에서 장점이 있다. 
//final 클래스여도 필드는 setter 함수를 통해 변경은 가능하다. 
//어떤 클래스를 상속하는데 그안에 final 메서드가 있다면 오버ㅓ라이딩으로 수정할 수 없다. 
//즉) 메서드에 final을사용하게 되면 상속받은 클래스에서
//부모의 final 메서드를 재정의 할 수 없다.

public class Ex_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("목표액 입력: ");
		// int aim = sc.nextInt();

		final int aim = 1000;
		System.out.printf("목표액 : %d\n", aim);
		System.out.println("실적 입력: ");
		int result = sc.nextInt();
		int bonus;

		if (result >= aim) {
			bonus = (result - aim) / 10;
			System.out.printf("보너스 : %d", bonus);

		} else {
			System.out.println("달성 실패!");
		}
		sc.close();
	}
}
