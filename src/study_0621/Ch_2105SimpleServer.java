package study_0621;

import java.io.*;
import java.net.Socket;

public class Ch_2105SimpleServer {
    public static void main(String[] args) {
        try {
            Socket s1 = new Socket("localhost", 5434);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            ObjectInputStream ois = new ObjectInputStream(s1.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(s1.getOutputStream());
            oos.writeObject("심플 서버에 접속하신걸 환영합니다");
            while (true) {
                System.out.println((String) ois.readObject());
                System.out.print("<Server>: ");

                String temp = in.readLine();

                if (temp.equals("exit")) {
                    System.out.println("bye");
                    break;
                }
                oos.writeObject("<Server>: " + temp);
            }
            oos.close();
            ois.close();
            s1.close();
        } catch (EOFException eof) {
            System.out.println("서버로부터 연결이 끊어졌습니다. 종료합니다...");
        } catch (ClassNotFoundException e) {
            System.out.println("서버로부터 연결이 끊어졌습니다. 종료합니다...");
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
