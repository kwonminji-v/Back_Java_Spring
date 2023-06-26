package study_0621;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Ch_2104SimpleClient {
    public static void main(String[] args) throws IOException {
        InputStream is;
        PrintWriter pw = null;
        ServerSocket serverSocket;
        Socket s1 = null;
        String data;
        BufferedReader br_in;
        try {
            FileWriter writer = new FileWriter("out.txt");
            serverSocket = new ServerSocket(5436); // 포트 번호 변경
            System.out.println("서버 실행 중");

            s1 = serverSocket.accept();
            is = s1.getInputStream();
            br_in = new BufferedReader(new InputStreamReader(is));
            pw = new PrintWriter(writer, true);
            while ((data = br_in.readLine()) != null) {
                pw.println(data);
            }
            pw.close();
            s1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
