package jungsuk_0624;

import java.util.TreeSet;

class MyClass {
	int data1;
	int data2;
	
	public MyClass(int data1 ,  int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}
//상속과 다형성에 의해서 부모:Comparable 자식 : MyComparableClass 
class MyComparableClass implements Comparable<MyComparableClass> {
	//MyComparableClass라는 타입을 <>에 작성해 주었고, 이 클래스는 비교에 관련된 내용을 포함시키는데,
	//Comparable이라는 인터페이스를 implements로 구현해주어야 합니다. 
	int data1;
	int data2;
	
	public MyComparableClass  (int data1 ,  int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	//Comparable 인터페이스 안에는 미완성 메서드가 있는데 이 메서드는 compareTo이며, 
	//이 메서드 안에서 대소 크기비교의 기준을 설정 할 수 있습니다. (음수, 0, 양수)
	@Override
	public int compareTo(MyComparableClass o) {
		if (this.data1 < o.data1) return -1;
		else if (this.data1 == data2) return 0;
		else return 1;
	}
}





public class Ex2_TreesetCompare {

	public static void main(String[] args) {
		
			//#1. Integer 크기 비교
			TreeSet<Integer> treeSet1 = new TreeSet<>();
			Integer intValue1 = new Integer(20);
			Integer intValue2 = new Integer(10);
			treeSet1.add(intValue1);
			treeSet1.add(intValue2);
			System.out.println(treeSet1.toString());
			
			//#2. String 타입의 크기비교
			TreeSet<String> treeSet2 = new TreeSet<String>();
			String st1 = "가나";
			String st2 = "다라";
			treeSet2.add(st1);
			treeSet2.add(st2);
			System.out.println(treeSet2);
			
			//#3. MyClass(내가 생성한 클래스) 객체 크기 비교
			TreeSet<MyComparableClass> treeSet3 = new TreeSet<MyComparableClass>();
			
			MyComparableClass myClass1 = new MyComparableClass(2, 5);			
			MyComparableClass myClass2 = new MyComparableClass(3, 3);
			treeSet3.add(myClass1);
			treeSet3.add(myClass2);
			System.out.println(treeSet3.comparator());
			
			
			
			
			
			
			
			
	}

}
