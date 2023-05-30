package study_0530;

public class HowtoUseArray_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array1 = new String[] { "자료1" , "자료2", "자료3", "자료4", "자료5", "자료6" };
				String data11  = array1[0];  /* 배열 내부 첫 번째 요소에 접근 */
				String data12 = array1[1];  /* 배열 내부 두번째 요소에 접근 */
				String data13 = array1[2];  /* 배열 내부 세번째 요소에 접근 */
				String data14 = array1[3];  /* 배열 내부 네번째 요소에 접근 */
				String data15 = array1[4];  /* 배열 내부 다섯번째 요소에 접근 */
				String data16  = array1[5];  /* 배열 내부 여섯번째 요소에 접근 */
				
				int length1 = array1.length;  // 배열의 길이
				
				/* 배열 생성 및 사용 방법[2] */
				
				String[] array2 =  {  "자료1" , "자료2", "자료3", "자료4", "자료5", "자료6"  };
					String data21 = array2[0];  /* 배열 내부 첫 번째 요소에 접근 */
					String data22  = array2[1];  /* 배열 내부 두 번째 요소에 접근 */
					String data23 = array2[2];  /* 배열 내부 세 번째 요소에 접근 */
					String data24 = array2[3];  /* 배열 내부 네 번째 요소에 접근 */
					String data25 = array2[4];  /* 배열 내부 다섯 번째 요소에 접근 */
					String data26  = array2[5];  /* 배열 내부 여섯 번째 요소에 접근 */
					
					int length2 = array2.length;
				
				String[] array3 = new String[5];
						array3[0] = "자료1";  /* 배열 내부 첫 번째 요소에 접근 */
						array3[1] = "자료2";   /* 배열 내부 두 번째 요소에 접근 */
						array3[2] = "자료3";   /* 배열 내부 세 번째 요소에 접근 */
						array3[3] = "자료4";   /* 배열 내부 네 번째 요소에 접근 */
						array3[4] = "자료5";   /* 배열 내부 다섯 번째 요소에 접근 */
						array3[5] = "자료6";   /* 배열 내부 여섯 번째 요소에 접근 */
						
						int length3 = array3.length; //배열의 길이
						
				//반복문을 이용한 배열 내부 요소 접근
						
					if (array1 != null) {
						for(int i = 0; i < array1.length; i++) {
							System.err.println((i + 1) + "번째 배열 값 = " + array1[i]);
						} 
					}
				
	}

}
