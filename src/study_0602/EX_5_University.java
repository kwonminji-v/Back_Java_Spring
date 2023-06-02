package study_0602;

//대학생 클래스
public class EX_5_University extends Ex_4_Student {

		private int courses; //학점
		
		public EX_5_University(String _name, int _grade, int _courses, String string) {
			System.out.println("University 생성자 호출");
			name = _name;
			grade = _grade;
			courses = _courses;
		}
		
		//학점 출력 메서드
		public int getCourses() {
			return courses;
		}

}
