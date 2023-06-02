package study_0602;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Ex_9_Btn extends JFrame {
	
		Ex_9_Btn() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("대박");
			setLayout(new FlowLayout());
			Button btn1 = new Button("가위");
			Button btn2 = new Button("바위");
			Button btn3 = new Button("보");
			//버튼 추가
			add(btn1);
			add(btn2);
			add(btn3);
			
			btn1.setBackground(Color.CYAN);
			btn3.setBackground(Color.RED);
			btn2.setBackground(Color.BLUE);
			//btn2.setEnabled(false); -> 활성화되지 않는 키를 의미
			setBackground(Color.PINK);
			setForeground(Color.BLACK);
			setSize(200,200);
			setVisible(true);   //보여주는 값이 참으로 계속 보여줌
			
		}
		public static void main(String[] args) {
				new Ex_9_Btn();
		/* main() 메소드에서 Button1 클래스 생성
		 	Button1() 생성자가 실행되므로 windows창이 출력 */
		}
}
/*
AWT와 Swing 패키지 등 어떤 언어보다 강력한 GUI 라이브러리를 제공하며, GUI를 쉽게 구성할 수 있도록 해준다.

 */