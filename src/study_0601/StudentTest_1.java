package study_0601;

public class StudentTest_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_2 s = new Student_2();   //메모리에 인스턴스를 생성한다.
		
		s.setName("이순신");
		String name = s.getName();
		System.out.println("학생 이름은 " + name);
	}

}

