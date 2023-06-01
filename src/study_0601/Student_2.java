package study_0601;


public class Student_2 {
	
			private String name;
			private int grade;
			
			public Student_2 (String _name, int _grade) {
				System.out.println("인자가 2개인 생성자 호출");
				name = _name;
				grade = _grade;
			}
			
			public Student_2 (String _name) {
				System.out.println("인자가 1개인 생성자 호출"); 
				name = _name;
				grade = 1;  // 만약 기본 학년 값을 설정하고 싶다면 이처럼 작성해주면 된다.
			}
			
			public Student_2() {
				System.out.println("디폴트 생성자 호출");
				//필요한 경우 여기서도 name과 grade에 기본 값을 설정할수 잇다.
			}
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getGrade() {
				return grade;
			}
			public void setGrade(int grade) {
				this.grade = grade;
			}
			
			
}