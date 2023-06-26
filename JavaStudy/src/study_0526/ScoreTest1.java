package study_0526;

import java.util.Scanner;
//continue문을 사용..유효하지 않은 점수 입력 시 다음 반복으로 진행
//equalsIgnoreCase()메서드를 사용합니다
public class ScoreTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean fail = false;

        do {
            for (int count = 0; count < 5;) {
                System.out.print("점수를 입력하세요: ");
                int score = scanner.nextInt();

                if ((score >= 0) && (score <= 100)) { // The score is between 0 and 100
                    sum += score;
                    if (score <= 40) {
                        fail = true;
                    }
                    count++;
                } else {
                    System.out.println("시험 점수가 잘못 입력되었습니다. 다시 입력해주세요.");
                    continue; // 유효하지 않은 점수 입력 시 다음 반복으로 진행
                }
            }

            double average = sum / 5.0;
            System.out.println("평균 점수 = " + average);
            int category = (int) average / 10;
            char credit;

            switch (category) {
                case 10:
                case 9:
                    credit = 'A';
                    break;
                case 8:
                    credit = 'B';
                    break;
                case 7:
                    credit = 'C';
                    break;
                case 6:
                    credit = 'D';
                    break;
                default:
                    credit = 'F';
            }

            if (fail) {
                System.out.println("한 과목 이상에서 40점 이하를 받았습니다. 과락입니다.");
            } else {
                System.out.println("평균 점수 = " + average + "점 , 학점 = " + credit);
            }

            System.out.print("계속 입력하시겠습니까? (Y/N): ");
            String input = scanner.next();
            if (!input.equalsIgnoreCase("Y")) {
                break;
            }

            // 입력값 초기화
            sum = 0;
            fail = false;
        } while (true);

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}
