package jungsuk_0619;


public class Ex1_Thread메서드들 {

	public static void main(String[] args) {
		
		//#1. 객체 가져오기 + Thread 수 출력해보기
		//currentThread() , activeCount()
		System.out.println(" #1. 객체 가져오기(currentThread()) + Thread 수 출력해보기(activeCount())");
		Thread currentThread = Thread.currentThread();
		System.out.println("현재 쓰레드 이름 = " + currentThread.getName());
		System.out.println("현재 쓰레드 수 = " + Thread.activeCount());

		
		//#2. Thread 이름 자동 지정 
		System.out.println();
		System.out.println(" #2. 3개의 Thread객체 생성 /  Thread 이름 자동 설정");
		for (int i = 0; i < 3; i ++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		//#3. Thread 이름 직접 설정
		System.out.println();
		System.out.println(" #3. Thread 이름 직접 설정");
		for(int i =0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 Thread (setName()으로 설정)");
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println();
		//#4. Thread 이름 자동 설정
		System.out.println("Thread 이름 자동 지정");
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}// 자동 지정한 건 0,1,2만 쓰였지만 중간에 thread이름을 직접 설정해줄 때 thread가 생성되었기 때문에
	     //thread-3,4,5가 아닌 그 이후 번호인 6,7,8번호가 넘버링 됩니다.
		
		//#5. Thread 수
		//한번이라도 Thread가 추가되면 이름이 겹치지 않게 마지막 thread count 개수보다 올려줍니다.
		System.out.println("현재 active되고 있는 Thread 수 = " + Thread.activeCount());
	}
}
