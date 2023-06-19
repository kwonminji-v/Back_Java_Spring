package jungsuk_0616;
/*  
다중 catch문의 특징
- 자바 명령문이 많아지면 발생할 수 있는 Exception의 종류도 많아진다.
- 다중 catch문은 순차적으로 해당 예외를 체크한 후에 예외 처리를 한다.
다중 catch문 구현 시 Exception 계층 구조에서 상위 클래스 타입 매개변수를 가지는 catch 문은 상위 일수록 뒤에(아랫줄에)  위치시켜야한다.
최상위 : Exception   상위 : IOException  하위 : FileNotFoundException
finally문 -- 예외 발생 유무와 상관없이 실행하는 부분

 */


public class Ex_3_try_catch {

	public static void main(String[] args) {
		
		 try {
			 System.out.println(3/0); 
			 /* 컴파일러가 계산을 못하는 상황이 발생하면 바로 catch 블록으로 이동하게 됩니다.
			  	  3/0 예외는 ArithmethicException이 발생하며, 객체가 생성됩니다. 그리고 catch 블록이 실행됩니다.*/
			 System.out.println("프로그램 종료");
			 
		} catch (Exception e) {
				System.out.println("숫자는 0으로 나눌 수 없습니다. ");
				System.out.println(e);
				//System.exit(); 를 작성하면 finally문은 실행하지 않고 catch블록만 실행 후 종료된다.
		}
		 finally {
			System.out.println("예외 있든 없든 실행해!"); 
			System.exit(0);
		}
  }
}

