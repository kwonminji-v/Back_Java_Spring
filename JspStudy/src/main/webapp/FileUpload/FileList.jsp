<%@ page import="java.net.URLEncoder"%>
<%@ page import="java.util.List"%>
<%@ page import="fileupload.MyfileDAO"%>
<%@ page import="fileupload.MyfileDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
    
<html>
<head><title>FileUpload</title></head>
<body>

    <h2>DB에 등록된 파일 목록 보기</h2>
    <a href="FileUploadMain.jsp">파일 등록하기</a>
    
    <%
    MyfileDAO dao = new MyfileDAO();
    List<MyfileDTO> fileLists = dao.myFileList();
    dao.close();
    %>
    
    <table border="1">
        <tr>
            <th>No</th><th>작성자</th><th>제목</th><th>카테고리</th>
            <th>원본 파일명</th><th>저장된 파일명</th><th>작성일</th><th></th>
        </tr>
    <% for (MyfileDTO f : fileLists) { %>
        <tr>
            <td><%= f.getIdx() %></td>    <%-- ${f.idx} --%>
            <td><%= f.getName() %></td> <%-- ${f.name} --%>
            <td><%= f.getTitle() %></td> <%-- ${f.title} --%>
            <td><%= f.getCate() %></td> <%-- ${f.cate} --%>
            <td><%= f.getOfile() %></td> <%-- ${f.ofile} --%>
            <td><%= f.getSfile() %></td> <%-- ${f.sfile} --%>
            <td><%= f.getPostdate() %></td> <%-- ${f.postdate} --%>
            <td><a href="Download.jsp?oName=
            <%= URLEncoder.encode(f.getOfile(),"UTF-8") %>&sName=
            <%= URLEncoder.encode(f.getSfile(),"UTF-8") %>">[다운로드]</a></td>
        </tr>
    <% } %>
    </table>
    <%-- URLEncoder.encode(문자열, 인코딩 문자셋)
   				[다운로드] 클릭 시 Download.jsp 페이지로 이동하며, ? 이후 해당 데이터의 원본 파일명,
   				저장된 파일명을 get 방식으로 전달합니다. --%>    
</body>
</html>