package study_0525;

import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args)
    {
		String str;			// 입력받는 문자열
		int length;		// 문자열의 길이
		char ch;			// 마지막 문자
		String outputStr = "";	// 출력 문자열

		// Scanner 객체를 생성하고 변수 scan이 그 객체를 가리키게 한다
		Scanner scan = new Scanner(System.in);
		
		// 문자열을 입력받는다
		System.out.print("문자열을 입력하세요: ");			
		str = scan.nextLine();

       	// 입력 문자열을 출력한다			
		System.out.println("입력하신 문자는 '" + str +"' 이다" );
		
		// 문자열의 길이를 구한다			
		length = str.length();
		System.out.println("'" + str + "'의 길이는 "+ length + "이다");
		
		// 반복문을 이용해 뒤에서부터 하나씩 꺼내서 outputStr에 추가
		for(int i = 1; i <= length; i++ ) {
			ch = str.charAt(length-i);
			outputStr += ch;
		}
		System.out.println("거꾸로하면 '" + outputStr + "' 이다");	
    }
}
