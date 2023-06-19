package jungsuk_0619;


class MyThread extends Thread {
	public void run() {
		for (long i = 0; i < 1000000000; i++) {  } //단순히 시간을 지연하기 위한 용도의 for문
		System.out.println(getName() + " 우선순위 " + getPriority());
	}
}

public class Ex2_Thread우선순위 {

	public static void main(String[] args) {
			int CPUcount = Runtime.getRuntime().availableProcessors();
			System.out.println("사용 가능한 프로세서 수  = " +  CPUcount);
			
			//default 우선순위 : 우선순위 설정 없이 기본 순위로 출력
			for (int i = 0; i < 3; i++) {
				Thread thread = new MyThread(); //맨위의 MyThread class를 객체로 생성
				thread.start();
			}
			//순서가 절대로 보장되지 않고 CPU 스케줄링에 따라서 다른 결과값들이 출력될 수 있습니다.
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
			
			//우선 순위를 직접 지정한 후 Thread를 출력해보자
			for (int i = 0; i < 8; i++) {
				Thread thread = new MyThread();
				thread.setName( i + "번째 Thread");
				if ( i == 7)
					thread.setPriority(Thread.MAX_PRIORITY); 
				//7번만 우선순위를 10번으로 바꾸어주었습니다. 가장 많은 time slot을 가져가게 됩니다.
				thread.start();
			}
	}

}
