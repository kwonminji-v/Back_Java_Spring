package study_0622;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Ch_2102Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9100);
        try {
            while (true) {
//                클라이언트의 연결 요청이 오길 기다리다가
//                연결요청이 오면 연결 소켓을 생성
                Socket socket = ss.accept();
                try {
//                    getOutputStream으로 socket에 대한 출력 스트림을 연결한다
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//                    PrintWriter(OutputStream out, boolean autoFlush) 는
//                    기본 문자 인코딩을 사용하여 문자를 바이트로 변환하는 필수 중간 출력 스트림 작성기를 생성
//                    autoFlush 인수가 true이면 println, printf 또는 format 메소드가  출력 버퍼를 자동으로 플러시 합니다
//                    출력 스트림으려 클라이언트에게 현재 날짜 및 시간 데이터를 전송한다
                    out.println(new Date().toString());
                } finally {
                    socket.close();
                }
                System.out.println("전송 완료, 종료...");
                break;
            }
        }finally {
            ss.close();
        } // 소켓: 두 응용프로그램 간의 양방향 통신 링크의 한 쪽 끝단
    } // 소켓끼리 데이터를 주고 받음, 소켓은 특정 IP 포트 번호와 결합
} // 웹브라우저 소켓 포트 <--> 인터넷 <--> 포트 소켓 웹서버
// 소켓 종류: 서버 소켓과 클라이언트 소켓