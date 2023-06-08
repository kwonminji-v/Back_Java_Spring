package study_0608;

import java.util.ArrayList;

//컬렉션 : 자바의 자료구조를 구현한 클래스
//배열과 유사한 다양한 배열 타입을 제공
//Vector, HashMap, HashSet, Stack, Enumeration, ArrayList 등
public class Ex_13_ArrayList_유틸 {

	public static void main(String[] args) {
		/*
		 ArrayList 객체
		 <> 다이아몬드 연산자(제네릭)을 이용해 저장될 데이터의 자료형을 정할 수 있다.
		 꺽쇠 안쪽은 자료형 객체가 들어가야 하므로 , 랩퍼 클래스로 쓰여야 한다. 
		 */
		ArrayList<String> al = new ArrayList<String>();
		/*
		 add : ArrayList 객체에 데이터를 저장하는 메서드
		 ArrayList의 장점은 저장 순서 대로 데이터가 출력 된다는 점이다.
		 그래서 가장 많이 쓰이는 편이다.
		 */
		
			al.add("강아지");
			al.add("고양이");
			al.add("햄스터");
			al.add("다람쥐");
			al.add("호랑이");
			al.add("코뿔소");
			al.add("반달곰");
			al.add("기러기");
			
	//ArrayList에 저장된 값 출력
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				for (String str : al)
					System.out.println(str);
			} //배열 : .length 속성을 사용하여 길이를 얻음 . 길이는 고정되어 있다
			  //컬렉션(ArrayList, LinkedList 등) : size() 메소드를 사용하여 현재 요소의 수를 얻을 수 있다.
			 //크기도 동적으로 변경될 수 있다.

	}

}
