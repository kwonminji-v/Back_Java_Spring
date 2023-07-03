package jungsuk_0624;

import java.awt.AWTError;
import java.util.concurrent.atomic.AtomicBoolean;



//입력과  return 에 대해 정의해본다
interface Aa {   //   입력   X        return  X
	void method1();
}

interface Bb {  //   입력   O        return  X
	void method2(int a);
}

interface Cc {  //   입력   X        return  O
	int method3();
}

interface Dd {  //   입력   O        return  O
	double method4(int a, double b);
}

public class FunctionToLambdaExpression {
		public static void main(String[] args) {
						//@@인터페이스의 함수 구현 --> 람다식으로 작성해보기
						//#1. 입력   X        return  X 
						//1-1.  익명 이너 클래스 방식을 사용
						Aa a1 = new Aa() {
							@Override
							public void method1() {
								System.out.println("입력, 리턴 모두 없는(X) 함수 구현");
							}
						};
						a1.method1();
						
						//1-2. 람다식으로 변경해서 작성해보기 - 익명 이너 클래스를 메서드 이름까지 생략하여 줄인 방식
						Aa a2 =  () ->  { System.out.println("입력 , 리턴 모두 없는 (X) 람다식 기호로 작성한 함수 구현");};
						Aa a3 =  () ->   System.out.println("입력 , 리턴 모두 없는 (X) 중괄호까지 생략 후 작성한 함수 구현");
						//작성되는 출력물이 1줄 명령이라면 중괄호까지 삭제가 가능
						a2.method1();
						a3.method1();
						
						//#2. 입력  O        return  X 
						//2-1.  익명 이너 클래스 방식을 사용
						Bb b1 = new Bb() {
							@Override
							public void method2(int a) {
								System.out.println("입력은 있지만(O), 리턴 없는(X) 함수 구현");
							}
						};
						
						//↑위에 적힌익명 이너클래스로 작성된 함수를 
						//↓ 아래의 람다식으로 표현이 가능 / 마지막 b5 작성으로 객체를 생성하는 방식이가장 많이 쓰이는 방식입니다.
						//2-1. 람다식 표현
						Bb b2 = (int  a) -> {System.out.println("입력은 있지만(O), 리턴 없는(X) 함수 구현");}; 
						Bb b3 = (a) -> {System.out.println("입력은 있지만(O), 리턴 없는(X) 함수 구현");};//입력매개변수의 갯수가 상관 없이 타입은 생략가능
						Bb b4 = (a) -> System.out.println("입력은 있지만(O), 리턴 없는(X) 함수 구현");//중괄호 생략가능 (한 줄 명령일때만 사용 가능)
						Bb b5 = a -> System.out.println("입력은 있지만(O), 리턴 없는(X) 함수 구현"); //입력 매개변수가 하나인 경우 소괄호도 생략 가능 
						
						
						//#3. 입력  X        return  0
						//3-1.  익명 이너 클래스 방식을 사용
						Cc c1 = new Cc() {
							@Override
							public int method3() {
								return 4;
							}
						};
						
						//3-2 람다식 표현
						Cc c2 = () ->  4; //만약 명령이 하나밖에 없다면 { } 중괄호 생략이 가능한데 생략한다면, return도 생략해 주어야 합니다.


						//#4. 입력  O        return  0
						//3-1.  익명 이너 클래스 방식을 사용
						Dd d1 = new Dd() {
							@Override
							public double  method4(int a , double b) {
								return a+b;
							}
						};
						
						//4-2 람다식 표현
						Dd d2 = (int a , double b) -> { return a+b;};
						Dd d3 = (a , b) -> {return a+b;};
						Dd d4 = (a , b) -> a+b; //생략했을 때 남은 하나의 명령어가 return 문이라면 반드시 return 문구도 생략!
						
		}				
}
