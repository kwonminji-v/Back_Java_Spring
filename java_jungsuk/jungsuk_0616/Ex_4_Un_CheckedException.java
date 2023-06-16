package jungsuk_0616;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Ex_4_Un_CheckedException {

	public static void main(String[] args) {
		//# Checked Exception의 예시 (일반 예외 / 문법적으로 에러가 발생하며 컴파일 X)
		
		//#1. InterruptedException
		//Thread.sleep(1000);
		
		//#2. ClassNotFoundException
		//Class cls = Class.forName("java.lang.Object");
		
		//#3. IOException
		//InputStreamReader in = new InputStreamReader(System.in);
		//in.read(); //콘솔에 입력된 정보를 읽어오는 메서드인데, 읽어오는 과정에서 예외처리를 진행해주어야 함.
		
		//#4. FileNotFoundException
		//FileInputStream fis = new FileInputStream("text.txt");
		//File이 없었을 때, 어떻게 할지에 대한 예외처리를 규정을 작성해주어야 문법적 오류를 내지않는다고 알려주는 것
		
		
		//# Unchecked Exception의 예시 (실행 예외 / 문법적 에러 X, Runtime 에러 실행하면 에러가 발생)
		
		//#1. ArithmeticException
		 // 문법적으로 사전에 에러를 찾지 못하고, 프로그램이 종료되는 이유만 알려주고 바로 종료해버림
		//System.out.println(3/0);  
		
		//#2. ClassCastException
		//class A {}
		//class B extends A {}
		//A a = new A();
		//B b = (B)a;
		
		//#3. NumberFormatException
		//int num = Integer.parseInt("10A");
		//현재 () 안의 값에 문자가 들어있기 때문에 (정수가 아님) 숫자로 변환하는 과정에서 예외가 발생했습니다.
		//System.out.println(num);
		
		//#4. NullPointException
		//String str = null;
		//System.out.println(str.charAt(2));
	}

}
