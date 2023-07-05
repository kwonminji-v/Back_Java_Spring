<%@ page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<meta charset="UTF-8">
<head>
<title>표현 언어(EL) - 객체 매개변수</title>
</head>
<body>

<!-- 
폼으로는 객체 전송이 불가능하므로, 영역을 사용한다.
→ 객체를 영역에 저장한 후, 전송하고자 하는 페이지로 전달한다. 
 -->
	<%
	request.setAttribute("personObj", new Person("홍길동", 33));
	request.setAttribute("stringObj", "나는 문자열");
	request.setAttribute("integerObj", new Integer(99));
	%>
	
	<jsp:forward page="ObjectResult.jsp">
		<jsp:param value="10" name="firstNum" />
		<jsp:param value="20" name="secondNum" />
	</jsp:forward>
</body>
</html>