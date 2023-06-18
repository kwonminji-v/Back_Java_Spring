package jungsuk_0616;




public class Ex_9_2_Thraded_extends  extends Thread{
	
	public void run() {
		
		String [] strArray = new String[] {"하나", "둘" , "셋", "넷", "다섯"};
		try {
			Thread.sleep(100); //자막이 약간 늦게 출력되게 하기 위해 Thread.sleep을 추가
		} catch (InterruptedException e) {
			
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println( " ( 자막은 ) "  + " "+   strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
	
	class  VideoFileThread extends Thread {
			public void run() {
				
				int [] intArray = new int[] {1,2,3,4,5};
				
				for (int i = 0; i < intArray.length; i++) {
					System.out.print("(비디오 화면 )" + " "+ intArray[i] + "- ");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
				}
				
				
			}
	}

	public static void main(String[] args) {
			Ex_9_2_Thraded_extends smiFileThread = new Ex_9_2_Thraded_extends();
			VideoFileThread videoFileThread = new Ex_9_2_Thraded_extends().new VideoFileThread();
			smiFileThread.start();
			videoFileThread.start();
			
			}

}
