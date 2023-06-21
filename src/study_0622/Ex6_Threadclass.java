package study_0622;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//단톡방 같이 여러 클라이언트가 메시지로 대화하게 하는 스레드 클래스
public class Ex6_Threadclass {

	//동기화된 ArrayList를 생성하여 Printwriter만 들어갈 수 있는 List로 업 캐스팅 
	//static으로 지정하여 객체 생성이 안되어 Perclient 객체들의 공유 데이터로 설정하고 
	//각 클라이언트 별로 생성된 Printlriter를 담아서
	//한명의 클라이언트가 메시지 전송하면 모든 클라이언트한테 전달한다
	//클라이인트들이 메시지를 입력한 순서대로 전달하기 위해 동기화 설정을 한 것이다
	//Collections.synchronizedList(List) :
	//지정된 목룩이 지원하는 동기화된(스레드로부터 안전한) 목록을 반환
	static List<PrintWriter> List =
	Collections.synchronizedList(new ArrayList<>());
	/**
	Server class에서 사람들이 접속을 할 때마다 하나씩 Thread class 가 추가되게 된다
	이때 미완성 Thread class를 살펴 보면
	class Perclient extends Thread { static Liste<Printwrter>
	List = Collection.synchronizedList(new ArrayList<>()); 
	여기서 ArrayListe<pritWriter>(); * 는 모든 클라이언트에 대한 출력 스트림을 모아놓은 리스트를 계속 추기하기 위한 List
	 
	하지만 문제가 되는것은 동기화 Synchronized 입니다.
	동시에 출력을 하게 된다면 문제가 있기 떄문
	그래서 아래의 Collections. synchronizedList를 사용하여서 
	ArrayList 객체를 여러 Thread 가 안전하게 공유할 수 있는 동기화된 리스트로 만든다
	public class Perclient extends Thread { static Liste<Printwrter>
	List = Collection.synchronizedList(new ArrayList<>()); 
	*/
	Socket client;
	PrintWriter pw;
	//생성자로 전달받은 클라이언트와 연결된 소켓을 멤버로 초기화 하고
	//해당 클라이언트와 연결된 출력 스트림을 생성하여 공유 list 에 저장
	public void Ex6_(Socket client) throws IOException {
		this.client = client;
		pw = new PrintWriter(client.getOutputStream());
		List.add(pw);
	}
//스레드 동작
	public void run() {
		String name = "";
		try {
			//연결된 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
