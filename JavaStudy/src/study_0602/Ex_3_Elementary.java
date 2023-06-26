package study_0602;

//초등학생 클래스
public class Ex_3_Elementary extends Ex_4_Student {
			//생성자
		public Ex_3_Elementary(String _name, int _grade, String string) {
			System.out.println("Elementary 생성자 호출");
			name = _name;    //부모의 멤버 변수에 접근한다.
   			grade = _grade;
		}


}
