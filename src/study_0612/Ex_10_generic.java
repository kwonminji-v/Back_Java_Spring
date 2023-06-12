package study_0612;

	//Comparable<T> 인터페이스 : compareTo(T obj) 추상 메서드를 활용할 수 있음
	//Numutil은 comparable을 상속 받는 타입만 전달 받을 수 있고, 인터페이스 

	class NumUtil<T extends Comparable<T>> implements Maximum<T>{
	   //제네릭 타입 배열 Field
			private T[] value;
	   //생성자 : 멤버 변수 초기화
		   public NumUtil(T[] value) {
		      this.value = value;
		   }
   
	   //상속 받은 인터페이스 Maximum의 max()메소드 구현
	   //배열 요소 중 가장 큰 값을 찾는 메소드
	   public T max() {
	      //변수 v에 멤버 변수 value 배열의 첫 번째 같을 저장
	      T v = value[0];
	      for(int i=0; i< value.length; i++) {
	         if(value[i].compareTo(v) > 0)
	            v= value[i];
         //value[i]의 값이 더 크면 v변수 값이 저장, 가장 큰 값 추출
         //compare to 메소드는 현재 객체와 매개변수로 전달받은 객체의 유니코드 순서를 비교하여 작으면 음수, 같으면 0, 크면 양수로 반환
      }
      return v;
   }
}


interface Maximum<T extends Comparable<T>> {
	
   //제너릭 인터페이스 선언, comparable을 상속 받는 타입만 전달 받음
   T max();
}


   /*
   
와일드카드는 제네릭 타입을 매개 값이나 리턴 타입으로 사용할 때 
구체적인 타입 대신 사용하는 것으로 코드에서 ?로 표현된다.

제네릭타입<?> : 모든 클래스 / 인터페이스 타입이 올 수 있다.
제네릭타입<? extend 상위타입> : 상위타입 또는 상위타입을 상속받은 하위 객체만 타입으로 
							지정할 수 있다.
제네릭타입<? super 하위타입> : 하위타입 또는 하위타입이 상속하고 있는 상위 객체만 타입으로
							지정할 수 있다. 
public void myMethod(ArrayList<? extends Number> list) { . . . }
메소드가 받아들일 매개변수 ArrayList 타입 변수는 Number 클래스와 
Number 클래스를 상속받은 클래스들의 객체들만 받는다라고 명시한 것 

>>제네릭 타입 범위 제한(Bound)<<
class Goods<T>{
	private T t;
	public T get(){
	return t;
}
public void set(T t){
	this.t= t;
}
제네릭 파라미터 <T>에 들어갈 수 있는 타입은?? 
D->C->B->A 유형이 있다고 할 때 유형별로 알아보기.

1. 접근지정자 메서드이름 ( 제네릭 클래스명<제네릭 타입명> 참조변수명){ }  
ex)  method(Goods<A> v)  -: A타입만 가능하다. 
2. 접근지정자 메서드이름(제네릭 클래스명 <?> 참조변수명) {}
ex) method(Goods<?> v) -: A, B, C, D 타입 모두 가능하다. 
3. 접근지정자 메서드이름 ( 제네릭 클래스명<? extends 제네릭 타입명> 참조변수명){ }  
ex) method(Goods<? extends B> v) : B, C, D만 가능하다.
4. 접근지정자 메서드이름 ( 제네릭 클래스명<? super 제네릭 타입명> 참조변수명){ }  
ex) method(Goods<? super B> v) : A, B만 가능하다	

*/
public class Ex_10_generic {

   public static void main(String[] args) {
      Integer[] inum = { 1, 2, 3, 4, 5};
      Double [] dnum = { 1.0, 2.0, 3.0, 4.0, 5.0};
      String [] snum = {"1", "2", "3", "4", "5"};
      //각 기본 타입의 제네릭 객체 생성 및 위에서 생성한 배열로 초기화
      NumUtil<Integer> iutil = new NumUtil(inum);
      
      //inum은 결국 인수이다. 객체를 생성하고 초기화하는 과정에서 사용되는 배열 인수이다. 
      NumUtil<Double> dutil = new NumUtil(dnum);
      NumUtil<String> sutil = new NumUtil(snum);
      //각 객체마다 초기화환 배열의 제일 큰 값 출력
      System.out.println("inum 최대값 : " + iutil.max());
      System.out.println("dnum 최대값 : " + dutil.max());
      System.out.println("snum 최대값 : " + sutil.max());

   }

}