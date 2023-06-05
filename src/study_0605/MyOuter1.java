package study_0605;

/* static 내부 클래스 정의
	 내부 클래스가 static으로 지정된 클래스
	 내부 클래스 멤버가 static으로 지정되었으면 내부 클래스도 반드시 static으로 지정해야한다.
 */

public class MyOuter1 {
		private String name;
		private int age;
		public MyOuter1 ( String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		static class Inner {
			private String address;   // 자신만의 인스턴스 값을 가질 수 있다.
		//	static String tel = "010-1234-4918";  // 공유, 클래스 멤버 동작한다.
			
			public Inner ( String address) {
				this.address = address;
			}
			public String  getUserInfo() {
				//  return name + "" + age;  //에러 외부 클래스의 인스턴스 변수 접근
				return "주소는 : " + address + ", 전화번호 : " + tel;
			}
		}
}
