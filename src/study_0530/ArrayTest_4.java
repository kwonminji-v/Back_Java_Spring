package study_0530;

public class ArrayTest_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num = {5,4,3,2,1};
		int temp = 0;
		
		System.out.println("정렬 전 배열 값 ");
		
		for ( int i = 0; i < num.length; i++) {
			System.out.println(num[i] + "\t");
		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = i; j < num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[j];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		
	}

}

/*  Arrays.toString(1차원 배열 ) 배열값 출력 정적 메서드 
 	 ex) System.out.println(Arrays.toString(new int[] {1,2,3};   [1,2,3]

for-each 구문 : for (원소 자료형 변수 : 묶음 참조 자료형 ) {
	집합객체 원소의 자료형 배열, 컬렉션 등 집합객체
	배열 또는 컬렉션과 같이 다수의 원소를 가지고 있는 객체에서 원소를 하나씩 차례로 꺼내는 기능을 반복적으로 수행
}

int [] a= new int[100];
a[0] = 1, a[1] = 2, .. a[99] = 100;


 */