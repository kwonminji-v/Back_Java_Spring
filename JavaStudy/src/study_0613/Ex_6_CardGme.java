package study_0613;


public class Ex_6_CardGme {

	public static void main(String[] args) {
					//Deck 객체를 생성하고 Deck 기본생성자를 실행하면 ,for문을 활용해 카드 정보들이 저장된다.
		
					Ex_4_제네릭파라미터 deck = new Ex_4_제네릭파라미터();
					
					//객체를 활용해 shuffle 메서드를 실행한다, 랜덤으로 저장된 값들 중 하나를 획득함
					deck.shuffle();
					
					//카드를 획득하는 Player 객체를 생성
					Ex_5_Player p1 = new Ex_5_Player();
					Ex_5_Player p2 = new Ex_5_Player();
					
					//getCard 메서드를 실행해 덱에서 카드 정보를 ArrayList 객체에 저장한다.
					//getCard는 카드를 가져온다 (추출한다) getCard자체가 이미 메서드
					//getCard 안에 들어있는 매개변수는 뭐를 가리키는지 deck 객체가 있는 클래스의 deal 메서들르 살펴보자
					p1.getCard(deck.deal());
					System.out.println();
					p2.getCard(deck.deal());
					p1.showCards();
					System.out.println();
					p2.showCards();
	}
}
		//키보드로 입력 System.in -> InputStreamReader(문자) -> BufferedReader..readLine() -> System.out 출력하기
