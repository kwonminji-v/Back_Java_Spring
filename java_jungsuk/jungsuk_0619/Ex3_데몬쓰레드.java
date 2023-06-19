package jungsuk_0619;


class MyThread1 extends Thread {
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "데몬 쓰레드" : "일반 쓰레드"));
		// isDaemon()은 Thread 클래스의 인스턴스 메서드로, 해당 쓰레드가 데몬 쓰레드인지 여부를 반환하는 역할
		
		for(int i = 0; i < 6; i++) { //0부터 5까지 1초의 인터벌을 두고, 자신의 이름을 호출합니다.
			System.out.println(getName() + " : " + i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {  }
		}
	}
}


public class Ex3_데몬쓰레드 {

	public static void main(String[] args) {
		
			//#1. 일반 (default) 쓰레드
		Thread thread1 = new MyThread1();
		thread1.setDaemon(false);
		thread1.setName("thread1");
		thread1.start();
		
		
		
		//#2. 데몬(Daemon) 쓰레드
		Thread thread2 = new MyThread1();
		thread2.setDaemon(true);
		//Daemon 쓰레드로 변경해주었음
		thread2.setName("thread2");
		thread2.start();
		//데몬 쓰레드는 "main쓰레드를 포함해서 모든 일반 쓰레드가 종료해야 종료됨"
		
		
		
		//#3. 3초 후 MainThread 종료하게 코드를 작성하였습니다. 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {  }
		System.out.println("Main thread 종료");
		//for문에 의해 아직 3,4,5초의 thread 실행이 남아있지만, main thread가 종료되며 함께 종료되었습니다.
	}

}
