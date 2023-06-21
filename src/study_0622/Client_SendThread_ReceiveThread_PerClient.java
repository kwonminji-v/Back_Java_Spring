package study_0622;

import java.net.Socket;
import java.util.Scanner;

public class Client_SendThread_ReceiveThread_PerClient {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("연결할 IP");
	String ip = sc.nextLine();
	//내 채팅 닉네임 입력
	System.out.println("사용할 닉네임");
	String name = sc.nextLine();
	try {
		//서버에 소켓 연결
		Socket socket = new Socket(ip, 9002);
		//연결된 소켓으로 다른 상대의 메시지를 받기위한  스레드 객체 생성
	ReceiveThread_PerClient rt = new ReceiveThread_PerClient(socket);
	//연결된 소켓으로 내가 입력한 메시지를 다른 상대에게 보내는 스레드 객체 생성
	sendThread_ReceiveThread_PerClient st = new sendThread_ReceiveThread_PerClient(socket, name);
	//스레드 시작
	rt.start();
	st.start();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
