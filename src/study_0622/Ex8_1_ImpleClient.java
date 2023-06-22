package study_0622;

import java.io.*;
import java.net.Socket;

public class Ex8_1_ImpleClient {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("사용법 java SimpleClient [server_name]");
            System.out.println("server_name을 입력하지 않으셔서 localhost로 접속을 시도합니다");
            args = new String[] {"localhost"};
        }
        try {
            Socket s1 = new Socket(args[0], 5434);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            ObjectOutputStream oos = new ObjectOutputStream(s1.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(s1.getInputStream());
            System.out.println("접속완료");
            System.out.println((String) ois.readObject());
            System.out.println("서버에게 먼저 메시지를 보내십시오");
            while (true) {
                System.out.println("<Client>: ");
                String temp = in.readLine();
                if (temp.equals("exit")) {
                    System.out.println("bye~");
                    break;
                }
                oos.writeObject("<Client>: " + temp);
                System.out.println((String) ois.readObject());
            }
            ois.close();
            s1.close();
        } catch (EOFException e) {
            System.out.println("Server로 부터 연결이 끊어졌습니다. 종료합니다...");
        } catch (ClassNotFoundException e) {
            System.out.println("Server로 부터 연결이 끊어졌습니다. 종료합니다...");
            System.exit(0);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
