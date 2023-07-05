<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
pageContext.setAttribute("scopeValue", "페이지 영역");
request.setAttribute("scopeValue", "리퀘스트 영역");
session.setAttribute("scopeValue", "세션 영역");
application.setAttribute("scopeValue", "어플리케이션 영역");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현 언어 (EL) - 내장 객체</title>
</head>
<body>
	<h2>ImplicationObjMain 페이지</h2>
	<h3>각 영역에 저장된 속성 읽기</h3>
	<ul>
		<li>페이지 영역 : ${ pageScope.scopeValue }</li>
		<li>리퀘스트 영역 : ${ requestScope.scopeValue }</li>
		<li>세션 영역 : ${ sessionScope.scopeValue }</li>
		<li>애플리케이션 영역: ${ applicationScope.scopeValue }</li>
	</ul>
<!-- 
page 영역
	동일한 페이지에서만 공유되고 페이지를 벗어나면 소멸된다. 
	즉) 하나의 JSP 페이지를 처리할 때 사용되는 영역
request 영역
	하나의 요청에 의해 호출된 페이지와 포워드(요청 전달)된 페이지까지 공유된다.
	즉) 하나의 요청을 처리할 때 사용되는 영역
session 영역
	클라이언트가 처음 접속한 후 웹 브라우저를 닫을 때까지 공유된다.
	즉)하나의 브라우저와 관련된 영역
application 영역
	한 번 저장되면 웹 애플리케이션이 종료될 때까지 유지된다.
	즉) 하나의 웹 어플리케이션과 관련된 영역  
 -->

	<h3>영역 지정 없이 속성 읽기</h3>
	<ul>
		<li>${ scopeValue }</li>
	</ul>

	 <jsp:forward page="ImplicitForwardResult.jsp"></jsp:forward> 
</body>
</html>

<!-- JSP 에서 스코프(scope)를 찾을 때는 가장 좁은 영역에서 시작하여 넓은 영역으로 
순차적으로 이동 이를 스코프 체이닝이라고 합니다. -->