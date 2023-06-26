package jungsuk_0621;


class GenericMethods {
	public <T> T method1(T t) {
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K, V> void method3(K k, V v) {
		System.out.print(k +  " : ");
		System.out.println(v);
	}
}



public class Ex2_genericMethod {
	
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();

		String str1  = gm.<String>method1("안녕"); 
		//<String> 타입이 입력되는 순간, T의 타입이 String 타입이 됨
		String str2 = gm.method1("안녕");
		//↓ 근데 인자로 "안녕"이라는 입력매개변수를 가지고있기 때문에 String 타입의 데이터를 
		//입력하게되면 String이라는 타입의 작성이 생략되더라도 출력됩니다. 
		System.out.println(str1  +  " ,"  +  str2);   //안녕 , 안녕
		
		
		boolean bool1 = gm.<Double>method2(2.5,2.5);
		boolean bool2 = gm.method2(2.5, 2.5);
		System.out.println(bool1 + " , " + bool2);  //true, true
		
		
		gm.<String, Integer> method3("국어", 80);  //국어 : 80
		gm.method3("국어" , 80);
	}
		
		
}
