package study_0526;

import java.util.ArrayList;

public class Find_primenumber {

/* 오늘의 과제 : 자연수 중에서 20번째 소수를 출력하라 

자연수 중에서 제일 작은 소수는 2다. 그리고 3,5,7... 이런방식으로 자연수의 소수는 무한하다.
따라서 자연수에서 20번째 소수도 반드시 존재한다.

구현방법
1. 자연수 2부터 소수인지를 판별한다. (각 자연수의 약수의 개수를 구한다.)
2. 소수이면 소수의 순서를 기록한다.
3. 순서가 20이면 그 소수를 출력한후 종료한다.
4. 순서가 20이 아니면 자연수를 1 증가 시킨 후 1번 과정을 반복한다.

 */
	public static void main(String[] args) {    //while...for...if
		// TODO Auto-generated method stub

		int num = 2;
		int order = 0;
		
		
		
		while(order < 20) {
			
			ArrayList<Integer> arr = new ArrayList<>();
			
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					arr.add(i);
				}
			}
			
			if(arr.size() == 2) {
				order++;
			}
			num++;
		}
		System.out.println(num-1);
	}
}





/*
 
 	  int num = 2;
      int count;
      int order = 0;
      
      while(true) {
         count = 0;   // count는 소수를 확인하기 위한 변수이므로 반복문이 다시 시작될 때 0으로 초기화 해줘야 한다.
         for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
               count++;
            } 
         }
         
         if(count == 2) {
            order++;
            if(order == 20) {
               System.out.println(num);
               break;
            }
         }
      num++;
      }
 */

