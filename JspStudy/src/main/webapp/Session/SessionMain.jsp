<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import ="java.util.Date" %>
 <%@ page import ="java.text.SimpleDateFormat" %>
 
 <%
 SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss"); //날짜 표시 형식
 
 long creationTime = session.getCreationTime(); //최초 요청 (세션 생성) 시각
 String creationTimeStr = dateFormat.format(new Date(creationTime));
 
 %>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>