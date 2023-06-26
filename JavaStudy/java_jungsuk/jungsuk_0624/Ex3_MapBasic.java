package jungsuk_0624;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class Ex3_MapBasic {
		public static void main(String[] args) {
			
			Map<Integer, String> hMap1 = new HashMap<Integer, String>();
			
			//#1. put (K Key, V  Value)
			hMap1.put(2, "나다라");
			hMap1.put(1, "가나다");
			hMap1.put(3, "아자차");
			System.out.println(hMap1.toString()); //출력 : {1=가나다, 2=나다라, 3=아자차}
			
			//#2. putAll(다른 맵객체 인풋)
			Map<Integer, String> hMap2 = new HashMap<Integer, String>();
			hMap2.putAll(hMap1);
			System.out.println(hMap2.toString()); //출력 : {1=가나다, 2=나다라, 3=아자차}
			
			//#3. replace(K key, V value)
			hMap2.replace(1, "가가가"); //hMap2의 1번키를 가지고 있던 데이터가 변경됩니다.
			hMap2.replace(4, "라라라"); //그냥 동작을 하지 않습니다.
			System.out.println(hMap2.toString()); //출력 : {1=가가가, 2=나다라, 3=아자차}
			
			//#4. replace(K key, V oldValue, V newValue)
			//해당 key와 value가 완벽하게 일치해야 동작합니다.
			hMap2.replace(1, "가가가", "나나나"); 
			//key가 1이고 , value가 가가가 이면 새로운 value 값인  나나나로 대체해주는 것입니다.
			hMap2.replace(2, "다다다", "라라라"); 
			System.out.println(hMap2); //출력 : {1=나나나, 2=나다라, 3=아자차}
			
			//#5. V get (Object key) : 특정 key를 가지고 value를 가지고 오는 것 
			System.out.println(hMap2.get(1)); //출력 : 나나나
			System.out.println(hMap2.get(2)); //출력 : 나다라
			System.out.println(hMap2.get(3)); //출력 : 아자차
			
			//#6. containsKey(Object key) & containsValue(Object value)
			System.out.println(hMap2.containsKey(1)); //1이라는 key가 있으면 true
			System.out.println(hMap2.containsKey(5)); //출력 : false
			System.out.println(hMap2.containsValue("나다라")); //출력 : true
			System.out.println(hMap2.containsValue("라라라")); //출력 : false
			
			//#8.  Set<K> keySet() -> 해당 key들만 담아 Set으로 만들어 줌
			Set<Integer> keySet = hMap2.keySet();
			System.out.println(keySet.toString()); //hMap2의 key만 뽑아서 출력되었습니다.
			//출력 : [1, 2, 3]
			
			//#9. Set<Map.Entry<K,V> entrySet()
			Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
			System.out.println(entrySet); //출력 : [1=나나나, 2=나다라, 3=아자차]
			
			
			
			
			
			
			
			
			
			
			
		}
		
}
