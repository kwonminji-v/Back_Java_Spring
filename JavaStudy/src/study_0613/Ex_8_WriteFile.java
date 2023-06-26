package study_0613;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.io.File;
public class Ex_8_WriteFile {

	public static void main(String[] args)  {
		
		
		File file = new File("write.txt");
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file, true));
			//file : 파일 객체인 file을 기반으로 파일을 엽니다.
			//true : 파일을 이어쓰기 모드로 엽니다.
			String s;
			System.out.println("Exit = Ctrl + Z");
			while((s = in.readLine()) != null) {
				out.println(s);
				//출력하는 텍스트에 개행문자를 추가한 후 출력한다.
				//out.print(s);
			}
			
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println("IOException");
		}
		//파일이 생성되었는지 3라인 정도 확인해보기

	}

}
