package jungsuk_0619;


	//Without Wait Notify -> 순차적인 진행이 되지 않고 key 객체 경쟁에서 이긴 메서드가 출력됩니다.
class DataBox {
	//인스턴스 메서드들을 동기화 함 -> 둘다 동일하게 this라는 객체로 동기화 되었음
	int data;
	//여기서 key는 this 하나를 두개의 메서드가 같이 사용중
	//두 메서드가 key를 두고 경쟁해서 이기는 메서드만 계속 출력될거라 순차적으로 출력되지 않음
	synchronized void inputData(int data) throws InterruptedException {
		this.data = data;
		System.out.println("입력데이터는 = " + data);
	}

	synchronized void outputData() throws InterruptedException {
		System.out.println("출력 데이터는 = " + data);
	}
}


public class Ex8_Notify_All {

	public static void main(String[] args) {
		
			DataBox dataBox = new DataBox();
			
			Thread t1 = new Thread() { //input데이터만 출력하는  Thread
				public void run() {
					for (int i = 0; i < 10; i++) {
						try {
							dataBox.inputData(i); //-> dataBox라는 인스턴스를 같이 공유중
						} catch (InterruptedException e) {   }
					}
				}
			};
			
			Thread t2 = new Thread() { //output데이터만 출력하는 Thread
				public void run() {
					for (int i = 0; i < 10; i++) {
						try {
							dataBox.outputData(); //-> dataBox라는 인스턴스를 같이 공유중
						} catch (InterruptedException e) {  }
					}
				}
			};
			t1.start();         t2.start();
	}
}
