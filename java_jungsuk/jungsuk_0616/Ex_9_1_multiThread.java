package jungsuk_0616;


public class Ex_9_1_multiThread {

	public static void main(String[] args) {
		// (비디오 프레임 번호) 1 ~ 5 저장
		int [] intArray = new int[] {1,2,3,4,5};
		
		// (자막 번호 ) 하나 ~ 다섯 저장
		String [] strArray = new String[] {"하나", "둘", "셋", "넷", "다섯"};
		
		for (int i =0; i < intArray.length; i++) {  
			// 비디오 프레임의 배열에서 요소들을 하나씩 출력하였음 (비디오 프레임 번호) 1 ~ 5 출력
			System.out.println("(비디오 프레임) "  + intArray[i]) ;
			try { // 일반 예외처리로 한번 출력 될 때 sleep( ) 안의 시간만큼 지연 후 출력되도록 함
				Thread.sleep(400);
			} catch (InterruptedException e) {     }
		}
		
		for (int i = 0; i < strArray.length; i++) {  // (자막 번호 ) 하나 ~ 다섯 출력
			System.out.println(" (자막) " + strArray[i]);
			try {
				Thread.sleep(400);  //0.2초 (200ms) 동안 일시 정지 처리
			} catch (InterruptedException e) {   }
		}
	} 
}
