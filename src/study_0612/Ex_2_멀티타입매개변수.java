package study_0612;


import model.Study_0612_Ex_2_1_KeyValue;


public class Ex_2_멀티타입매개변수 {

	public static void main(String[] args) {
		/* KeyValue 라는 메소드에 String, Integer라는 인자를 넘겨서 String, Integer 타입의 KeyValue를 리턴받는다는 의미*/
		Study_0612_Ex_2_1_KeyValue<String, Integer> kv1 = new Study_0612_Ex_2_1_KeyValue<>();
		
		//setKey라는 메소드에 "사과" 값을 입력한다.
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		//setKey로 입력한 값을 getKey로 받아온다.
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key : " + key1 +"\t"+ "value : " + value1);
		
		Study_0612_Ex_2_1_KeyValue<Integer, String> kv2 = new Study_0612_Ex_2_1_KeyValue<>();
		kv2.setKey(404);
		kv2.setValue(" Not Found ( 요청한 페이지를 찾을 수 없음");
		System.out.println();
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("key : " + key2+"\t"+ "value : " + value2);
		
		Study_0612_Ex_2_1_KeyValue<String, Void > kv3 = new Study_0612_Ex_2_1_KeyValue<>();
		kv3.setKey("키 값만 사용");
		System.out.println();
		String key3 = kv3.getKey();
		System.out.println("key : " + key3);
		
	}
}

/*
제네릭을 사용하면 구체적인 데이터 타입을 인스턴스에 지정할 수 있어 중복의 제거와 타입의 안정성을 동시에 추구할 수 있다.
여기서는 <K , V> 사용해서 타입 오류를 방지

KeyValue(Stirng , Integer> kv1 = new KeyValue<>(); 
KeyValue(Integer, Stirng> kv2 = new KeyValue<>(); 
KeyValue(Stirng , Void> kv3 = new KeyValue<>(); 

다 다른 자료형을 리턴 값으로 받지만 제네릭을 씀으로 하나의 코드로 만들 수 있다.


 */
