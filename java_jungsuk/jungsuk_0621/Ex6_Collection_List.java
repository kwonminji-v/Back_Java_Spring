package jungsuk_0621;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex6_Collection_List {

	public static void main(String[] args) {
		
		//#1. 배열을 선언하고 배열 인덱스의 값, 인덱스를 변경해보자
		String[] array = new String[] {"강아지","귀여워","고양이도","귀여워","푸바오","귀여워","동물들"};
		
		array[2] = null;
		array[5] = null;
		System.out.println(array.length); // 출력 : 7
		System.out.println(Arrays.toString(array)); //출력 : [강아지,귀여워,null,귀여워,푸바오,null,동물들]
		//Arrays( 정적메서드 클래스).toString(매개변수 , 여기서는 배열을 입력) -> 배열 객체가 한번에 출력됨
		
		
		
		//#2.collection List<> 를 사용하여 동적으로 배열 변경을 해보자.
		List<String> aList = new ArrayList<>();
		System.out.println(aList.size()); //출력 : 0 (담겨있는 값이 없다)
		
		aList.add("강아지");    aList.add("귀여워");   aList.add("고양이도");   aList.add("귀여워");   
		aList.add("푸바오");    aList.add("귀여워");   aList.add("동물들짱");
		
		System.out.println(aList.size());  //출력 : 0 (위의 add메서드로 값들이 담겨졌다)
		aList.remove("귀여워");    aList.remove("동물들짱");
		System.out.println(aList.size());  // 출력 : 5
		System.out.println(aList);  //출력 : [강아지, 고양이도, 귀여워, 푸바오, 귀여워]
		//중복 데이터가 입력되면 인덱스 넘버가 빠른 데이터만 remove된다
		//모든 컬렉션 객체(List, Set..)는 자신의 데이터를 모두 출력하도록 toString() 메서드를 오버라이딩 해두었다.
		
	}

}
