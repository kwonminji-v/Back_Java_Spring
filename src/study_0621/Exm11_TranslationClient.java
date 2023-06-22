package study_0621;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Exm11_TranslationClient extends JFrame implements ActionListener {
    private BufferedReader in;
    private PrintWriter out;
    private JTextField field;
    private JTextArea area;

    public Exm11_TranslationClient() {
        setTitle("클라이언트");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 수정

        field = new JTextField(); // 수정
        field.addActionListener(this);

        area = new JTextArea(10, 50);
        area.setEditable(false);
        add(field, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);

        try {
            Socket socket = new Socket("localhost", 9101);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            area.append(in.readLine() + "\n");
            area.append(in.readLine() + "\n");
        } catch (IOException e) { // 예외 처리 추가
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent arg0) {
        out.println(field.getText());
        String response = null;
        try {
            response = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        area.append(response + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                Exm11_TranslationClient client = new Exm11_TranslationClient();
                client.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
