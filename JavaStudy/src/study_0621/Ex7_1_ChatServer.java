package study_0621;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex7_1_ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5005);
            System.out.println("서버 가동중");
            while (true) {
                Socket client = ss.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                System.out.println(client.getInetAddress() + " > " + br.readLine());
                br.close();
                client.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
