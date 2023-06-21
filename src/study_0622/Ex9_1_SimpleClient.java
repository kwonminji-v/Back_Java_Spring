package study_0622;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Ex9_1_SimpleClient {
    public static void main(String[] args) {
        InputStream is;
        BufferedReader br;
        String message = null;

        try {
            Socket s1 = new Socket("127.0.0.1", 5434);
            is = s1.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            message = br.readLine();
            System.out.println(message);
            s1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
