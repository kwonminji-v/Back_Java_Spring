package study_0612;

import java.util.HashMap;
import java.util.Scanner;

import model.*;

public class Ex_8_HashMap컬렉션 {

	public static void main(String[] args) {
			//학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
		
				HashMap<String, Study_0612_Ex_8_Student > map = new HashMap<String, Study_0612_Ex_8_Student>();
			
				
			//3명의 학생 저장 
				map.put("가나다", new Study_0612_Ex_8_Student(1, "111-1111-1111"));
				map.put("마바사", new Study_0612_Ex_8_Student(2, "222-2222-2222"));
				map.put("아자차", new Study_0612_Ex_8_Student(3, "333-3333-3333"));
				
				
				
				Scanner sc = new Scanner(System.in);
				while(true) {
				System.out.println("검색할 이름을 입력하세요 = ");
			
			//사용자로부터 이름을 입력받아 name 변수에 저장
				String name = sc.nextLine();
				
			//입력 값이 exit이면 while문을 벗어난다.
				if (name.equals("exit"))
					break;
				
			//입력한 이름(key)에 해당하는 Student객체(value) 검색하여 student 변수 저장
					Study_0612_Ex_8_Student std = map.get(name);
			
			//key에 해당하는 value가 없으면 이름과 없는 사람 출력
					if (std == null)
						System.out.println(name + "은 없는 사랍입니다.");
					
			//있으면 해당 객체 안의 id와 전화번호 출력
					else System.out.println("id = " + std.id + ", 전화 = " + std.tel);
			}
				
				sc.close();
			

	}

}
