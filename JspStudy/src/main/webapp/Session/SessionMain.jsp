<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.Date" %>
 <%@ page import="java.text.SimpleDateFormat" %>
 
 <%
 SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");	// 날짜 표시 형식
 long creationTime = session.getCreationTime();	// 최초 요청(세션 생성) 시각
 String creationTimeStr = dateFormat.format(new Date(creationTime));
 
 long lastTime = session.getLastAccessedTime();	// 마지막 요청 시간
 String lastTimeStr = dateFormat.format(new Date(lastTime));
 %>
 <!-- 세션 : 클라이언트가 웹 브라우저를 통해 서버에 접속한 후 실행을 처리하고 웹 브라우저를 닫아
 						서버와의 접속을 종료하는 하나의 단위를 의미합니다. / 세션은 클라이언트가 서버에 접속해 있는동안 그 상태를 유지하는 것이 목적  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>
	<h2>Session 설정 확인</h2>
	<ul>
		<li>세션 유지 시간 : <%= session.getMaxInactiveInterval() %></li>
		<li>세션 아이디 : <%= session.getId() %></li>
		<li>최초 요청 시간 : <%= creationTimeStr %></li>
		<li>마지막 요청 시간 : <%= lastTimeStr %></li>
	</ul>
</body>
</html>