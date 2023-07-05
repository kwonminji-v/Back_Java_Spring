<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="common.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현 언어 (EL) - 내장 객체</title>
</head>
<body>
<h2>List 컬렉션</h2>
<%
List<Object> aList = new ArrayList<Object>();
aList.add("푸바오");
aList.add(new Person("아이바오", 7));
pageContext.setAttribute("Everland", aList);
%>
<ul>
	<li>0번째 요소 : ${ Everland[0] }</li>
	<li>1번째 요소 : ${ Everland[1].name }, ${ Ocean[1].age }</li>	
	<li>2번째 요소 : ${ Everland[2] }</li>	
</ul>
<h2>Map 컬렉션</h2>
<%
Map<String, String> map = new HashMap<String, String>();
map.put("한글", "훈민정음");
map.put("Eng", "English");
pageContext.setAttribute("King", map);
%>
<ul>
	<li>영문 key : ${ King["Eng"] }, ${ King['Eng'] }, ${ King.Eng }</li>
	<li>한글 key : ${ King["한글"] }, ${ King['한글'] } , \${King.한글 }</li>
	<li>상단의 King.한글은 그대로 출력하면 에러 발생 -> key가 한글이라서  .(도트)연산자 사용 불가 </li>
</ul>
</body>
</html>