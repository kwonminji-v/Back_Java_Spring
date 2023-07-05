
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현 언어 (EL) - 내장 객체</title>
</head>
<body>
	<h2>ImplicitForwardResult 페이지</h2>
	<h3>각 영역에 저장된 속성 읽기</h3>
	<ul>
		<li>페이지 영역 : ${ pageScope.scopeValue }</li>
		<li>리퀘스트 영역 : ${ requestScope.scopeValue }</li>
		<li>세션 영역 : ${ sessionScope.scopeValue }</li>
		<li>애플리케이션 영역: ${ applicationScope.scopeValue }</li>
	</ul>
	<h3>영역 지정 없이 속성 읽기</h3>
	<ul>
		<li>${ scopeValue }</li>
	</ul>
</body>
</html>

<!-- 
1) pageScope: pageContext 내장 객체와 같이 page 영역에 저장된 속성값을 읽어온다.
2) requestScope: request 내장 객체와 같이 request 영역에 저장된 속성값을 읽어온다.
3) sessionScope: stssion 내장 객체와 같이 session 영역에 저장된 속성값을 읽어온다.
4) applicationScope: application 내장 객체와 같이 application 영역에 저장된 속성값을 읽어온다.  -->
