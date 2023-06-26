package jungsuk_0619;

public class Ex6_ThreadState {

	public static void main(String[] args) {

			//#. 쓰레드 상태를 출력하기 위해서 Thread안에 있는 State를  enum이라는 상수들로만 저장되어 있는
		   //지정된 상수 이외에는 저장할 수 없는 타입을 이용하여 state를 선언합니다.
		Thread.State state;
		
		//#1. 객체 생성 (NEW)
		Thread thread = new Thread();
		new Runnable() {
			public void run() {
				for (long i = 0; i < 10000000L; i++) {}
		}
	};
	//객체만 만들어 둔 상태에서 state를 출력하면 New단계입니다.
	state = thread.getState();
	System.out.println("선언만 한 NEW단계에서 state는 = " + state);  // NEW 단계
	
	//#2.  start() 이 후 Thread 시작 (RUNNABLE)
	thread.start();
	state = thread.getState();
	System.out.println("Ruunable한 후 thread state는 = " + state);
	
	
	//#3. Thraed 종료 (TERMINATED)
	try {
		thread.join();  
		// thread.join()은 thread에 CPU를 할당하고 join을 호출한 '나' 메인함수는 실행을 일시정지한다는 의미
	} catch (InterruptedException e) {
		// TODO: handle exception
	}
	state = thread.getState();
	System.out.println("쓰레드가 종료된 후의 thread의 state는 = " + state);
	}
}
