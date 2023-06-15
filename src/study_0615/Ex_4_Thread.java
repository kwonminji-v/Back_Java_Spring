package study_0615;

class MyThread extends Thread {
    public void run() {
        for (int i=10; i>=0; i--)
            System.out.println(i + " ");
    }
}
//Thread 클래스는 java.lang 패키지 안에 들어 있어 import할 필요 없음
//MyThread 클래스는 하나의 메소드 run() 만을 가지고 있음
//run()은 스레드가 시작하면 자바 런타임 시스템에 의해 호출
//스레드가 실행하는 모든 작업은 run() 메소드 안에 있어야 함
//현재는 단순히 10~0 까지 출력

public class Ex_4_Thread {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}
//스레드를 실행시키면 Thread에서 파생된 클래스 Thread의 인스턴스를 실행한 후 start()
//start() 호출해야만 스레드 실행됨