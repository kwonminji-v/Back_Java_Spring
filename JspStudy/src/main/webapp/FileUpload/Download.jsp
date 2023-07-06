<%@ page import="study_0626.JSFunction_0628"%>
<%@ page import="java.io.FileNotFoundException"%>
<%@ page import="java.io.FileInputStream"%>
<%@ page import="java.io.File"%>
<%@ page import="java.io.OutputStream"%>
<%@ page import="java.io.InputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String saveDirectory = application.getRealPath("/Uploads");
String saveFilename = request.getParameter("sName");
String originalFilename = request.getParameter("oName");

try {
    // 파일을 찾아 입력 스트림 생성
    File file = new File(saveDirectory, saveFilename);  
    InputStream inStream = new FileInputStream(file);
    
    // 한글 파일명 깨짐 방지
    String client = request.getHeader("User-Agent");
    //client라는 문자열 안에 WOW64라는 문자열이 존재하지 않으면 true
    //WOW64는 64비트 Windows 운영 체제에서 32비트 애플리케이션을 실행하기 위한 모드
    if (client.indexOf("WOW64") == -1) {
        originalFilename = new String(originalFilename.getBytes("UTF-8"), "ISO-8859-1");
    }
    else {
        originalFilename = new String(originalFilename.getBytes("KSC5601"), "ISO-8859-1");
    }
   
    // 파일 다운로드용 응답 헤더 설정 
    response.reset();
    response.setContentType("application/octet-stream");
    response.setHeader("Content-Disposition", 
                       "attachment; filename=\"" + originalFilename + "\"");
    response.setHeader("Content-Length", "" + file.length() );
    //\" : 문자열 ("") 내에서 큰 따옴표(")를 사용하기 위해 역슬래시(\)를 이용해 특수문자를 표현
    //헤더의 
    
    
    // 출력 스트림 초기화
    out.clear();  
    
    // response 내장 객체로부터 새로운 출력 스트림 생성
    OutputStream outStream = response.getOutputStream();  

    // 출력 스트림에 파일 내용 출력
    byte b[] = new byte[(int)file.length()];
    //다운로드 할 파일의 경로 문자열 길이 크기의 바이트 배열 생성
    int readBuffer = 0;    
    while ( (readBuffer = inStream.read(b)) > 0 ) {
        outStream.write(b, 0, readBuffer);
    }
    //(보낼데이터(바이트), 시작 인덱스, 보낼 데이터의 시작 인덱스부터 보낼 바이트의 길이)

    // 입/출력 스트림 닫음
    inStream.close(); 
    outStream.close();
}
catch (FileNotFoundException e) {
	JSFunction_0628.alertBack("파일을 찾을 수 없습니다.", out);
}
catch (Exception e) {
	JSFunction_0628.alertBack("예외가 발생하였습니다.", out);
}
%>

