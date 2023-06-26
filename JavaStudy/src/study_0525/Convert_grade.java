package study_0525;

//시험 점수를 학점으로 변환하는 예제
public class Convert_grade {

	public static void main(String[] args) {
		int score = 180;
		int category = 0;
		char credit;

		if ((score >= 0) && (score <= 100)) { // 점수가 0과 100 점 사이인 경우
			category = score/10;
			System.out.println("category = " + category);

			if (category == 10 || category == 9)
				credit = 'A';
			else if (category == 8)
				credit = 'B';
			else if (category == 7)
				credit = 'C';
			else if (category == 6)
				credit = 'D';
			else
				credit = 'F';
			
			System.out.println("시험점수 = " + score + "점, 학점 = " + credit);
		} else {
			System.out.println("시험점수가 잘못 입력 되었습니다.");
		}

	}

}

//문 > scanner와 if 문 switch 문을 사용하여 점수를 입력받아 출력하도록 해보기
