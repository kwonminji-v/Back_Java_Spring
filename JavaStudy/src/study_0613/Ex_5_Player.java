package study_0613;

import java.util.ArrayList;

public class Ex_5_Player {
			ArrayList<Ex_3_card> list = new ArrayList<Ex_3_card>();
			private Ex_3_card card;
			
			public void getCard(Ex_3_card card) {
					list.add(card);
			}
			
			public void showCards() {
				System.out.println(list);
			}

}
