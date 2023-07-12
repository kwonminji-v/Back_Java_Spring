<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Form Tag-webpage07_02</title>
</head>
<body>
	<h3>회원 정보</h3>
	<p> 아이디 : ${member.id}
	<p> 패스워드 : ${member.passwd}
	<p> 거주지 : ${member.city}
	<p> 성 별 : ${member.sex}
	<p> 취 미 : <c:forEach items="${member.hobby}" var="hobby">
	[<c:out value="${hobby}"/>]
	</c:forEach>
</body>
</html>