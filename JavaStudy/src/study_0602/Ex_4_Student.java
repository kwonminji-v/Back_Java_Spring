package study_0602;

public class Ex_4_Student {

			String name;
			int grade;
			
			public Ex_4_Student() {
				System.out.println("Student 부모 생성자 호출");
			}
			public String getName() { return name;}
			public int getGrade() {return grade;}
			
			public String getStudInfo() {  //학생의 신상정보를 출력해주는 메서드
				System.out.println("Student 클래스의 getStudInfo() 호출");
					return "이름 : " +  name + " , 학년: " + grade;
			}
			public char[] getTeacher() {
				// TODO Auto-generated method stub
				return null;
			}
}
/*
super의 정의와 용도
자식 클래스 인스턴스에서 부모 클래스 인스턴스를 가리키는 변수
1. 부모 생성자 호출     ->  super()
2. 부모 클래스 멤버 호출  -> super.age, super.getAge();
 
 */
