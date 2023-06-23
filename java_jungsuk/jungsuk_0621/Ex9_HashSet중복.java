package jungsuk_0621;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


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
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ba) {
		this.data = ((Ba)obj).data;
		return true;
		}
		return false;
	}
}

class Cc  {
	int data;
	public Cc(int data) {
		this.data = data;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Cc) {
			this.data = ((Cc)obj).data;
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(data);
		//Object hashCode는 위치를 기반으로 해시코드를 만들어주는데 ,
		//Objects.hash(값)을 넣게되면 해당 값을 기반으로 해시코드를 만들어 줌 (데이터가 똑같다면 동일한 해시코드가 출력됨)
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
			
				System.out.println();
				
				
			//2. equlals메서드만 오버라이딩하여 사용한 코드
				Set<Ba> hashSet2 = new HashSet<>();
				
				Ba b1 = new Ba(3);
				Ba b2 = new Ba(3);
				System.out.println(b1 == b2); //출력 : false 
				System.out.println(b1.equals(b2)); //출력 : true
				//데이터(내용)가 같다면 true를 반환하도록 오버라이딩을 해두었기 때문에 true가 출력
				System.out.println(b1.hashCode() + " , " + b2.hashCode());
			
				hashSet2.add(b1);
				hashSet2.add(b2);
				System.out.println(hashSet2.size());
				
				System.out.println();
				
				//3. equlals메서드 , hashCode();메서드 둘 다 Object 클래스의 메서드를 오버라이딩하여 사용한 코드
				Set<Cc> hashSet3 = new HashSet<>();
				
				Cc c1 = new Cc(3);
				Cc c2 = new Cc(3);
				System.out.println(c1 == c2); //출력 : false 
				System.out.println(c1.equals(c2)); //출력 : true
				//데이터(내용)가 같다면 true를 반환하도록 오버라이딩을 해두었기 때문에 true가 출력
				System.out.println(c1.hashCode() + " , " + c2.hashCode());
				
				hashSet3.add(c1);
				hashSet3.add(c2);
				System.out.println(hashSet3.size());
			
			
			
		}
}
