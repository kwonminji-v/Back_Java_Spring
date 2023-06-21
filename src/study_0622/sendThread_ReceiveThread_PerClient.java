package study_0622;
//클라이언트가 입력한 메시지를 연결된 서버 소켓으로 전송하는 스레드 클래스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class sendThread_ReceiveThread_PerClient extends Thread{
Socket socket;
String name;
PrintWriter pw;
//PrintWriter 기존 OutputStream 에서 자동 줄 플러시 없이 새 PrintWriter를 만듬
//이 편리한 생성자는 기본 문자 인코딩을 사용하여 문자를 바이트로 변환하는데
//필요한 중간 OutputStramWriter를 만듬. 자동 플러시가 활성화가 되면 줄바꿈 문자가 출력될 때 마다가 아니라
//Println , printf 또는 format 메서드 중 하나가 호출도리 때만 수행

// 생성자로 연결된 소켓과 클라이언트 닉네임을 받아서 멤버 초기화
public sendThread_ReceiveThread_PerClient (Socket socket , String name) {
	this.socket = socket;
	this.name = name;
}
//스레드 동작
public void run() {
	//내가 입력한 메시지를 읽는 문자 스트림 버퍼 생성
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
		//연결된 소켓에 대한 문자 출력 스트림 생성
		pw = new PrintWriter(socket.getOutputStream());
		//연결된 소켓으로 클라이언트 닉네임 전송
		pw.println(name);
		pw.flush();
		while(true) {
			//리더에 입력된 메시지를 저장
			String msg = br.readLine();
			//저장된 메시지가 bye 면 종료
			if(msg.equals("bye")) break;
			//저장된 메시지를 전송
			pw.println(msg);
			pw.flush();
		}
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}finally {
		try {
			//반드시 소켓을 닫는다
			socket.close();
		} catch (IOException e) {
			
		}
	}
}
}
