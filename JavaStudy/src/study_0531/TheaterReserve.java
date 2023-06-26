package study_0531;


import java.util.Scanner;

public class TheaterReserve {
	public static void main(String[] args) {
		final int size = 5;
		int[] seats = new int[size];

		while (true) {
			System.out.println("----------------------------------------------------");
			
			for (int i = 0; i < size; i++) {
				System.out.print(i + 1 + " ");
			}
			
			System.out.println("\n----------------------------------------------------");
			for (int i = 0; i < size; i++) {
				System.out.print(seats[i] + " ");
			}
			
			System.out.println("\n----------------------------------------------------");

			System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1): ");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			if (s == -1) {
				System.out.print("프로그램을 종료합니다.\n예약된 자리는 : ");
				for(int i=0; i<size; i++) {
					if(seats[i] == 1) {
						System.out.print(i+1+"번 ");
					}
				}
				System.out.print("입니다.");
				break;
			}
			if (seats[s - 1] == 0) {
				seats[s - 1] = 1;
				System.out.println("예약되었습니다.");
			} else {
				System.out.println("이미 예약된 자리입니다.");
			}
		}
	}
}
