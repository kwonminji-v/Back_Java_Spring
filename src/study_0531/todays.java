package study_0531;


import java.util.Scanner;

//신입생에게 임의의 학번을 부여하는 프로그램을 작성하라
//신입생으로부터 이름과 생년월일을 입력 받은 후 임의의 학번을 생성하고
//이름, 생년월일과 학번을 출력해야한다. 
//생년월일은 yyyy/mm/dd 의 형태로 입력해야 한다. 
//yyyy는 연도를 나타내고 mm은 월, dd는 일을 나타낸다
//1월부터 9월까지는 한 자리 숫자이고 10월부터 12월 까지는 두자리 숫자이다. 
//1일부터 9일까지는 한자리숫자이고 10일부터 31일까지는 두자리 숫자이다. 
//학번은 17로 시작하고 17xxxx의 형태를 취한다
//학번은 xxxx는 1000부터 1009까지의 정수여야 한다. 
//substring(), indexOf() 사용해야한다. 
//<출력결과>
//이름입력 : 박샘이
//이름은 박샘이,
//생년월일 입력 (ex 1988/7/28) : 1991/11/25
//1991년 11월 25일 
//학번 : 171008

class studentDTO {
	public String name;
	public String dayOfBirth;
	public int year;
	public int month;
	public int day;
	public int studentNumber=171000;

	public void doSplit() {
		String[] d = dayOfBirth.split("/");
		year = Integer.parseInt(d[0]);
		month = Integer.parseInt(d[1]);
		day = Integer.parseInt(d[2]);
	}
	public void getStudentNumber() {
		int code = (int)(Math.random()*10);
		studentNumber += code; 
	}
}

public class todays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		studentDTO student01 = new studentDTO();

		System.out.print("이름 입력 : ");
		student01.name = sc.nextLine();
		System.out.println("이름은 " +student01.name);
		
		
		System.out.print("생년월일 입력 (ex 1988/7/28) : ");
		student01.dayOfBirth = sc.nextLine();
		student01.doSplit();
		System.out.println(student01.year+"년  "+student01.month+"월  "+student01.day+"일");
		
		student01.getStudentNumber();
		System.out.println("학번 : "+student01.studentNumber);
		
		sc.close();
	}
}
