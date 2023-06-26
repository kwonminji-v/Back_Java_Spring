package study_0526;

public class WhileTest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while ()
	}

}

/* 
 1부터 자연수를 더한 값이 최초 1000이상이 되게 만드는 최초의 자연수 구하기
 구현과정 while문을 사용해본다.
 1. 1부터 자연수를 sum에 누적시킨다.
 2. sum의 값이 1000이상인지 확인한다.
 3. 1000 이상이 아니면 다시 자연수를 증가시킨 후 1번 과정을 반복한다.
 4. 1000이상이면 n의 값과 1에서 n까지의 합을 출력한다. 
 
 
 int n = 0;
 int sum =0;
 
 while(true) {
 sum += n;
 if( sum >= 1000 )
 		break;
 else
 n++;
 }
 
 
 System.out.println("1,000 이상이 되게 하는 최초의 n 값은 " + n)
 System.out.println(" n까지 더한 합은 " + sum)
 
 */
