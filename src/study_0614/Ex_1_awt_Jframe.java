package study_0614;

import java.awt.Color;
//버튼 생성, 배경 색상과 , 배치관리자 즉 ) layout 순서
//버튼 만드는 방법 2가지
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex_1_awt_Jframe extends JFrame {
			public Ex_1_awt_Jframe() {
				//이름과 JFrame 창 닫기 시 프로그램이 종료되는 설정 입력
				setTitle("ContentPane과 JFrame");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//컨테이너 객체를 생성하고
				Container contentPane = getContentPane();
				
				//컨테이너 객체의 색상과, 컨테이너 내부 객체의 배열 방식 지정
				contentPane.setBackground(Color.ORANGE);
				
				//FlowLayout : 컴포넌트를 워드프로세서와 같은 방식, 즉 왼쪽에서 오른쪽으로 배치한다.
				contentPane.setLayout(new FlowLayout());
				
				//# 버튼 추가하는 방법 1번
				JButton btn = new JButton("Action");
				JButton btn1 = new JButton("Action11");
				JButton btn2 = new JButton("Action22");
				contentPane.add(btn);
				contentPane.add(btn1);
				contentPane.add(btn2);
				
				//#버튼 추가하는 방법 2번
				//JFrame 객체에 JButton 객체를 추가한다, 버튼에 출력할 "문구"
				contentPane.add(new JButton("OK"));
				
				//new JButton("OK")는 JButton 클래스의 새로운 인스턴스를 생성
				//JButton 객체는 contentPane에 추가될 자식 요소가됩니다.
				contentPane.add(new JButton("Cancel"));
				contentPane.add(new JButton("Ignore"));
				
				//JFraome 객체의 크기 및 전시 여부를 설정
				setSize(300,150);
				setVisible(true);
			}
			

	public static void main(String[] args) {
				new Ex_1_awt_Jframe();
	}
	//Gui awt swing 이벤트
}

/* 
컨테이너와 컴포넌트의 포함관계
(1) 최상위 컨테이너 : 다른 컨테이너에 속하지 않고 독립적으로 출력 가능한 컨테이너 (JFrame, JApplet, JDialog, JWindow)
(2) 컨테이너 : 다른 컨테이너에 포함될 수 있고, 컴포넌트를 포함할 수 있다 (JPanel 등)
(3) 컴포넌트 : 컨테이너에 포함되어야 화면에 출력 가능 (JButton, JLabel, JTextField 등)
 */
