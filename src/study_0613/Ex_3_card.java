package study_0613;


public class Ex_3_card {
			//Card(suit[i], number[j]) 인자로 받은 값을 생성자 (매개변수)로 생성
	
			String suit;
			String number;
			
			
			public Ex_3_card(String suit, String number) {
				this.suit = suit;
				this.number = number;
			}

			//Card 객체에 저장된 데이터를 표현하기 위해 toString 메서드를 활용
			@Override
			public String toString() {
				return " [(suit=" + suit +  ", number=" + number + ")]";
			}
}


//아스키(ASCII) vs. 유니코드(Unicode)
//하나의 문자셋에 국가별 모든 문자셋 통합(Unicode)
//아스키 미국정보교환표준부호
//한글(영문/한자) 전용 문자셋: EUC-KR vs. MS949
//EUC-KR KS 완성형: 초기의 한글완성형 문자셋
//-Windows에서 사용되는 한글 완성형 표기 (2byte)
//대표적인 유니코드 문자셋: UTF-16 vs. UTF-8
//UTF-8 고정 길이 문자 인코딩 방식(2byte): 영문 및 한글 동일
//UTF-8 가변 길이 문자 인코딩 방식(1byte ~ 4byte)
//대부분의 웹서버(Apache, IIS, NginX 등), 데이터베이스(MySQL 등), 기본 인코딩 방식
//아스키 코드 해당 문자는 1byte, 한글은 3byte로 표현
//자바의 문자셋(Charset)  java.nio.charset.Charset 클래스로 정의