package study_0530;

public class Arrray_tes_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [ ] num;
		num = new int[2];
		
		num[0] = 1;
		num[1] = 2;
		
		//num[2] = 3; 실행 시 ArrayIndexOutofBoundsExeption 발생
//		num[1] = 5.6f;
			 System.out.println("num 배열의 개수 : " + num.length);
			 
			 System.out.println("num[0] = " + num[0]);
			 System.out.println("num[1] = " + num[1]);
			 System.out.println();
		
			 
			 for(int i = 0; i < num.length; i++) {
				 System.out.println("num : " + num[i]);
			 }
		
	}

}
