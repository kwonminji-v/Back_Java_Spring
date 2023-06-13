package study_0613;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex_12_Throws_IOE {

	public static void main(String[] args) throws IOException {
		// 파일 클래스의 객체 tempDir을 생성하는데 경로는 C 드라이브의 temp폴더
			File tempDir = new File("C://temp");
		
		//만약 temDir에 폴더가 없다면 temp 폴더를 생성한다.
			if(!tempDir.exists())
				tempDir.mkdir();
			
		//#1-1. 파일 객체 생성
			File newFile = new File("C:/temp/newFile.txt");
			
		//#1-2. 파일이 없는 경우 실제 파일 생성
			 if (!newFile.exists());
			 	newFile.createNewFile();  // temp 폴더가 없는 경우 예외 발생

		// 파일에 내용 쓰기
			 FileWriter fileWriter = new FileWriter(newFile);
			 PrintWriter printWriter = new PrintWriter(fileWriter);
			 
			 printWriter.println("Hello, world!");
			 printWriter.println("만류 귀종.");
			 
			 printWriter.close();
			 fileWriter.close();
			 
			 System.out.println("파일에 내용이 작성되었습니다.");
			 
		//#2. 파일 구분자
			 File newFile2 = new File("C:\\temp\\newFile.txt");  //windows
			 
		//둘 다 가능
			 File newFile3 = new File("C:" + File.separator + "temp" + File.separator + "newFile.txt");
			 File newFile4 = new File("C:/temp/newFile.txt");  //Mac
			 
		//경로에 파일이 존재하는지 boolean 형으로 출력
			 System.out.println(newFile2.exists());
			 System.out.println(newFile3.exists());
			 System.out.println(newFile4.exists());
  	}

}
