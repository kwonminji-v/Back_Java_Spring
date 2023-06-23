package study_0621;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

// 웹에 있는 특정한 이미지 파일을 한정된 버퍼를 사용하여 다운로드하는 프로그램을 작성해보자 한정된 버퍼의 크기는 2048byte로 한다
public class Exm10_WebImageDownload {
    public static void main(String[] args) throws Exception {
        String webSite = "https://www.gstatic.com/webp/gallery/1.sm.jpg";
        System.out.println("" + webSite + "사이트에서 이미지를 다운로드 합니다.");
        
        URL url = new URL(webSite);
        byte[] buffer = new byte[2048];
        // byte형 배열 buffer를 선언하고 그 크기를 2048로 지정
        // 한 번에 가져올 수 있는 데이터의 크기를 지정하면 좋음
        // 보통 적게는 1024, 2048 많게는 4096 정도의 크기로 지정함
        
        try (InputStream in = url.openStream();
             FileOutputStream out = new FileOutputStream("test.jpg")) {
            // InputStream: 바이트 단위 입력 스트림
            // url.openStream: url 주소를 InputStream에 넣어준다
        	
            int length = 0;
            while ((length = in.read(buffer)) != -1) {
                System.out.println("" + length + "바이트 크기만큼 읽었음");
                out.write(buffer, 0, length);
            }
            
            in.close(); // InputStream은 닫아주는게 원칙
            out.close(); // OutputStream은 닫아주는게 원칙
        } catch (Exception e) {
            System.out.println("예외: " + e.getMessage());
        } // try() 괄호 안에 들어가는 것은 자원에 해당됩니다, 두 개의 자원이 들어가 있다
    } // try 문장이 끝나면 자동으로 해제됩니다, close() 생략가능
}
