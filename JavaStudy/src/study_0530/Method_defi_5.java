package study_0530;


//메서드 정의 - 자주 사용하는 기능을 미리 만들어놓고 필요할 때마다 불러서 재사용하는 개념
//인수를 받아 결과값을 리턴하는 작은 프로그램 - C언어의 함수에 해당한다.
public class Method_defi_5 {
		public void print() {  //반환 값이 없다.
			System.out.println("메서드를 호출합니다.");
			//return 0; // 메서드의 끝에 도달하면 자동적으로 호출한 부분으로 제어가 돌아간다.
			//return 7; -> 값을 반환할 수 없다.
		}
//리턴값은 메서드의 리턴 타입(return type)과 일치해야한다.
//return 문은 메서드의 실행을 중단하고, 메서드를 호출한 지점으로 제어를 되돌린다.
		
		public static void main(String[   ] args) {
			int a = 1;
			int b = 2;
			int result = 0;
//return 문은 메서드의 실행을 중단하고, 메서드를 호출한 지점으로 제어를 되돌린다.
			
			
//매개변수와 리턴값이 없는 메서드이다.		
			
			Method_defi_5 m = new Method_defi_5();   //메모리에 인스턴스 생성		
			
//() 아무것도 없는 상황 컴파일러에서 자동으로 생성해서 제공하는 기본생성자이다.
			m.print();
			m.print();
			m.print();
		}
		

}
