package study_0526;

public class Continue_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. 단일 루프에서의 continue
		for(int i = 0 ;  i < 10;  i++) {
			continue;
		}
		
		for(int i = 0; i < 10; i ++) {
			System.out.print(i + "  ");
			continue;
		}// 0 ~ 9
		
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i + "  ");
		} // 0~4, 6~9
		System.out.println();

	// 2. 다중 (이중 루프에서의 continue)
	for( int i = 0;i<5;i++) {
		for (int j = 0; j < 5; j++) {
			if (j == 3) {
				continue;
			}
			System.out.print(i + ", " + j);
		}
	}
	System.out.println();
	POS1: for(int i = 0; i < 5; i++) {
		for(int j=0; j < 5; j++) {
			if(j==3) {
				continue POS1;
			}
			System.out.println(i + ", " + j);
		}
	}
}
}