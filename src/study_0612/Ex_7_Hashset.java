package study_0612;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set은 요소의 순서를 유지하지 않고 중복을 허용하지 않는 자료구조입니다.
public class Ex_7_Hashset {

	public static void main(String[] args) {
				Set <String> set = new HashSet<>();
				
		//set의 요소들을 순회하기 위해 Iterator 객체를 생성합니다.
				set.add("apple");
				set.add("banana");
				set.add("cherry");
				
		//Set을 순회하면서 요소를 가져오기
				Iterator<String> iterator = set.iterator();
				while (iterator.hasNext()) {
					String element = iterator.next();
					System.out.println(element);
				}
	}
}
/*
HashSet은 순서를 유지하지 않는 자료구조이므로 요소들이 출력되는 순서는 예측할 수 없습니다.
List구조에 비해 속도가 느립니다. 
Set은 비선형 구조이기에 순서가 없으며  그렇기에 인덱스도 존재하지 않습니다.
Set은 한 칸씩 저장공간을 늘리지 않고 약 2배로 늘리기에 여기서 과부하가 많이 발생합니다.
				 
HashMap<K, V>
	(1) 키 (key)와 값(value)의 쌍으로 구성된 요소(entity)를 다루는 컬렉션
	(2) java.util.HashMap을 import 해서 사용 가능
	(3) K는 키로 사용할 요소의 타입, V는 값으로 사용할 요소의 타입 지정
	(4) 키와 값이 한 쌍으로 저장됨
	(5) 키는 해시맵에 삽입되는 위치 결정에 사용
	(6) 값을 검색하기 위해서는 키를 이용 (삽입, 삭제 , 검색이 빠른 특징)
	
HashMap(String, String> h = new HashMap<String, String>();
		
		h.put("apple" , "사과");   -> "apple"키와 "사과" 값을 쌍으로 해시맵에 삽입
		String kor = h.get("apple");  -> "apple"키로 값 검색. kor은 "사과"
				 
 */
