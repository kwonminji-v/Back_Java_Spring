package jungsuk_0619;

class MyData12 {
	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

	synchronized void bcd() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

	void cde() {
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + " 번 째");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}

public class Ex5_Thread동기화key값 {

	public static void main(String[] args) {
		// # 공유 객체
		MyData12 myData12 = new MyData12();

		System.out.println("Thread1 : abc() 메서드 실행");
		new Thread() {
			public void run() {
				MyData12.abc();
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				MyData12.bcd();
			}
		}.start();
		
		new Thread() {
			public void run() {
				MyData12.cde();
			}
		}.start();
	}
}
