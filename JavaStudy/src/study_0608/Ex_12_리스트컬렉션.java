/*
List 컬렉션
컬렉션 프레임워크를 상속받고 있는 List 컬렉션은 객체를 일렬로 늘어놓은 구조를 가지고있다.
List 컬렉션은 객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동인덱스가 부여되고 
인덱스로 객체를 검색, 삭제 할 수 있는 기능을 제공한다.
(인덱스에는 데이터가 저장되어 있는 참조 값을 가지고 있다.)
List 컬렉션은 객체 자체를 저장하는 것이 아니라 객체의 번지를 참조하는 것
동일한 객체를 중복 저장할 수 있는데 이 경우 동일한 번지가 참조된다.
null도 저장 가능한데 이 경우 해당 인덱스는 객체를 참조하지 않는다.
ArrayList, LinkedList, Vector 이 3가지 클래스는 List 인터페이스를 같이
상속하고 있으며, 공통적으로 사용할 수 있는 메서드들이 많다.

 List 컬렉션 
 1) ArrayList
  - ArryaList는 List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형 리스트이다.
    일반적인 배열과 같은 순차리스트이며, 인덱스로 내부의 객체를 관리한다는 점이 유사하지만 
    한번 생성되면 크기가 변하지 않는 배열과 달리 ArrayList는 객체들이 추가되어 저장용량(capacity)이 초과된다면
    자동으로 부족한 크기만큼 저장용량이 늘어난다는 특징을 갖고 있습니다.
    
    ArrayList 선언
    1. ArrayList list = new ArrayList();   -> 타입 미설정 Object로 선언된다.
    선언 후 내부에 임의의 값을 넣고 사용할 수 있지만 이 방식을 사용할 경우
    값을 뽑아내기 위해 캐스팅 연산이 필요하며 잘못된 타입으로 캐스팅한 경우 에러가 발생하기에 추천하지 않는다.
    
    2. ArrayList <Student> members = new ArrayList<Student>();
    타입 설정, Student 객체만 사용 가능
    
    3. ArrayList<Integer> num = new ArrayList<Integer>();
    타입설정은 int 타입만 가능
    
    4. ArrayList<String> str = new ArrayList<String>();
    타입은 String 타입만 가능
    
    5. ArrayList<Integer> num2 = new ArrayList<>();
    new 연산자 뒤의 생성자에서 <>안의 파라미터가 생략 가능하다 / 자동으로 int타입이 적혀있음.
    
    6. ArrayList <Integer> num3 = new ArrayList<>(10);
    초기 용량(capacity)을 지정해주었다.
    
    7. ArrayList<Integer> list2 = new ArrayList<Integer> (Arrays.asList(1,2,3));
   	생성 시 값 추가 고정 크기의 리스트를 생성하여 ArrayList 생성자에 전달하여 새로운 ArrayList를 생성하고 초기화 하는방법
   	ArrayList를 생성하면서 동시에 초기값을 제공
*/




package study_0608;

public class Ex_12_리스트컬렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
