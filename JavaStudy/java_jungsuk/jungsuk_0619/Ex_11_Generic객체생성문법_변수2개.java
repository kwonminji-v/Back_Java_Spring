package jungsuk_0619;

class KeyValue<K, V> {
	// key와 value라고 하는 필드와 메서드를 만들었음
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

public class Ex_11_Generic객체생성문법_변수2개 {

	public static void main(String[] args) {

		KeyValue<String, Integer> kv1 = new KeyValue<>();
		//String은 K로 Integer는 V로 들어가게 됨
		
		kv1.setKey("사과");
		kv1.setValue(25000);
		
		String key1 = kv1.getKey(); //getKey는 K타입으로 리턴하며, 다운캐스팅이 전혀 필요 없음!
		int value1 = kv1.getValue();

		System.out.println("key1값 = " + key1 + "  " + "value1값 = " + value1);
		
		
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		
		kv2.setKey(404);
		kv2.setValue("Not Found (요청한 페이지를 찾을 수 없습니다)");
		
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		
		System.out.println("key2값 = " + key2 + " " + "value2값 = " + value2);

		
		
		
		//제네릭은 2개지만 2개의 타입 중 하나만 사용할 수도 있음 
		KeyValue<String, Void> kv3 = new KeyValue<>();
		// Void는 return하지 않는 값 value의 위치에 Void가 있으니 void type위치의 타입은 쓰지 않겠다는 의미
		
		kv3.setKey("키값만 쓸거에요");
		String key3 = kv3.getKey();
		
		System.out.println("key3의 값은 = " + key3);
	}

}
