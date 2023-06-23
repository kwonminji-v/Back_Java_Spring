package jungsuk_0621;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class Ex8_HashSetMethod {
		public static void main(String[] args) {
			
			Set <String> hSet1 = new HashSet<>();
			
			//#1. add(E element)
			hSet1.add("가");
			hSet1.add("나");
			hSet1.add("가");
			System.out.println(hSet1.toString()); //출력 : [가, 나]
			
			//2. addAll( 다른 set 객체)
			Set<String> hSet2 = new HashSet<>();
			
			hSet2.add("나");
			hSet2.add("다");
			hSet2.addAll(hSet1);
			System.out.println(hSet2); //출력 : [가, 다, 나] -> 순서가 없기 때문에 
			
			//#3. remove(Object o)
			hSet2.remove("나");
			System.out.println(hSet2); //출력 : [가, 다]
			
			//#4.clear()
			hSet2.clear();
			System.out.println(hSet2); //출력 : []
			
			//#5. isEmpty();
			System.out.println(hSet2.isEmpty()); //출력 : true
			
			//#6. contains (Object o)
			Set<String> hSet3 = new HashSet<>(); 
			hSet3.add("가");
			hSet3.add("나");
			hSet3.add("다");
			System.out.println(hSet3.contains("나")); //출력 : true
			System.out.println(hSet3.contains("라")); //출력 : false
			
			
			//#7. iterator() -> iterator 객체를 뽑아내는 메서드 (안에 담겨있는 데이터를 하나씩 읽을 수 있는 기능을 하는 메서드)
			Iterator<String> iterator = hSet3 .iterator();
			
			while(iterator.hasNext()) { //가지고 있는 데이터가 있는 유무의 횟수만큼 순회 하기 때문에 데이터가 3개라 3번반복
				System.out.println(iterator.next()); // 집합 안에 가리킬 데이터가 있다면 next()를 통해 가리키고 다음 데이터가 있다면 next()기능해 다음 데이터를 가리킵니다.	
			}
			
			
			
			
			
			
			
			
		}
}
