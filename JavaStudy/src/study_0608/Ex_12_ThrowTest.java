package study_0608;

public class Ex_12_ThrowTest {

	public static void main(String[] args) {
		
			Ex_11_try_catch t = new Ex_11_try_catch();
			
			try {
				t.call();
				System.out.println("Hello");
			}catch (Exception e) {
				System.out.println("main 메서드에서 예외 처리");
				}
			System.out.println("World");
	}

} 

/*
예외(Exception) : 연산 오류, 포맷 오류 등 상황에 따라 개발자가 해결 가능한 오류
에러(Error) : JVM 자체의 오류로 개발자가 해결할 수 없는 오류

일반 예외 (Checked Exception)  -> Exception으로 부터 바로 상속
--예외 처리를 하지 않으면 컴파일 자체가 불가능

실행 예외(RuntimeException)   RuntimeException으로 부터 바로 상속
--컴파일은 가능하나 실행 중 예외가 발생하면 프로그램 종료 
 
 */