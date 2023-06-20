package jungsuk_0619;



class DataBox1 {
	boolean isEmpty = true;  
	//isEmpty 변수는 데이터 상태를 나타내기 위한 플래그로 사용되는 변수입니다.
	//이름 그대로 "비어있는지"를 나타내기 위한 변수이며, 
	//true는 데이터가 비어있음을 의미하고, false는 데이터가 들어있음을 의미합니다.
	int data;

	// ↓ 데이터를 작성하려고 만들어진 메서드
	synchronized void inputData(int data) throws InterruptedException {
		// if문을 작성하여 inputData or outputData가 비워져 있는지를 확인 
		// 예를들어 inputData 메서드가 먼저 key를 가지고 있다는 가정하에 isEmpty가 true가 아니면 wait이 발생하는데
		// 현재 isEmpty의 초기값이 true인데 if절 안에 있는 !isEmpty는 false이기 때문에 wait()상태가 되지 않고else구문인 sysout문장이 실행하게 됨
		
		
		if(!isEmpty) { wait(); } isEmpty = false; //wait()이 되며 key를 반납
		this.data = data;
		System.out.println("입력데이터는 = " + data);
		notify(); // 상대편에서 실행된  wait() 을 깨웁니다.
	}

	// ↓ 데이터를 출력(읽어)하려고 만들어진 메서드
	// 만약 inputData가 key를 쟁취하는 경쟁에서 지게되어 outputData가 먼저 실행되더라도, isEmpty의 초깃값이 true인데, true이면 if 절 안의 wait()이 발생되며
	// 해당 메서드는 대기상태에 빠져 Runnable 상태인 inputData 메서드가 먼저 실행됨
	synchronized void outputData() throws InterruptedException {
		if(isEmpty) { wait(); } isEmpty = true;
		
		System.out.println("출력 데이터는 = " + data);
		notify();
	}
}


public class Ex9_waitNotify {

	public static void main(String[] args) {
			DataBox1 dataBox = new DataBox1();
			
			Thread t1 = new Thread() { //입력하는 데 필요한 Thread
				public void run() {
					for (int i = 0; i < 10; i++) {
						try {
							dataBox.inputData(i);
						} catch (InterruptedException e) {   }
					}
				}
			};
			
			//입력데이터와 출력데이터가 번갈아가면서 순차적으로 출력됨
			//wait() 메서드와 boolen으로 설정된 변수에 의해 각각의 thread가 일시정지 - runnable이 반복적으로 발생
			Thread t2 = new Thread() { //읽어오는데에 필요한 Thread
				public void run() {
					for (int i = 0; i < 10; i++) {
						try {
							dataBox.outputData();
						} catch (InterruptedException e) {  }
					}
				}
			};
			t1.start();         t2.start();
	}
}
