package jungsuk_0621;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;


class Ab {
	int data;
	public Ab (int data) {
		this.data = data;
	}
}

class Ba {
	int data;
	public Ba (int data) {
		this.data = data;
	}
}

public class Ex9_HashSet중복 {
		public static void main(String[] args) {
			
			
			//#1. 아무것도 오버라이딩 하지 않음 (둘 다 Object class의 메서드를 사용)
				Set<Ab> hashSet1 = new HashSet<>();
			
				Ab a1 = new Ab(3);
				Ab a2 = new Ab(3);
				System.out.println(a1 == a2); //출력 : false 
				//stack의 heap 메모리를 비교하는 것 (별도의 객체 생성으로 위치가 다르기 때문에 같을 수 없다)
				System.out.println(a1.equals(a2)); //출력 : false 
				//Object클래스의 equals 메서드도 마찬가지로 heap메모리를 비교함
				System.out.println(a1.hashCode() + " , " + a2.hashCode());
			
				hashSet1.add(a1);
				hashSet1.add(a2);
				System.out.println(hashSet1.size());
			
				
			//2.
			
			
			
		}
}
