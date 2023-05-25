package study_0525;

//시험 점수를 학점으로 변환하는 예제
public class Convert_grade {

	public static void main(String[] args) {
		int score = 189;
		int category = 0;
		char credit;

		if ((score >= 0) && (score <= 100)) { // 점수가 0과 100 점 사이인 경우
			category = score / 10;
			System.out.println("category = " + category);

			if (category == 10 || category == 9)
				credit = 'A';
			else if (category == 8)
				cretdit = 'B';
			else if (category == 7)
				cretdit = 'C';
			else if (category == 6)
				cretdit = 'D';
			else
				credit = 'F';
		}

	}

}
