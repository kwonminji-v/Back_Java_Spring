package study_0608;

import java.lang.reflect.Method;


public class Ex_7_GenericMethods {

	//일반 클래스 안에 제네릭 메서드
	class GenericMethods {
		public <T> T Method(T t) {
			return t;
		}
		public <T> boolean method(T t1, T t2) {
			return t1.equals(t2);
		}
		public <K,V> void method3(K k, V v) {
			System.out.println(k + ":" + v);
		}
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
