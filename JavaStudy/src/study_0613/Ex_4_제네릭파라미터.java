package study_0613;

import java.util.ArrayList;
import java.util.Collections;
import study_0613.Ex_3_card;

public class Ex_4_제네릭파라미터 {
				//ArrayList에 제네릭 파라미터 값을 Card로 받고 있기에 Card클래스를 생성해야한다.
				
					ArrayList<Ex_3_card> deck = new ArrayList<Ex_3_card>();
					String[] suit = {"CLUB", "DIAMOND", "HEART","SPACE"};
					String[] number = {"2", "3", "4", "5", "6", "7", "8" , "9", "10", "J", "Q", "K"};
					
					
					public Ex_4_제네릭파라미터() {
						for (int i = 0; i < suit.length; i++) 
							for (int j = 0; j < number.length; j++)
								//제네릭 파라미터 객체에 add로 new Card(인자)를 입력했기에 Card 생성자 만들어서 매개변수로 받아줘야 합니다.
									deck.add(new Ex_3_card(suit[i], number[i]));
					}
					
					public void shuffle() {
						//Collections.shuffle : 저장된 데이터들을 랜덤으로 출력함
						Collections.shuffle(deck);
					}
					/*
					 deal 메서드를 살펴봤더니 Card를 반환했습니다. 이 말은 앞에 Player 클래스 getCard 메서드에
					 매개변수를 Card로 지정해줘야 한다는 것입니다 / 0번 index에 있는 Card를 제거한다는 뜻
					 제거한 카드를 player 메서드에 입력합니다.
					 */
					public Ex_3_card deal() {
						return deck.remove(0);
					}
					
					
					
					
					
					
					/*
					 Reader와 InputStream은 모두 데이터를 읽어오는데 사용되는 추상 클래스입니다.
					데이터 유형 : Reader는 문자 데이터를 다루는 데 사용되고, InputStream은 바이트 데이터를 다루는 데 사용됩니다.
					읽기 방식 : Reader는 문자 단위로 읽기 위한 메서드를 제공합니다. InputStream은 바이트 단위로 읽기 위한 메서드를 제공합니다.
					하위 클래스 : Reader의 하위 클래스에는 FileReader, InputStreamReader 등이 있고,
					InputStream의 하위 클래스에는 FileInputStream, ByteArrayInputStream 등이 있습니다.
					스트림 입출력 - 버퍼를 가지고 순차적으로 이뤄지는 입출력
					자바의 입출력 스트림
					응용 프로그램과 입출력 장치를 연결하는 소프트웨어 모듈
						- 입력 스트림 : 입력 장치로부터 자바 프로그램으로 데이터를 전달
						- 출력 스트림 : 출력 장치로 데이터 출력
					스트림은 연결될 수 있다.
					Writer OutputStream 출력 
					*/
}
