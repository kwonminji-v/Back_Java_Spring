package study_0615;

public class Ex_2_Thread extends Thread {
			//run() 메서드 오버라이딩
	@Override
	public void run() {
		//스레드 실행 시 해당 출력문 무한 반복
		while (true)
			System.out.println("청기올려~!!");
	}
}





