package study_0602;

public class EX_1_parameter {

	
	String title;
	String author;
	
//아래 생성자의 매개변수 갯수가 다르다
	
	
//즉 ) input 값, 매개변수가 하나일 때 활용 -> 여기선 loveStory 변수에 적용되었다.
	
	public EX_1_parameter(String t) {
		title = t;
		author = "작자 미상";
}

//아래 생성자는 작자를 알 때, 사용한다 즉) input 값, 매개변수가 두개일 때 활용 -> 여기선 littlePrince에 적용되었다.
		public EX_1_parameter(String t, String a) {
			title = t;
			author = a;
		}
	
	public static void main(String[] args) {
		
		/*두 클래스 모두 객체를 생성했으므로 static을 사용하지 않아도 된다.
		 아래 두 객체는 서로 가는 방향이 다르다. 매개변수의 수에 맞춰서 진행된다.*/
		
		EX_1_parameter littlePrince = new EX_1_parameter("어린왕자", "생택쥐페리");
		EX_1_parameter loveStory = new EX_1_parameter("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);

		
		
	}

}
