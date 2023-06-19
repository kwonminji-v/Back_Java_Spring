package study_0619;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Tic1 extends JFrame {
	private static final long serialVersionUID = 1L;	// 객체 직렬화
	JLabel title = new JLabel("Tic1 | ");	// 라벨 인스턴스 생성
	JLabel dispCurrentPlayer = new JLabel("Player 0");
	// 현재 플레이어 표시해주는 라벨 인스턴스
	private int score1 = 0;
	private int score2 = 0;	// 각 플레이어의 스코어를 표시해 줄 score 변수
	JLabel scoreLabel = new JLabel(" | " + score1 + " : " + score2);
	// 스코어 라벨 인스턴스 생성, score 변수 text로
	JButton startNewGame = new JButton("새 게임 시작");
	// 게임 다시 시작하게 해 줄 버튼 인스턴스 생성
	JPanel titleBar = new JPanel();	// 각종 JLabel이 들어갈 JPanel 인스턴스 생성
	JPanel nineRoom = new JPanel();	// 버튼이 들어갈 패널 인스턴스 생성
	private final int START_PLAYER = 1;	// 스타트 플레이어를 int형 상수 1로 선언
	private boolean isGameEnd = false;
	// 게임 종료 시킬 대 사용할 boolean 타입 변수
	TicTacToeCore ttt = new TicTacToeCore(START_PLAYER);
	
	public Tic1() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.drawWindow();
		this.setVisible(true);
	}
	public void drawWindow() {
		titleBar.add(title);	titleBar.add(dispCurrentPlayer);
		titleBar.add(scoreLabel);	titleBar.add(startNewGame);
		// JPanel의 인스턴스 titleBar에 각종 JLabel 인스턴스 추가
		dispCurrentPlayer.setText("Player " + START_PLAYER);
		// 해당 인스턴스에 text 세팅
		add(titleBar, BorderLayout.NORTH);
		// JFrame에 titleBar 인스턴스 추가하고 상단에 배치
		nineRoom.setLayout(new GridLayout(3, 3));	// nineRoom 인스턴스는 3x3 크기의 레이아웃 사용
		for(int i = 0; i < 9; i++) {
			JButton tempButton = new JButton("");
			tempButton.setFont(new Font("Impact", Font.PLAIN, 22));
			nineRoom.add(tempButton);
		}
		add(nineRoom, BorderLayout.CENTER);	// nineRoom 패널을 프레임 중앙에 추가
		MouseListener ml = new MouseAdapter() {
			// 마우스 어댑터의 무명 객체를 ml에 대입
			public void mousePressed(MouseEvent e) {
				JButton temButton = (JButton)e.getComponent();	// 이벤트의 컴포넌트 tempButton으로 다운 캐스팅
				if(isGameEnd) { return; } // isGameEnd가 true면 이벤트 종료
				if(temButton.getText().equals("O") || temButton.getText().equals("X")) {
					JOptionPane.showMessageDialog(nineRoom, "이미 둔 곳이다.");
					return;	// 해당 버튼이 이미 O나 X의 문자열을 가지고 있으면 나인룸패널에
							// 해당 텍스트를 가진 메세지 다이얼로그 출력
				} else if(ttt.getCurrentPlayerNum() == 1) {
					// O나 X가 아니고 해당 메소드의 리턴값이 1이면
					temButton.setText("O");	// 해당 버튼에 O 문자열 세팅
					dispCurrentPlayer.setText("Player " + 1);
					// 해당 패널에 Player 1 문자열 텍스트 세팅
				} else {
					temButton.setText("X");
					dispCurrentPlayer.setText("Player " + 1);
				}
				ttt.changeTurn();
				System.out.println("(" + e.getX() + ", " + e.getY() + ")");
				// 해당 이벤트가 발생한 x, y 좌표 출력
				int[][] ticArr = new int[3][3];
				// 3x3 9칸 짜리 int형 2차원 배열 변수 ticArr 생성
				for(int i = 0; i < ticArr.length; i++) {
					// ticArr[row]의 길이 : 3번 반복
					for(int j = 0; j < ticArr[0].length; j++) {
						// ticArr[0]의 길이(column) : 3번 반복
						String pl = ((JButton)nineRoom.getComponent(j + i * 3)).getText();
						// nineRoom에 j + (i * 3) 번째로 들어간 컴포넌트의 문자열 값을 pl에 대입 0 ~ 8
						if(pl.equals("O")) {
							ticArr[i][j] = 1;
						}
						else if(pl.equals("X")) {
							ticArr[i][j] = 2;
						}
						else {
							ticArr[i][j] = 0;
						}
					}
				}
				int result = ttt.inputCurrentStage(ticArr);
				System.out.println("result : " + result);
				// 해당 메소드의 인자로 ticArr 배열 사용하여 result로 값 반환받고 출력함
				if(result == 1 || result == 2) {
					// result가 1이나 2면 nineRoom 패널에 해당 메시지 다이얼로그 출력
					JOptionPane.showMessageDialog(nineRoom, "플레이어" + result + "의 승리입니다.");
					if(result == 1) { score1++; }
					// result가 1이면 score1에 1을 더함
					else { score2++; }	// 아니면 score2에 1을 더함
					scoreLabel.setText(" | " + score1 + " : " + score2);
					// 스코어 라벨 텍스트를 다시 세팅함
					isGameEnd = true;	// 해당 변수 true로 변경 초기값 false
				} else if(result == 99) {
					JOptionPane.showMessageDialog(nineRoom, "비겼습니다");
					isGameEnd = true;
				}
			}
		};
		// nineRoom 패널에 해당 메시지 다이얼로그 출력 후 변수 true로 변경
		for(Component c : nineRoom.getComponents()) {
			// 컴포넌트 c 인스턴스 생성 후 nineRoom의 컴포넌트들을 순서대로 대입
			c.addMouseListener(ml); // 해당 컴포넌트를 마우스 리스너 ml에 연결
		}
		startNewGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	// startNewGame에 액션리스너 연결
				ttt.resetGame(START_PLAYER);
				// START_PLAYER를 인자로 ttt 레퍼런스의 resetGame 메소드 호출
				isGameEnd = false;
				
				for(int i = 0; i < nineRoom.getComponents().length; i++) {
					((JButton)nineRoom.getComponent(i)).setText("");
				}	// nineRoom에 들어있는 컴포넌트들(JButton 9개)의 텍스트 초기화
			}
		});
	}
	public static void main(String[] args) {
		// 여러 이벤트가 동시에 충돌하는 것을 막기 위한 invokeLater 메소드
		SwingUtilities.invokeLater(new Thread() {
			public void run() {
				new Tic1();
			}
		});
		
		
	}
}
