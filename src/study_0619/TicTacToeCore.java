package study_0619;

public class TicTacToeCore {
	private int currentPlayerNum;	// 현재 플레이어를 표기하는 int형 변수
	private boolean isGameOver = false;
	private int[][] endStage;
	private int currentTurn = 1;	// 현재 턴에 해당하는 ㅂ ㅕㄴ수
	
	public TicTacToeCore(int currentPlayerNum) {
		this.currentPlayerNum = currentPlayerNum;
	}
	
	// currentPlayerNum이 1이면 2로 2면 1로 변경시켜주는 메소드
	public void changeTurn() {
		currentPlayerNum = (currentPlayerNum == 1) ? 2 : 1;
	}
	
	public int getCurrentPlayerNum() {
		return currentPlayerNum;
	}
	
	public void setCurrentPlayerNum(int currentPlayerNum) {
		this.currentPlayerNum = currentPlayerNum; 
	}
	
	public int[][] getEndStage() {
		return endStage;
	}
	
	// @param currentStage : return 값에 따른 실행 루틴을 주석 처리해서 알려줌..
	// @return -99 : 게임 종료됨, 1 : 플레이어 1 승리, 2 : 플레이어 2 승리, 0 : 진행 중, 99 : 비김(draw)
	
	private boolean isThisPlayerWin(int playerNum, String rowFrag, String colFrag, String diagFrag1, String diagFrag2) {
		String p = String.valueOf(playerNum);
		// playerNum의 값을 문자열 p에 저장
		boolean result = false;	// boolean 타입 변수 선언 및 false로 초기화
		String[] arr = { rowFrag, colFrag, diagFrag1, diagFrag2 };
		
		// 인자 값들을 arr 배열에 대입
		for(int i = 0; i < arr.length; i++) {
			result = !arr[i].contains("0") && arr[i].equals(p + p + p);
			// arr[i]에 0이 포함되어 있지 않고 arr[i]의 값이 p + p + p 이면 true
			if(result)
				return result;	// result가 true면 즉시 리턴
		}
		return result;	// true가 끝까지 발생하지 않으면 여기서 return(false)
	}
	public int inputCurrentStage(int[][] currentStage) {
		// 해당 코드에선 원소가 0, 1, 2로 이루어진 ticArr을 인자로 받음
		if(isGameOver) { return -99; }	// 게임이 끝났다면 더 이상 진행하는 의미가 없으므로
		for(int i = 0; i < currentStage.length; i++) {
			// 매개변수로 쓰인 2차원 배열 currentStage의 row길이만큼 반복
			String rowStr = "";	String colStr = "";
			String diagStr1 = "";	String diagStr2 = "";
			
			// 각종 String 변수 초기화
			for(int j = 0; j < currentStage[i].length; j++) {
				// currentStage의 column 길이만큼 반복
				rowStr += (currentStage[i][j] + "");	// 행에 해당하는 비교
				colStr += (currentStage[j][i] + "");	// 열에 해당하는 비교
			}
			for(int j = 0; j < currentStage.length; j++) {
				// currentStage의 row 길이만큼 반복
				diagStr1 += currentStage[j][j];
				// 왼쪽 위에서 오른쪽 아래로 그어지는 대각선
				diagStr2 += currentStage[j][2 - j];
				// 오른쪽 위에서 왼쪽 아래로 그어지는 대각선
			}
			if(isThisPlayerWin(2, rowStr, colStr, diagStr1, diagStr2)) {
				
				// 해당 매개변수로 메소드 호출하여 받은 return 값이 true면 if문 실행
				isGameOver = true;
				endStage = currentStage;
				return 2; // 2 리턴, 플레이어 2 승리
			}
			else if(isThisPlayerWin(1, rowStr, colStr, diagStr1, diagStr2)) {
				
				isGameOver = true;
				endStage = currentStage;
				return 1;	// 1 리턴, 플레이어 1 승리
			}
			else if(currentTurn == 9) { return 99; }	
			// 현재 턴이 9턴이면 무승부
			else { continue; }	// 모두 아닐경우 계속
		}
		currentTurn++;	// currentTurn을 1 증가시키고
		return 0;	// 0을 리턴
	}
	public void resetGame(int currentPlayerNum) {
		this.isGameOver = false;
		this.currentPlayerNum = currentPlayerNum;
		this.endStage = null;
		this.currentTurn = 1;
	}
}
