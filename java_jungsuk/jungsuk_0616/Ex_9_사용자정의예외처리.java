package jungsuk_0616;

//# 점수가 음수인 경우 예외발생

class MinusException extends Exception {
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}

// # 점수가 100점을 초과하는 경우 예외 발생
class OverException extends Exception {
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

class Score {
	//checkScore의 메서드는 만약에 입력된 점수 값이 음수와 100이상이면 예외를 발생 그 외의 값이면 정상적인 값이라고 출력해주는 메서드입니다.
	void checkScore(int score) throws MinusException, OverException  {
		if (score < 0 ) {
			throw new MinusException("예외 발생 : 점수가 음수값이 입력되었습니다."); //예외를 발생시켜라!
			//위 문장만 적으면 에러가 발생하며 빨간 줄이 그어지는데,  예외가 throw로 인해 반드시 발생할텐데
			//Exception은 일반예외이기 때문에 반드시 예외처리를 해줄 의무가 생기기 때문에 
			//try-catch를 직접 작성해주거나 throws MinusException을 상단에 작성해주어야 합니다.
		} 
		else if (score > 100) {
			throw new OverException("예외 발생 : 점수가 100점 초과된 숫자가 입력되었습니다.");
		}
			else 
				System.out.println("정상적인 값입니다.");
		
	}
}


	public class Ex_9_사용자정의예외처리 {

		public static void main(String[] args) {
			Score a = new Score();
			try {
				a.checkScore(85);
				a.checkScore(150);
			} catch (MinusException | OverException e) {
				//↓ 아래의 e.printStackTrace();를 호출하면, 어떤 값이 입력되든 checkScore 메서드 내에 있는 if절로 인해 메세지가 출력됩니다.
				//e.printStackTrace();
				
				//각각의 throw된 예외의 경우 마다 String 타입으로 메세지를 인자로 입력 해두었기 때문에
				//↓ e.getMessage();로 예외의 경우마다 각 메세지를 출력할 수 있습니다.
				System.out.println(e.getMessage());
			}
		}
	}

