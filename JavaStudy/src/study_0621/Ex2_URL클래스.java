package study_0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex2_URL클래스 {
	//화면에 눈에 보이는 정적 모습을 보여주는 html 코드
	public static void main(String[] args) throws IOException {
		//URL 클래스 생성
			URL site = new URL("http://www.erum4ever.kr/");
			
		//URL site = new URL("http://www.seoultech.ac.kr/index.jsp");
		//URLConnection 클래스를 활용해 URL 클래스에 Connection 설정
			URLConnection url = site.openConnection();
			
		//url.getInputStream : URLConnection 클래스에서 inputStream(입력) 설정
		//입력받은 정보를 BufferedReader 객체에 저장하고
			BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream()));
			
		//줄 단위로 String 변수에 저장함
			String inLine = in.readLine();
			
		//inLine에 저장된 모든 데이터를 콘솔창에 출력함
			while ((inLine = in.readLine()) != null) 
					System.out.println(inLine);
					in.close();
	}

}
