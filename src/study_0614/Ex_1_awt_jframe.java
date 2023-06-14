package study_0614;



import java.awt.Color;
//버튼 생성, 배경 색상과 , 배치관리자 즉 ) layout 순서
//버튼 만드는 방법 2가지
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex_1_awt_jframe extends JFrame {
			public void Ex_1_awt_Jframe() {
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
				new Ex_1_awt_jframe();
	}
	//Gui awt swing 이벤트
}

/* 
컨테이너와 컴포넌트의 포함관계
(1) 최상위 컨테이너 : 다른 컨테이너에 속하지 않고 독립적으로 출력 가능한 컨테이너 (JFrame, JApplet, JDialog, JWindow)
(2) 컨테이너 : 다른 컨테이너에 포함될 수 있고, 컴포넌트를 포함할 수 있다 (JPanel 등)
(3) 컴포넌트 : 컨테이너에 포함되어야 화면에 출력 가능 (JButton, JLabel, JTextField 등)

이벤트 리스너란? 
이벤트를 처리하는 코드, 클래스로 작성 (ex. 엿듣고 있는 것)
이벤트 처리를 위해서는 이벤트 발생시킬 컴포넌트에 이벤트 리스너를 연결해야한다.
JDK에서 이벤트 리스너 작성을 위한 인터페이스 (interface) 제공
 - 개발자가 리스너 인터페이스의 추상 메서드 구현, 이벤트가 발생하면 자바 플랫폼은 리스너 인터페이스의 추상 메서드 호출
 
 ex ) ActionListener 인터페이스
 interface ActionListener {  아래 메서드를 개발자가 구현해야 한다.
 public void actionPerformed(ActionEvent e);   -> Action 이벤트 발생 시 호출된다.
 
 ex) MouseListener 인터페이스
 interface MouserListener { 아래의 5개의 메서드를 개발자가 구현해야 함
 
 container c = getContentPane()
 스윙에서는 컨텐트팬 (content pane)에만 컴포넌트를 부착할 수 있다.
 즉 , container c = getContentPane() 를 활용하면 JFrame의 컨테이너 들의 속성(메소드)를 여러 개 추가할 수 있다.
 
 ActionListener
 버튼을 클릭하거나 메뉴를 누르거나 텍스트 필드 등에서 Enter를 눌렀을 때
 발생하는 이벤트 리스너  .ActionListener는 인터페이스로 처리한다. 
 즉 , actinoPerformed(ActionEvent e) 맥션 리스너 이벤트가 발생했을 때 실질적으로 실현되는 메서드로 꼭 필요합니다.
 
 프레임 종료 버튼이 클릭될 때 프레임을 닫고 응용프로그램이 종료하도록 하는 방법
 Frame.setDefaultColseOperation(JFrame.EXIT_ON_CLOSE);
 응용 프로그램내에서 스스로 종료 - 언제 어디서나 무조건 종료 System.exit(0);
 
 프로그램 종료버튼(x)가 클릭됐을 때의 상황
 프레임을 종료하여 프레임 윈도우가 닫힘 
  - 프레임이 화면에서 보이지 않게 되고 응용 프로그램이 사라짐
  - 프레임이 보이지 않게 되지만 응용 프로그램이 종료한 것이 아님
  - 키보드나 마우스 입력을 받지 못함
  - 다시 setVisible(true)를 호추하면 보이게 되고 이전처럼 작동함
 */