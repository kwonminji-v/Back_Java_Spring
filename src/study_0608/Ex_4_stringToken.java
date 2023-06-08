package study_0608;

import java.util.StringTokenizer;

public class Ex_4_stringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 StringTokenizer : 문자열 관련 클래스
		import java.util.StringTokenizer; 로 import를 해주어야 사용이 가능
		StringTokenizer 클래스는 각 문자열을 토큰 단위로 분류한다.
		StringTokenizer의 생성자를 활용해 저장된 문자열의 분기점을 지정할 수 있다.
		*/
		StringTokenizer st = new StringTokenizer("홍길동 / 장화홍련 / 콩쥐 / 팥쥐", "/");
		/*
		 "/" 문자를 분기로 문자열을 분리
		 st 객체는 위의 초기화를 통해 문자열 배열 형태로 변경됨
		 hasMoreTokens 메소드는 객체에 다음 토큰이 있는지 확인
		 있으면 true 없으면 false 반환
		 */
		while (st.hasMoreTokens());
		//StringTokenizer 객체의 다음 토큰을 가져와서 출력
		System.out.println(st.nextToken());
		
		//토큰화는 주어진 문자열을 지정된 구분자에 따라 여러 부분으로 분리하는 과정
		//클래스는 생성자에서 받은 문자열을 지정된 분리자(구분자)를 기준으로 분리하여 토큰을 저장
	}

}
