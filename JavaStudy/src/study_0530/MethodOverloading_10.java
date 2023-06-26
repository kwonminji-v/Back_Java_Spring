package study_0530;

public class MethodOverloading_10 {

	public static void main(String[] args) {
		
		print();  //데이터가 없음
		print(3); 
		print(5.8);
		print(2, 5);

	}
	
	public static void print() {
		System.out.println(" 데이터가 없습니다. ");
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double a) {
		System.out.println(a);
	}
	
/*
불가능 (void print(double a) {} 와 중복 )
 	public static void print(double b) {
		System.out.println(b);
	} -> 출력이 불가능 하다.
 
 */
	
	public static void print(int a, int b) {
		System.out.println("a = " + a  +   "b = " + b);
	}

}
