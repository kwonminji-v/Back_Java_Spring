package study_0616;

public class Ex_2_HorseTest_스레드 {

   public static void main(String[] args) {

//      Thread t1 = new Thread(new Horse(1));
//      Thread t2 = new Thread(new Horse(2));
//      Thread t3 = new Thread(new Horse(3));
//      Thread t4 = new Thread(new Horse(4));
//      Thread t5 = new Thread(new Horse(5));
//      Thread t6 = new Thread(new Horse(6));
//      Thread t7 = new Thread(new Horse(7));
//      Thread t8 = new Thread(new Horse(8));
//      Thread t9 = new Thread(new Horse(9));
//      
//      t1.start();
//      t2.start();
//      t3.start();
//      t4.start();
//      t5.start();
//      t6.start();
//      t7.start();
//      t8.start();
//      t9.start();
      
      Thread[] t = new Thread[9];   // 객체 배열 생성
      
      for(int i = 0; i < t.length; i++) {      // 배열의 길이만큼 반복
         t[i] = new Thread(new Ex_1_쓰레드_스토리보드(i+1));
         // 해당 클래스의 인스턴스를 생성자로 하여 인스턴스 스레드 t[i] 생성
         t[i].start();   // t[i]의 스레드 실행
      }
      
      System.out.println("main() 종료...");
   }

}