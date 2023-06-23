package study_0621;
//UDP 형식 채팅 프로그램 A
//UDP(user Datagram Protoocol)는
//데이터를 몇 개의 고정 길이의 패킷(다이어그램이라고 불린다>)으로 분할하여 전송
//GUI를 이용한 UDP 통신 채팅 - 통신자 A
//(1) 서버-블라이언트 방식이 아닌 단방향 비동기 방식으로
// 상대방과의 통신연결 확인 없이 메시지 주고받기
//(2) 상대가 잘 받았는지 확인 없이 그냥 보내기만 한다

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex6_messengerB {
    protected JTextField textField;
    protected JTextArea textArea;
    //DatagramSocket : 데이터그램 패킷을 보내고 받기 위한 소켓 클래스
//데이터그램 소켓은 패킷 전달 서비스를 위한 송신 또는 수신 지점
//데이터그램 소켓에서 보내거나 받은 각 패킷은 개별적으로 주소가 지정되고 라우팅됩니다
//한 시스템에서 다른 시스템으로 전송된 여러 패킷은 다르게 라우팅될 수 있으며 순서에 관계없이 도착가능
    DatagramSocket socket;
    DatagramPacket packet;
    InetAddress address = null;
    final int myPort = 5555; // 수신용 포트
    final int otherPort = 2222; //송신용 포트

    public Ex6_messengerB() throws IOException {
        //프레임 객체 생성
        new MyFrame();
        //localhost (도메인명) 의 ip 주소를 InetAddress 로 변환
        address = InetAddress.getByName("192.168.10.8");
        //수신용 포트번호로 데이터그램 소켓 생성 및 연결
        socket = new DatagramSocket(myPort);
    }
//받은 데이터 처리 프로세스

    public void process() {
        while (true) {
            try {
                //데이터를 담을 바이트 배열 생성
                byte[] buf = new byte[256];
                //b uf 배열의 길이만큼의 패킷을 받아 b uf 배열에 저장하는 데이터그램패킷 객체 생성
                packet = new DatagramPacket(buf, buf.length);
                //연결된 소켓으로 받아온 데이터를 패킷객체에 받는다
                socket.receive(packet);
                //소켓.receive(데이터그램패킷) 이 소켓에서 데이터그램 패킷을 받습니다
                //이 메서드가 반환되면 DatagramPacket의 버퍼는 수신된 데이터로 채워집니다
                // 데이터그램 패킷에는 보낸 사람의 IP 주소와 보낸 사람 컴퓨터의 포트 번호도 포함됩니다
                //이 메서드는 데이터그램이 수신될 때까지 차단됩니다
                //데이터그램 패킷 객체의 길이 필드는 수신된 메시지의 길이를 포함합니다 메시지가 패킷 길이보다 길면 메시지가 잘립니다
                //보안관리자가 있는 경우 보안, 관리자의 checkAccept 메소드가 허용하지 않으면 패킷을 수신할 수 없습니다
                // textArea에 받아온 메시지를 추가한다
                textArea.append("Recieved : " + new String(buf) + "\n");
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
    }

    class MyFrame extends JFrame implements ActionListener {
        public MyFrame() {
            super("MessengerA");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //열개수(문자개수) 30인 JTextField 생성 및 이벤트 지정
            textField = new JTextField(30);
            textField.addActionListener(this);
            //행개수(줄) 10, 열개수 30 인 JtextArea 생성 및 입력 비활
            textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            //textField를 프레임 아래쪽에 추가
            //BorferLayout.page_End: 구성 요소는 레이아웃 콘텐츠의 마지막 줄 다음에 삽입됨
            // 왼쪽에서 오른쪽 및 위에서 아래 방향의 경우 SOUTH 와 동일
            add(textField, BorderLayout.PAGE_END);
            //textArea를 프레임 중앙에 추가
            add(textArea, BorderLayout.CENTER);
            //내부 구성 요소 크기애ㅔ 프레임 크기 맞춤
            pack();
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //textField 에 입력된 문자열 가져옴
            String s = textField.getText();
            //문자열의 바이트 데에ㅣ터를 바이트배열 버퍼에 담음
            byte[] buffer = s.getBytes();
            DatagramPacket packet;
            //데이터그램 패킷을 생성
            // 데이터를 보내거나 받을 떄 활용되며 , 데이터를 묶는 클래스
            //데이트를 보낼 떄는 아래와 같이 객체 생성하며 4가지 인수가 필요하고
            //newDatagramPacket (보낼 데이터바이트 버퍼 , 보낼 바이트 길이, 보낼고 IP주소 , 보낼곳 포트 번호);
            //보낼 바이트 길이 는 보낼 데이터 바이트버퍼 에 담김 바이트 길이보다 짧아야 함
            packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
            try {
                //연결된 소켓으로 작성한 문자열의 바이트 데이터 전송
                socket.send(packet);
            } catch (IOException ee) {
                ee.printStackTrace();
            }
//		textArea에 내가 보낸 메시지 추가
            textArea.append("send : " + s + "\n");
            //바로 다음 메시지를 입력할 수 있게 작성했던 모든 메시지를 드래그 처리
            textField.selectAll();
            //현재 코드에선 캐럿의 위치를 textArea 의 문서 모델(getDocument) 의 문자수 (getLength) 위치에 설정
            // 즉 캐럿을 textArea에 입력된 문자의 마지막에 위치시킴
            //캐럿이라는 것은 커서를 의미
            //보내거나 받는 문자열의 마지막에 "\n" 의 줄바꿈 이스케이프 문자가 있기 때문에
            //텍스트를 입력할 커서를 textField 에 입력된 마지막 문자의 다음 줄에 위치 시킴
            textArea.setCaretPosition(textArea.getDocument().getLength());

        }
    }

    public static void main(String[] args) throws IOException {
        Ex6_messengerB n = new Ex6_messengerB();
        n.process();

    }
}
