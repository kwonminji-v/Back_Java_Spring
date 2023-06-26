package study_0613;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_1_HashMap {

	public static void main(String[] args) {
		// Hashmap 객체를 활용해 키 - 값을 저장하고
				Map <String, String> st = new HashMap<String, String>();
				
		//Map <String, String>  : 제네릭을 사용하여 키와 값의 데이터 타입을 지정한것
		//new HashMap<String, String>() : HashMap 클래스를 사용하여 새로운 HashMap 객체를 생성
		//Map <String, String> st = new HashMap<String, String>(initialCapacity, loadFactor);
		//인수는 전달하지 않는다. 위의 인수 내부동작을 조정하는 매개변수입니다.
				
				st.put("map", "지도");
				st.put("java", "자바");
				st.put("school", "학교");
				
		//Scanner 객체와 do-while 문으로 키를 검색하는 예제
				Scanner scan = new Scanner(System.in);
					do {
		//입력받은 값을 key 변수에 저장
						System.out.println("영어 단어를 입력하세요 : ");
						String key = scan.next();
		//입력받은 값이 quit면 반복문 탈출
						if ( key.equals("quit"))
							break;
		//입력받은 키에 해당하는 값을 출력
						System.out.println("단어의 의미는 " + st.get(key) );
					}while(true);
					
					scan.close();

	}

}
