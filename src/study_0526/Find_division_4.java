package study_0526;

public class Find_division_4 {

/* 148의 약수를  구하라 / 약수 : 어떤수를 
 
 먼저 소스로 구현하기 전에 약수의 개념에 대해 알아야한다.
 약수는 어떤 수를 나누어 떨어지게 하는 수다.
 4의 약수를 구하는 과정을 살펴보면 1에서 4 사이의 자연수가 4로 나누어 떨어지는지 
 확인해보면 된다. 그런데 4보다 큰 수는 4의 약수가 절대로 될 수 없다. 
 138까지 순차적으로 증가된다.
 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 148;
		
		for(int i=1; i <= num; i++) {
			if(num % i == 0){
			
			System.out.println(i + "는 " + num + "의 약수입니다.");
			}
		}
		
		

	}

}
