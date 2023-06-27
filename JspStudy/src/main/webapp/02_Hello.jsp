<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ page import="java.text.SimpleDateFormat"%>
<!--  필요한 외부 클래스 임포트 -->
<%@ page import="java.util.Date"%>
<%@ page import="java.util.Calendar"%>

<%!String str1 = "JSP";
	String str2 = "안녕하세요!";%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Hello Java</title>
</head>

<body>
		<h2>
		처음 만들어보는 <%=str1 %>
		</h2>
		<p>
		<%
			out.println(str2 + str1 + "입니다.  집에가고싶어요~~");
		%>		
		</p>
	
<%
	/* Calendar, SimpleDateFormat 객체를 활용해 날짜 출력  */
	Calendar date = Calendar.getInstance();
	SimpleDateFormat today = new SimpleDateFormat("yyyy - MM - dd");
	SimpleDateFormat now = new SimpleDateFormat("hh시 mm분 ss초");
%>
<!-- today로 년 월 일을 now로 시 분 초를 표현  -->
오늘은
<b><%= today.format(date.getTime()) %></b> 입니다.
<br> 지금 시각은
<b><%= now.format(date.getTime()) %></b> 입니다.
</body>
</html>