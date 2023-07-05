<%@ page import="java.util.*"%>
<%@ page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL - set 1</title>
</head>
<body>
<!-- 
JSTL(Java Standard Tag Library)
JSP에서 빈번하게 사용되는 조건문, 반복문 등을 처리해주는 태그를 모아 표준으로 만들어 놓은 라이브러리
스크립틀릿 없이 태그만으로 작성할 수 있기 때문에 코드가 간결해지고 읽기 편해짐
 -->

<!-- <!-- 변수 선언
 <c:set> 태그는 EL에서 사용할 변수나 자바빈즈를 생성할 때 사용
 JSP에서 영역에 속성을 저장할 때 사용하는 setAttribute()메서드와 같은 역할 </c:set>  --> 

	<c:set var="directVar" value="100" />
	<c:set var="elVar" value="${ directVar mod 5 }" />
	<c:set var="expVar" value="<%=new Date()%>" />
	<c:set var="betweenVar">변수값 이렇게 설정</c:set>

	<h4>EL을 이용해 변수 출력</h4>
	<ul>
		<li>directVar : ${ pageScope.directVar }</li>
		<li>elVar : ${ elVar }</li>
		<li>expVar : ${ expVar }</li>
		<li>betweenVar : ${ betweenVar }</li>
	</ul>

	<h4>자바빈즈 생성 1 - 생성자 사용</h4>
	<c:set var="personVar1" value='<%=new Person("Kim", 50)%>'
		scope="request" />
	<ul>
		<li>이름 : ${ requestScope.personVar1.name }</li>
		<li>나이 : ${ personVar1.age }</li>
	</ul>

	<h4>자바빈즈 생성 2 - target, property 사용</h4>
	<c:set var="personVar2" value="<%=new Person()%>" scope="request" />
	<c:set target="${ personVar2 }" property="name" value="Park" />
	<c:set target="${ personVar2 }" property="age" value="60" />
	<ul>
		<li>이름 : ${ requestScope.personVar2.name }</li>
		<li>나이 : ${ personVar2.age }</li>
	</ul>
</body>
</html>
<!-- 자바빈즈나 컬렉션을 생성할 때는 target과 property 속성을 사용
		 <c:set var ="변수명" value="저장할 객체 혹은 컬렉션" scope="영역" />
		 <c:set target="var로 설정한 변수명" property="객체의 속성명" value="속성값"/>
		 
		 <c:if test = "조건" var="변수명" scope="영역"
		 조건이 true 일 때 출력할 문장
		 </c:if> 
		 test if 문에서 사용할 조건을 지정  -->
