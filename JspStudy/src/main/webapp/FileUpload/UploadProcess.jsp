<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="fileupload.MyfileDAO" %>
<%@ page import="fileupload.MyfileDTO" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.io.File" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>

<%

//String saveDirectory = application.getRealPath("/Uploads");
// 파일 업로드 경로가 이클립스에서 자동으로 생성한 임시 웹 애플리케이션
// 서버 경로로 설정되어 있습니다.
// 이 경로는 이클립스가 애플리케이션을 실행할 때마다 임시로 생성되며,
// 서버가 중지되면 해당 경로와 그 하위 파일은 모두 삭제된다.
String saveDirectory = "C:\\Uploads";
// 저장할 디렉터리
System.out.println("Directory Path : " + saveDirectory);
out.println(saveDirectory);

File dir = new File(saveDirectory);
if(!dir.exists()) {
	dir.mkdir();
}
int maxPostSize = 1024 * 1000;	// 파일 최대 크기(1mb)
String encoding = "UTF-8";	// 인코딩 방식

try {
	// MultipartRequest 객체 생성(request 객체, 저장할 파일 경로, 파일 크기, 인코딩 방식)
	MultipartRequest mr = new MultipartRequest(request, saveDirectory, maxPostSize, encoding);
	
	// 2. 새로운 파일명 생성
	String fileName = mr.getFilesystemName("attachedFile");	// 현재 파일 이름
	String ext = fileName.substring(fileName.lastIndexOf("."));	// 파일 확장자
	String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
	String newFileName = now + ext;	// 새로운 파일 이름("업로드일시.확장자")
	
	// 3. 파일명 변경
	File oldFile = new File(saveDirectory + File.separator + fileName);
	File newFile = new File(saveDirectory + File.separator + newFileName);
	oldFile.renameTo(newFile);
	
	// 4. 다른 폼값 받기
	String name = mr.getParameter("name");
	String title = mr.getParameter("title");
	String[] cateArray = mr.getParameterValues("cate");
	StringBuffer cateBuf = new StringBuffer();
	if(cateArray == null) {
		// append : 선택된 요소의 마지막에 새로운 요소나 컨텐츠를 추가한다.
		cateBuf.append("선택없음");
	} else {	// 여러 개를 선택했을 때 구분하기 위해 ,를 붙인다.
		for(String s : cateArray) {
			cateBuf.append(s + ", ");
		}
		
	}
	// 5. DTO 생성해서 전송된 form 값을 담는다.
	MyfileDTO dto = new MyfileDTO();
	dto.setName(name);
	dto.setTitle(title);
	dto.setCate(cateBuf.toString());
	dto.setOfile(fileName);
	dto.setSfile(newFileName);
	
	// 6. DAO를 통해 데이터베이스에 반영
	MyfileDAO dao = new MyfileDAO();
	dao.insertFile(dto);
	dao.close();
	
	// 7. 파일 목록 JSP로 리디렉션
	response.sendRedirect("FileList.jsp");
} catch(Exception e) {
	e.printStackTrace();
	request.setAttribute("errorMessage", "파일 업로드 오류");
	request.getRequestDispatcher("FileUploadMain.jsp").forward(request, response);
}

%>

<%--
파일을 업로드할 때 파일명을 변경하는 주된 이유
파일명 충돌 방지, 보안, 인코딩 문제 해결
관리 용이성 :
파일을 업로드 할 때 일관된 명명 규칙을 사용하면, 나중에 파일을 관리하거나 찾을 때 편리
업로드 시간을 파일명에 포함시키면, 언제 업로드되었는지 쉽게 알 수 있다.
업로드한 파일명이 한글이라고 가정할 때 이를 브라우저에 표시하기 위해
<img src='한글.jps'>와 같이 써야한다.

하지만 이 방식으로 웹 서버 인코딩 방식에 따라 한글이 깨질 수 있기 때문에
영어나 숫자로 조합해주는게 안전하다.

파일 업로드용 작성폼 설정
method 속성은 반드시 post로, enctype 속성은 multipart/form-data로 지정
enctype은 폼값을 서버로 전송할 때의 인코딩 방식을 지정하는 속성
<input> 태그의 type 속성을 file로 지정
ofile 원본 파일명(original filename)
sfile 저장된 파일명(sved filename)
파일의 확장자를 구하기 위해 위에서 lastIndexOf() 메서드를 사용한 이유는 "."이 2개 이상 포함될 수 있기 때문이다.
 --%>
