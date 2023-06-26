package study_0608;

import java.util.ArrayList;


public class Ex_14_ArrayList_인덱스추가삭제 {
	
	public static void main(String[] args) {
		
	
//ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<>();

// ArrayList에 해당 값 순서대로 추가
		
		list.add("강아지");
		list.add("고양이");
		list.add("호랑이");
		list.add( "푸바오");
		
// ArrayList의 해당 인덱스에 해당 값 추가 ( 나머지 뒤로 밀림)
		list.add(1, "독수리");
		 
// ArrayList에 해당 인덱스의 값을 해당 값으로 변경
		list.set(2, "기러기");
// ArrayList에 해당 인덱스의 값 삭제
		list.remove(3);
		
		for(String str : list) {
			System.out.println(str);
		}

	}
}
