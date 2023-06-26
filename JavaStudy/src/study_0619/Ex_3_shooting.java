package study_0619;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex_3_shooting extends JFrame { // 프레임 상속

	public Ex_3_shooting() {

		setTitle("사격 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 프레임설정 
		GamePanel p = new GamePanel(); // 패널상속받는 클래스 GamePanel의 객체생성
		setContentPane(p);
		setSize(500, 500); // 콘텐츠팬 설정 및 사이즈설정
		setResizable(false);
		setVisible(true);
		p.startGame(); // 크기조절불가, 보이기, 해당 메소드실행
	}

	public static void main(String[] args) {
		new Ex_3_shooting();
	} // 생성자 호출

	class GamePanel extends JPanel { // 패널 상속 I
		TargetThread targetThread = null;
		JLabel baseLabel = new JLabel();
		JLabel bulletLabel = new JLabel();
		JLabel targetLabel; // 여러 라벨 선언, 객체 생성

		public GamePanel() {
			setLayout(null);
			baseLabel.setSize(40, 40);
			baseLabel.setOpaque(true);
			baseLabel.setBackground(Color.BLACK);
			// 배경색 검정 // 배치관리자없음, 사이즈, 불투명
			ImageIcon img = new ImageIcon // 절대경로의 파일 이미지아이콘 객체로 생성
			("chicken. jpg");
			targetLabel = new JLabel(img); // 1mg를 라벨객체에 담아 targetLabe]에 대입
			targetLabel.setSize(img.getIconWidth(), img.getIconWidth());
			// 이미지의 크기를 사이즈로 사용
			bulletLabel.setSize(10, 10);
			bulletLabel.setOpaque(true); // bulletLabel 사이즈설정, 불투명
			bulletLabel.setBackground(Color.RED);
			add(baseLabel);
			add(targetLabel);
			add(bulletLabel);
		} // 배경색 빨강, 각종 라벨들 패널에 추개

		public void startGame() {// 게임시작 메소드
			baseLabel.setLocation(this.getWidth() / 2 - 20, this.getHeight() - 40);
			bulletLabel.setLocation(this.getWidth() / 2 - 5, this.getHeight() - 50);
			targetLabel.setLocation(0, 0);
			targetThread = new TargetThread(targetLabel);
			targetThread.start();
			baseLabel.requestFocus();
			// 타켓스레드 객체 생성 및 스레드 실행, 베이스 라벨에 포커스 요구
			baseLabel.addKeyListener(new KeyAdapter() {
				// 베이스 라벨에 키 리스너 추가 어댑터 사용, 무명클래스
				BulletThread bulletThread = null; // 불렛스레드 래퍼런스타입 변수 생성

				public void keyPressed(KeyEvent e) {
					if (e.getKeyChar() == '\n') {
						if (bulletThread == null || !bulletThread.isAlive()) {
							// 스레드객체가 비었거나 스레드가 죽었을때
							bulletThread = new BulletThread(bulletLabel, targetLabel, targetThread);
							bulletThread.start();
						}
					}
				}
			});
		}

		class TargetThread extends Thread {
			JComponent target;

			public TargetThread(JComponent target) {
				this.target = target;
				target.setLocation(0, 0);
				target.getParent().repaint();
			}

			public void run() {
				while (true) {
					int x = target.getX() + 5;
					int y = target.getY();
					if (x > GamePanel.this.getWidth())
						target.setLocation(0, 0);
					else
						target.setLocation(x, y);
					try {
						sleep(20);
					} catch (InterruptedException e) {
					}
				}
			}
		}

		class BulletThread extends Thread {
			JComponent bullet, target;
			Thread targetThread;

			public BulletThread(JComponent bullet, JComponent target, Thread targetThread) {
				this.bullet = bullet;
				this.target = target;
				this.targetThread = targetThread;
			}

			public void run() {
				while (true) {
					if (hit()) {
						targetThread.interrupt();
						bullet.setLocation(bullet.getParent().getWidth() / 2 - 5, bullet.getParent().getHeight() - 50);
						return;
					} else {
						int x = bullet.getX();
						int y = bullet.getY() - 5;
						if (y < 0) {
							bullet.setLocation(bullet.getParent().getWidth() / 2 - 5,
									bullet.getParent().getHeight() - 50);
							return;
						}
						bullet.setLocation(x, y);
					}
					try {
						sleep(20);
					} catch (InterruptedException e) {
					}
				}
			}

			private boolean hit() {
				if (targetContains(bullet.getX() + bullet.getWidth() - 1, bullet.getY())
						|| targetContains(bullet.getX() + bullet.getWidth() - 1, bullet.getY() + bullet.getHeight() - 1)
						|| targetContains(bullet.getX(), bullet.getY() + bullet.getHeight() - 1))
					return true;
				else
					return false;
			}

			private boolean targetContains(int x, int y) {
				if (((target.getX() <= x) && (target.getX() + target.getWidth() - 1 >= x))
						&& ((target.getY() <= y) && (target.getY() + target.getHeight() - 1 >= y)))
					return true;
				else
					return false;
			}
		}
	}
}
