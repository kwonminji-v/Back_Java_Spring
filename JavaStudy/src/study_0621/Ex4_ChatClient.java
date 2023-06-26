package study_0621;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex4_ChatClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("서버 IP");
        String ip = sc.nextLine();
        System.out.println("보낼 메시지");
        String msg = sc.nextLine();
        sc.close();

        try {
            Socket sk = new Socket(ip, 5005);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
            bw.write(msg);
            bw.flush();
            bw.close();
            sk.close();

            System.out.println("보내기 성공");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}