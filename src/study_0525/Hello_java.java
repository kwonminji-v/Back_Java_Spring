package study_0525;

public class Hello_java { //클래스의 시작이고 , 접근권한 (public) 클래스 선언 클래스 이름(hello_java)

	public static void main(String[] args) { // 메인 메소드의 시작점
		//접근권한 고정할당 리턴값x 메인메소드 선언 배열 메소드 인자
		System.out.println("처음입니다. 안녕하세요");
		//System 클래스의 변수 , 메소드, 호출, 컨텐츠 내용 줄바꿈 출력.
		//클래스명 .변수.메소드명(컨텐츠)
		System.out.println("안녕 자바야!");
		int num;
		//변수 선언 num은 정수값을 가지는 변수이다.
		num = 10+20;   // 해당 계산식의 결과를 num에 대입.
		if (num> 10)  // 조건문 , num의 값이 10보다 크면 아래 내용 실행.
			System.out.println("10보다 큽니다.");  // num 값은 30이다.
		num = 0;  // 다시 num에 0을 할당하였다.
		
		while ( num < 10) { //num 값이 10보다 작으면 아래내용을 출력하고 실행한다.
			System.out.println("안녕 10");  // num값은 현재 0이므로 해당내용이 실행될 것이다.
			num = num + 1;     //
			}
		
	} //메인 메소드의 종료지점

} //클래스의 종료지점
