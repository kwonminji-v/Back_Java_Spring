package study_0602A;

//대학생 클래스
public class EX_3_University extends Ex_2_Student {

		private int courses; //학점
		
		public EX_3_University(String _name, int _grade, int _courses, String teacher) {
			super();    //Student 클래스의 기본 생성자를 호출한다.
			System.out.println("University 생성자 호출");
			super.name = _name;
			super.grade = _grade;
			super.teacher = teacher;
			this.courses = courses;
		} // 여기서의 this는 현재 클래스의 인스턴스를 가르킵니다.
		
		public EX_3_University() {
				this("이순신", 2, 20, "홍길동");
		}
		
		public int getCourses() {
			return courses;
		}
		
		
		//overriding  메서드
		public String  getStudInfo() {
			System.out.println("University 클래스의 getStudInfo 메소드 호출");
			return "이름은 >> " + name + " , 학년은 >>" +  grade + ", 신청 학점은 >>" + courses; 
		}
		//학교명
		public String getTeacher() {
			return "지도 교수님 : " + super.teacher;
		}

}
