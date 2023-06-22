package jungsuk_0621;

import java.util.ArrayList;
import java.util.List;

public class Ex7_ArrayListMehtod {

	public static void main(String[] args) {

			List<Integer> aList1 = new ArrayList<Integer>();
			
			//#1. add (E element) - 데이터 추가
			aList1.add(3);
			aList1.add(4);
			aList1.add(5);
			System.out.println(aList1.toString()); //  = ~.println(aList1)의 출력값과 동일
			
			//#2. add(int index, E element)
			aList1.add(1,6);
			System.out.println(aList1); //출력 : [3,6,4,5]
			
			//#3. addAll(또다른 list 객체 -> list안에 포함하고 있는 데이터들을 자기 자신에게 추가)
			List<Integer> aList2 = new ArrayList<Integer>();
			aList2.add(1);
			aList2.add(2);
			aList2.addAll(aList1);
			System.out.println(aList2); //출력 : [1,2,3,6,4,5]
			
			//#4.addAll(int index, 또 다른 list 객체) -> 특정 인덱스 위치에 다른 객체 데이터를 추가함
			List<Integer> aList3 = new ArrayList<Integer>();
			aList3.add(7);
			aList3.add(8);
			aList3.addAll(1, aList3); 
			System.out.println(aList3); //출력 : [7,7,8,8]
			
			//#5. set(int index, E element) -> 특정위치의 데이터를 변경해 줌
			aList3.set(1, 5);
			aList3.set(3, 6);
			System.out.println(aList3); //출력 : [7, 5, 8, 6]
			
			//#6. remove(int index) -> 특정 index의 데이터를 지움
			aList3.remove(1);  
			//()안에는 꼭 ! 인덱스를 가리키는 숫자를 작성
			//-> 모든 제네릭은 실제 값을 지우고 싶을때는 클래스 객체타입으로 정해주어야합니다.
			System.out.println(aList3);  //출력 : [7, 8, 6]
			
			//#7. remove(Object o)
			aList3.remove(new Integer(7));
			System.out.println(aList3); //출력 : [8, 6]
			
			//#8. clear() -> 모든 데이터를 한번에 지워줍니다.
			aList3.clear();
			System.out.println(aList3); //출력 : [8, 6]
			
			
	}

}

