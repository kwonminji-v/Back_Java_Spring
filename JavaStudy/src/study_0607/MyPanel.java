package study_0607;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//MyPanel 클래스는 JPanel 클래스를 상속 받아 JPanel의 기능을 사용할 수 있다.
//ActionListener는 인터페이스를 구현해주준다.

public class MyPanel extends JPanel implements ActionListener {
    JButton[][] buttons = new JButton[3][3];
    //-> 2차원 배열을 이용하여 메모리 공간을 만들어주었다.
    private char turn = 'X';
    //-> 접근제어자를 private로 설정하여 외부에서 해당 데이터에 접근이 불가능 하도록 초기화 해주었다.

    //MyPanel은 생성자 이고, 처음에 해당 코드가 실행될 때 보여지는 ui에 대한 설정들이 작성되어있다.
    //2차원 배열로 초기화된 buttons를 이중 반복문을 사용하여 3 * 3의 그리드를 생성하였다.
    //Font f로 font 객체 f를 생성하고 , 글씨체와 글씨 크기를 설정해주었다.
    public MyPanel() {
        setLayout(new GridLayout(3, 3, 5, 5));
        Font f = new Font("Dialog", Font.BOLD, 50);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton(" ");
                buttons[i][j].setFont(f);
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }
    }
   
    //
    @Override
    public void actionPerformed(ActionEvent e) {
    	//actionPerformed는 ActionListener에 포함된 내장메서드로 Override로 다른 기능으로 변경하여 사용 되었다.
    	//아래 이중 for문을 사용하여 각 버튼의 이벤트 리스너로 현재 객체인 this를 등록하여 이벤트 처리가 가능하도록 합니다.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ")) {
                    buttons[i][j].setText(String.valueOf(turn));
                    
         
                    if (checkWin(String.valueOf(turn), i, j)) {
                        System.out.println(turn + "가 이겼음!");
                        // Game over, disable all buttons
                        for (int x = 0; x < 3; x++)
                            for (int y = 0; y < 3; y++)
                                buttons[x][y].setEnabled(false);
                        return;
                    }
                    // Switch turns
                    turn = (turn == 'X') ? 'O' : 'X';
                }
            }
        }
        
// if 조건문
        if (isDraw()) {
            System.out.println("비겼습니다.");
            // Game over, disable all buttons
            for (int x = 0; x < 3; x++)
                for (int y = 0; y < 3; y++)
                    buttons[x][y].setEnabled(false);
        }
    }

    public boolean isDraw() {
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 3; ++col) {
                if (buttons[row][col].getText().equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    //boolean 타입의 형태인 checkWin 메서드를 생성 후 String mark, int r, int c를 매개변수로 받아 buttons의 인덱스 넘버로 전달해준다.
    public boolean checkWin(String mark, int r, int c) {
        return (buttons[r][0].getText().equals(mark) && buttons[r][1].getText().equals(mark) && buttons[r][2].getText().equals(mark)
                || buttons[0][c].getText().equals(mark) && buttons[1][c].getText().equals(mark) && buttons[2][c].getText().equals(mark)
                || (r == c && buttons[0][0].getText().equals(mark) && buttons[1][1].getText().equals(mark) && buttons[2][2].getText().equals(mark))
                || (r + c == 2 && buttons[0][2].getText().equals(mark) && buttons[1][1].getText().equals(mark) && buttons[2][0].getText().equals(mark)));
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MyPanel());
        f.setSize(300, 300);
        f.setVisible(true);
    }
}

//1.비긴 상태 확인 로직 변경: 각 턴에서 '승리' 조건을 먼저 확인하고, 
// 승리하지 않은 경우에만 isDraw()를 호출합니다.
//2.게임 종료 처리: 승리나 무승부 상황이 확인되면 모든 버튼을 비활성화
//3.턴 교체 로직 변경: 기존 코드에서는 버튼을 클릭할 때마다 턴이 바뀌었습니다
//4.승리 조건 체크 로직 개선: 기존 코드에서는 대각선의 승리 조건이 모든 대각선에 대해 동일하게 적용되었음
//  대각선의 승리 조건을 보드의 위치에 따라 동적으로 확인..아직 미구현