package study_0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ch_2101 {
    public static void main(String[] args) throws Exception {
        URL site = new URL("http://www.erum4ever.kr/");
        URLConnection url = site.openConnection(); // URLConnection클래스를 활용해 URL클래스에 Connection 설정
        // url. getInputStream : URLConnection클래스에서 인 스트림(입력) 설정
        // 입력받은 정보를 BufferedReader객체에 저장하고
        BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream()));
        // 줄 단위로 String변수에 저장함
        String inLine = in.readLine();
        //inLine에 저장된 모든 데이터를 콘솔창에 출력함
        while ((inLine = in.readLine()) != null)
            System.out.println(inLine);
        in.close();
    }
}
//URLConnection
//추상 클래스 URLConnection은 애플리케이션과 URL 간의 통신 링크를 나타내는
//모든 클래스의 super 클래스 입니다
//이 클래스의 인스턴스는 URL에서 참조하는 리소스에서 읽고 쓰는데 모두 사용할 수 있습니다