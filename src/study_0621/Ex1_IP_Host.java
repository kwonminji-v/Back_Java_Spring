package study_0621;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex1_IP_Host {

	public static void main(String[] args) throws IOException {
			String hostname = "www.naver.com";
			//www 문자열을 hostname 변수에 선언
			
			try { //네이버 주소를 주소클래스에 담아서 address에 할당
				InetAddress address = InetAddress.getByName(hostname);
				//InetAddress 아이피 주소를 표현하는 클래스
				System.out.println("IP 주소 : " + address.getHostAddress());
			} // address만 입력하면 www/ip주소 같이 나오지만 getHost를 같이 사용하면 아이피 주소만 나옴
	        catch (UnknownHostException e) {
	            System.out.println(hostname + "의 IP 주소를 찾을 수 없습니다");
	        }
	    }
	} // www 주소가 없는 경우 출력 InetAddress 를 사용 안했기 때문
