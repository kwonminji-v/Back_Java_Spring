package jungsuk_0616;

import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex_6_MultiCatch_1 {

	public static void main(String[] args) {
			//#1. 단일 try-catch 
		try {
			System.out.println(3 / 0); // 실행 예외 (ArithmeticException)
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없다.");
		} finally {
			System.out.println("뭐든 실행 후 종료해주세용");
		}
		
		try {
			int num = Integer.parseInt("10A");  //실행 예외 (NumberFormatException)
		} catch (NumberFormatException e) {
			System.out.println("숫자를 변경할 수 없습니다.");
		}finally {
			System.out.println("프로그램 종료 해주세요 ");
		}
		
		//#2. 다중 try-catch (catch 구문이 여러개 있음을 의미합니다.)
		
		try {
			System.out.println(3 / 0); // 실행 예외 (ArithmeticException)
			int num1 = Integer.parseInt("10!");
			//첫 번째 있는 ArithmeticException을 만나면서 "숫자는 0으로 나눌 수 없다" 가 실행되는데,
			//만약 첫번째 문장이 에러가 없다면 , 아래의 NumberFormatException이 실행됩니다.
		} 
		catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없다.");
		} 
		catch (NumberFormatException e) {
			System.out.println("숫자로 변경할 수 없습니다.");
		}finally {
			System.out.println("프로그램 종료 해주세요 ");
		}
		
		//#3. catch 블록을 각각 처리한 경우
		try {
			System.out.println(3 / 0); 
			int num2 = Integer.parseInt("10!A");
		}  catch (NumberFormatException e) {
			System.out.println("예외가 발생 ! ");
		} catch (ArithmeticException e) {
			System.out.println("예외가 발생 ! ");
		} 
		
		//#4. catch 블록을 하나로 통일한 경우
		
		try {
			System.out.println(3 / 0); 
			int num2 = Integer.parseInt("10!A");
			
		}  catch (NumberFormatException | ArithmeticException e) {
			System.out.println("예외가 발생 ! ");
		} 
		
		//#5. try-catch 구문을 업데이트한 기능
		// 자동 리소스 해제 : 기본적으로 try-catch 구문이 종료될 때, try ( ) 해당 ()안에  생성된 객체를 자동으로 해제해주는 이야기입니다.
		// try()안에서 생성된 객체 isr1은 콘솔에서 입력값을 보관하고 있는데, try-catch 구문이 종료되면 메모리에서 객체를 없애게 됩니다.
	
		try(InputStreamReader isr1 = new InputStreamReader(System.in);) {
			char input = (char)isr1.read();
			System.out.println("입력된 글자는 = " + input);
		}catch(IOException e) {  //catch 블록만 입력해주었다면, 입출력 시 발생한 예외를 catch블록내의 문장으로 해결합니다.
			e.printStackTrace();
		}
		
		//try-catch 구문에서 try() 중괄호안에서 객체생성을 해주면 자동으로 close를 호출해주게되며, 생성된 객체의 기능을 종료해줍니다.
		
		//#6. 자동 리소스 메소드 구현 과정
		class A implements AutoCloseable {
			String resource;
			A(String resource) {
				this.resource = resource;
			}
		
				void abc() throws Exception {
				
				}
				public void close() throws Exception {
					if(resource != null) {
						resource = null;
						System.out.println("리소스가 해제되었습니다.");
					}
				}
				
			
		}
		//try()내에 들어갈 수 있는 클래스는 AutoCloseable 인터페이스를 상속한 클래스만 try()내에서 객체 생성이 가능합니다.
		try(A a2 = new A("특정파일"); ) {
				a2.abc();
		} catch (Exception e) {
			System.out.println("자동 리소스가 해제되며 예외 처리 ");
		}
	} 

}
