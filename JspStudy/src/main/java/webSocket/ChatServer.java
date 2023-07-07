package webSocket;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;



@ServerEndpoint("/ChatingServer")
public class ChatServer {
	private static Set<Session> clients
	=Collections.synchronizedSet(new HashSet<Session>());
	
	@OnOpen //클라이언트 접속 시 실행
	public void onOpen(Session session) {
		clients.add(session);
		System.out.println("웹소켓연결 : "+session.getId());
	}
	
	@OnMessage //메세지 받으면 실행
	public void onMessege(String message, Session session) throws IOException {
		System.out.println("메세지 전송"+session.getId()+":"+message);
		
		synchronized(clients){
			for(Session client:clients) {
				//내가 보낸 메세지가 아니면
				if(!client.equals(session)) {
					client.getBasicRemote().sendText(message);
				}
			}
		}		
	}
	
	@OnClose//클라이언트와 연결이 끊기면 실행
	public void onClose(Session session) {
		clients.remove(session);
		System.out.println("웹소켓종료 : "+session.getId());
	}
	
	@OnError //에러발생 시 실행
	public void onError(Throwable e) {
		System.out.println("에러발생");
		e.printStackTrace();
	}
}