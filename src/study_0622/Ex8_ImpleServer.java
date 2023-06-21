package study_0622;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex8_ImpleServer {
    public static void main(String[] args) {
        try {
            System.out.println("서비스 하기 위해 준비중 입니다");
            ServerSocket ss = new ServerSocket(5434); // 변수명 수정
            Socket s1 = ss.accept(); // 메서드 호출 수정
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            ObjectInputStream ois = new ObjectInputStream(s1.getInputStream()); // 변수명 수정
            ObjectOutputStream oos = new ObjectOutputStream(s1.getOutputStream()); // 변수명 수정
            oos.writeObject("심플 서버에 접속하신걸 환영합니다");
            while (true) {
                System.out.println((String) ois.readObject());
                System.out.println("<Server>: "); // print 문 수정

                String temp = in.readLine();

                if (temp.equals("exit")) {
                    System.out.println("bye");
                    break;
                }
                oos.writeObject("<Server>: " + temp);
            }
            oos.close();
            ois.close(); // 스트림 닫기 추가
            s1.close();
            ss.close();
        } catch (EOFException eof) {
            System.out.println("클라이언트로부터 연결이 끊어졌습니다. 종료합니다...");
        } catch (ClassNotFoundException e) {
            System.out.println("클라이언트로부터 연결이 끊어졌습니다. 종료합니다...");
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
