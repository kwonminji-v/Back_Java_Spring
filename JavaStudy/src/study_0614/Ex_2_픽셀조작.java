package study_0614;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex_2_픽셀조작 extends JFrame {

	
	//한 번의 키 조작으로 이동하는 거리(픽셀)
	private final int FLYING_UNIT = 10;
	//이동할 타켓의 문자열
	private JLabel la = new JLabel("keyboard");
	
	public Ex_2_픽셀조작() {
		setTitle("상하좌우 키를 이용하여 텍스트 움직이기");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//컨테이너 배치관리자 삭제
		c.setLayout(null);
		//JFrame 객체에 마우스 이벤트 설정
		c.addKeyListener(new MyKeyListener());
	//마이키리스너 클래스의 인스턴스를 생성하여 제이레이블인 la객체의 속성을 변경하는 메소드
		la.setSize(100,20);
		la.setLocation(50,50);
		c.add(la);
		setSize(500,500);
		setVisible(true);
		//key event포커스를 받을 컴포넌트가 여러개 일때 우선순위 지정
		// 키 이벤트는 포커스가 위치해 있어야발생함
		c.setFocusable(true);
	}
	//keylistener 구현, keyadater 로 받았기에 다흔 메소드는 적지 않아도 됨
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			//	입력된 키의 코드를 알아낸다
			int keyCode = e.getKeyCode();
			switch (keyCode) {
			//flying_unit 은 la 가 움직이는 폭
			//창의 최 상단 왼쪽의 시작은 0,0
			
			//x축은 오른쪽으로 갈수록 값이 커지고 왼쪽으로 갈수록 값이 작아짐
			//y축은 아래로 갈수록 값이 커지고 위로 갈수록 값이 작아짐
			case KeyEvent.VK_UP:
			la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
			break;
			
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
				break; //아래로 이동할 경우 Y 좌표의 값이 작아지도록 이동하는것
				
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - FLYING_UNIT, la.getY() );
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + FLYING_UNIT, la.getY() );
				break;
			}
		}
	}
	public static void main(String[] args) {
		new Ex_2_픽셀조작();
	}
}
