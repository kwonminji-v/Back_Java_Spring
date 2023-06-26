package study_0601;

public class StudentTest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student_2 s2 = new Student_2("이순신" , 3);
		Student_2 s = new Student_2("홍길동");
		
		String name = s.getName( );
		int grade = s.getGrade( );
		System.out.println("첫 번째 학생의 이름은" + name + ", 학년은 " + grade);
		
		name = s2.getName( );
		grade = s2.getGrade();
		System.out.println("두 번째 학생의 이름은" + name + ", 학년은 " + grade);
		
	}

}
