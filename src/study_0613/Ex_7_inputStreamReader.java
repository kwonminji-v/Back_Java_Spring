package study_0613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class Ex_7_inputStreamReader {

	public static void main(String[] args) {
					String mesg = null;
					InputStreamReader ir = new InputStreamReader(System.in);
					BufferedReader in = new BufferedReader(ir);
					
					System.out.println("exit : Ctrl+Z");
					
					try {
						mesg = in.readLine();
						while (mesg != null) {
							System.out.println("읽기 : " + mesg);
							mesg = in.readLine();
						}
						in.close();
						ir.close();
					} catch (IOException e) {
							e.printStackTrace();
					}
					
				/* File 클래스 사용법
				 	 File file = new File ("파일명")
				 	 File file = new File ("파일 경로", "파일명");*/
	}
}

//키보드로 입력 System.in -> InputStreamReader(문자) -> BufferedReader..readLine() -> sysout 출력
/*
 파일에 데이터 쓰기 과정
 키보드 입력 PrintWriter[println()]  File Writer --> write.txt
 파일에 데이터 읽기 과정
 write.txt --> FileReader BufferedReader[readLine()] --> 모니터 출력
 
 FileReader 클래스는 파일을 읽는 기능을 제공하지만, 단순히 파일을 한 문자씩 읽어오는 기능에 불과합니다.
 BufferedReader 클래스는 FileReader 객체를 생성자로 받아들여 내부적으로 버퍼를 사용하여 효율적인 파일 읽기를 지원합니다.
 BufferedReader 클래스는 read() 및 readLine();과 같은 메서드를 제공
 
 */
 