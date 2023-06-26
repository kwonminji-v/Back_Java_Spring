package study_0526;

public class Sum_save {

/*
1. 1부터 홀수의 합을 저장한다. 
2. 홀수의 합이 1000이상인지를 체크한다.
3. 
4. 1000이상이 아니면 그 다음 홀수를 이용해서 다시 1번 과정을 반복한다.
 */
	public static void main(String[] args) {  //while..if
		// TODO Auto-generated method stub

		int num = 1;
		int sum = 0;
		while(true) {
			sum += num;
			if(sum >= 1000)
				break;
			else
				num +=  2; 
		}
		System.out.println("1에서 " + num + "까지의 홀수의 합은 " + sum);
	}

}
