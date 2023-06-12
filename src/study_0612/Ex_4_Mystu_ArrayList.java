package study_0612;

import java.util.ArrayList;
import model.Study_0612_MyStudent;

public class Ex_4_Mystu_ArrayList {

	public static void main(String[] args) {
		// MyStudent 객체만 넣을 수 있는 ArrayList 객체 생성
			 ArrayList<Study_0612_MyStudent> list = new ArrayList<Study_0612_MyStudent>();
		
		//ArrayList에 "이순신"으로 초기화 된 MyStudent 객체 삽입
			 list.add(new Study_0612_MyStudent("이순신"));
			 list.add(1, new Study_0612_MyStudent("홍길동"));
			 
		//ArrayList에 저장된 Mystudent 객체를 빼오기 위해 
		//Mystudent 타입의 변수 생성 후 get() 메소드로 ArrayList의 첫 번째 값 대입
			Study_0612_MyStudent s = list.get(0) ;
			Study_0612_MyStudent s1 = list.get(1) ;
			
			
		//foreach문을 사용하여 ArrayList로 생성된 list의 요소들을 출력해본다.
			for(Study_0612_MyStudent std : list) {
				System.out.println("학생 이름 = " + std.getName());
			}
			
		//MyStudent s = (Mystudent)list.get(0);  //제네릭을 사용하지 않았다면 이렇게 작성
			
			System.out.println("------------------");
		//저장된 이름 출력
			System.out.println("학생 이름 = " + s.getName());
			System.out.println("학생 이름 = " + s1.getName());
		//list.get(0).getName()을 통해 첫 번째 요소의 이름을 바로 가져와서 할 수도 있습니다.
	}

}
