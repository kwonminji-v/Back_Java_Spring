package study_0612;

import java.util.ArrayList;


//ArrayList 특징
//java.util.List 계열이다.
// - 객체(데이터)에 순서가 지정된다.
// - 모든 타입의 객체를 저장할 수 있다.
// - 저장하는 객체(데이터)의 개수에 제한이 없다.
//ArrayList는 List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형 리스트이다.
public class Ex_1_ArrayList {

	public static void main(String[] args) {
		// 문자열만 저장할 수 있는 ArrayList 객체 생성
			ArrayList<String> al = new ArrayList<>();
		//add(value) : ArrayList의 삽입 메소드
			al.add("watermelon");                        al.add("apple"); 
			al.add("banana");                                   al.add("watermelon");       
			al.add("Jujube");                                      al.add("banana");
			
		//size() : ArrayList에 저장된 데이터의 개수를 반환하는 메소드
			System.out.println("Count : " + al.size());
		//ArrayList에 저장된 요소 출력
			print(al);
			System.out.println("-------------------");
			
		//set(index, value) 해당인덱스에 저장된 데이터 변경하는 메소드
			al.set(1, "kiwi(change)");
			print(al);
			System.out.println("-------------------");
			al.set(4, "peach(change)");
			print(al);
			System.out.println("-------------------");
			
		//remove(index) : 해당 인덱스에 저장된 데이터 삭제
			al.remove(0);
			print(al);
			System.out.println("---------인덱스 0번째 삭제----------");
			System.out.println();
			
		//get(index) : 해당 인덱스에 저장된 데이터를 반환
			System.out.println("Index 3 : " + al.get(3));
			
		//contains(value) : 해당 값이 저장되어 있는지 확인
			System.out.println("banana : (바나나가 존재하면 true가 출력) " + al.contains("banana"));
			
		//indexOf(value) : 해당 값이 저장되어 있다면 그 위치 (index) 반환
			System.out.println("banana : (바나나의 인덱스 넘버)" + al.indexOf("banana"));
			
		//lastIndexOf(value) : 해당 값이 여러개 저장되어 있다면 제일 마지막에 저장된 위치(index) 반환
			System.out.println("banana : (바나나가 두개 있는데 가장 나중에 저장된 바나나의 인덱스 번호 출력) " + al.lastIndexOf("banana"));
			
		//ArrayList 안의 값들을 확인하여 "banana"가 있다면 "strawberry"로 바꾸는 로직
			
			for (int i = 0; i < al.size(); i++) 
				if (al.get(i).equals("banana"))
					al.set(i, "strawberry");
				print(al);
			
	}
		//문자열만 저장할 수 있는 ArrayList를 매개변수로 전달받아 그 안의 값들을 출력하는 메소드
			private static void print(ArrayList<String> al) {
				//확장 for 문을 이용해 전달받은 매개변수의 값을 하나씩 출력
				for (String str : al) {
					System.out.println(str + "\t");
    				System.out.println();
				}
			}
 		//set 인터페이스는 요소의 순서를 유지하지 않으며, 인덱스로 요소를 검색하는 get(index) 메서드를 제공하지 않습니다.
		//get (index) 메서드는 List 인터페이스와 그 구현체들인 ArrayList, LinkedList 등에서 사용할 수 있습니다.
		//set은 요소의 순서를 유지하지 않는 자료구조이기 때문에 순서에 의존하여 요소를 가져오는 것은 보장되지 않는다
		//따라서, set에서 요소를 순서대로 출력하거나 특정 인덱스의 요소를 가져오려면 Iterator를 사용하거나 foreach루프를 활용해야 합니다.
	}

