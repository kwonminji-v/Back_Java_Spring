package jungsuk_0619;

public class Ex7_threadBlock {

	// 공유 객체를 생성 (mc라는 객체의 syncMethod를 호출합니다.)
	MyClass mc = new MyClass();

	Thread t1 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		};
	};

	Thread t2 = new Thread("thread2") {
		public void run() {
			mc.syncMethod();
		};
	};

	Thread t3 = new Thread("thread3") {
		public void run() {
			mc.syncMethod();
		};
	};

	void startAll() { 
		//위에 작성된  3개의 필드인 Thread가 모두  동시 시작
		t1.start();
		t2.start();
		t3.start();
	}

	class MyClass {
		synchronized void syncMethod() {
			try {Thread.sleep(2000); } catch (InterruptedException e) { } //쓰레드 시작 준비시간
			System.out.println(" ===== " + Thread.currentThread().getName() + "=====");
			//각각의 thread들의 state값들을 호출하는 코드를 작성
			//start()를 하고 바로 getState()를 호출하면 
			System.out.println("thread1 -> " + t1.getState());
			System.out.println("thread2 -> " + t2.getState());
			System.out.println("thread3 -> " + t3.getState());
			for (long i = 0; i < 10000000L; i++) {
			}
		}
	}

	public static void main(String[] args) {
		//이 때는 thread의 갯수가 main 1개
			Ex7_threadBlock mbt = new Ex7_threadBlock(); 
			mbt.startAll();  //이 때는 3개의 thread가 모두 실행되며 thread의 갯수가 4개가 된다.
	}

}
