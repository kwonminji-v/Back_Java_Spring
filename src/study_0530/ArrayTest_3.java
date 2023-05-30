package study_0530;

public class ArrayTest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [  ] num = {1,2,3,4,5,6,7,8,9,10};
		int len = num.length;
		int [  ] temp = new int[len];
		
		System.out.println("교환 전 배열 요소의 값");
		
		for ( int i = 0; i < len; i++) {
			System.out.println(num[i] + "\t");
			
		}
		
		for (int i = 0; i<len; i++) {  // num[9]가 되어 마지막 요소에 접근
			temp[i] = num[len-1-i];
		}
		
		for( int i =0; i < len; i++) {  // num 배열에 temp 배열의 요소들이 그대로 복사된다.
			num[i] = temp[i];   // 배열의 요소들이 거꾸로 된 상태가 된다.
		}
		
		System.out.println("\n교환 후 배열 요소 값");
		for( int i = 0; i < len; i++) {
			System.out.println(num[i] + "\t");
		}
		
		
	}

}
