package study_0622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Ch_2103DateClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 9100);
        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String res = input.readLine();
        System.out.println(res);
        System.exit(0);
        s.close();
    }
}
