package jungsuk_0619;


//2개의 Thread가 참조하고 있는 공유객체 (=MyData)
class MyData {
	int data = 3;
	
	public  void plusData() { 
	//this 를 사용하여 블록 동기화를 진행하였음 synchronized 블록이 전부 종료되고 난 후 2번째 thread가 진행 
		synchronized (this) {
	//자신의 데이터를 가지고와서 그 데이터에 1을 더한 후 그 값을 data에 저장한다.
		int mydata = data;      // -> 1. 값 읽기 : 3 / /데이터를 바로 가져와 2초 뒤 결과값을 저장
		try { Thread.sleep(2000);} //-> 2초 기다리기
		catch (InterruptedException e) { }
		data = mydata + 1; //-> 1 더해주기 4!
		}
	}
}

class plusThread extends Thread {
	// ↓ plusThread의 필드 범위
	// myData라는 객체가 아래의 필드안에 들어가게 됩니다. 이 후 바로 Thread1의 이름만 정하고 start를 진행
	MyData myData;
	
	//myData라는 객체를 인자로 전달하여, 자기 필드에 입력 후 myData를 이용하여 plusData() 를 호출합니다.
	public plusThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + " 실행 결과 : " + myData.data );
	}
}


public class Ex4_동기화_synchronized {

	public static void main(String[] args) {
		
			//myData 객체를 생성 / 이 때, myData의 값은 3을 가지고 있습니다.
			MyData myData = new MyData();  //공유객체 생성 (MyData가 생성됨) 
			
			//#plusThread1 를 만들면서 myData라는 객체를 해당 Thread에 넣어주었습니다.
			//그럼 상단의 plusThread 필드 안에
			Thread plusThread1 = new plusThread(myData);
			plusThread1.setName("plusThread1");
			plusThread1.start();
			// start()가 실행되면 plusThread의  run() 이 실행되며, run() 에서 plusData()가 호출됩니다.
			//해당 Thread가 실행되면 값 읽기가 시작되고 2초의 대기 상태를 갖게 됩니다.
			//이 후 아래의 try-catch문으로 1초 뒤에 바로 두번째 Thread가 start 하게 됩니다.
				try { Thread.sleep(1000); } catch (InterruptedException e) {  }
				
				
			//#plusThread2
				Thread plusThread2 = new plusThread(myData);
				plusThread2.setName("plusThread2");
				plusThread2.start();
			// 마찬가지로 값을 읽어오고, 2초 대기 후 +1이 진행됩니다.
					
	}

}
