package study_0613;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;
import java.util.StringTokenizer;

//파일에서 시험 점수를 읽어서 총점과 평균을 구하는 예제
public class Ex_10_ScoreRead {

	public static void main(String[] args) {
		
		int totalScore = 0;
		int count = 0;
		float average = 0.0f;
		File file = new File("scoreData.txt");
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine();
			if (s != null ) {
				System.out.println("시험 점수 : " + s);
				StringTokenizer st = new StringTokenizer( s, ", ");
				
				//주어진 문자열을 구분자(delimiter)를 기준으로 분리하는 역할
				//StringTokenizer의 생성자에 첫 번째 인수로 분리할 문자열을, 두 번째 인수로 구분자를 전달
				
				while (st.hasMoreElements()) {
					totalScore += Integer.parseInt(st.nextToken());
					count++;
				}
				System.out.println("총점 = " + totalScore);
				System.out.println("시험 본 사람 = " + count + " 명");
				
				average = (float)totalScore / count;
				System.out.println("시험 평균 = " + average);
 			}
			
			in.close();
			
		} catch (FileAlreadyExistsException e1) {
				System.out.println("File not found");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
