package jungsuk_0619;


//아래의 3개의 메서드는 같은 키를 사용하며 동기화하고 있기 때문에 같은 공간에 존재하며 하나의 key를 사용합니다.
//하나의 메서드가 쓰레드에서 실행되면 하나가 끝나면 하나가 출력됩니다. (총 9초가 걸림)
class MyData1 {
	//메서드 동기화 문법 (Key가 this로 고정되어 있음)
	synchronized void abc() {
		System.out.println("Thread1 : abc() 메서드 실행");
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			//위의 for문은 1초마다 한번씩 i sec가 출력되도록 하는 반복문
			try { Thread.sleep(1000); } catch (InterruptedException e) { }
		}
	}

	synchronized void bcd() {
		System.out.println("Thread2 : bcd() 메서드 실행");
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {	Thread.sleep(1000); } catch (InterruptedException e) { }
		}
	}

	//블록 동기화 문법
	void cde() {
		synchronized (this) {
			System.out.println("Thread3 : cde() 메서드 실행");
			for (int i = 0; i < 3; i++) {
				System.out.println(i + " 번 째");
				try {Thread.sleep(1000); } catch (InterruptedException e) { 	}
			}
		}
	}
}

public class Ex5_Thread동기화key값 {

	public static void main(String[] args) {
		// # 공유 객체생성
		MyData1 myData1 = new MyData1();

		//3개의 쓰레드가 각각의 메서드를 호출합니다.
		
		new Thread() {
			public void run() {
				myData1.abc();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData1.bcd();
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				myData1.cde();
			}
		}.start();
	}
}
