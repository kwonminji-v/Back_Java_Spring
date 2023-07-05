<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 
EL에서 폼값을 처리하기 위한 내장 객체
null을 표현식으로 출력하면 예외가 발생하지만, EL로 출력하면 예외가 발생하지 않는다.
1) param: request.getParameter("매개변수명")과 동일하게 요청 매개변수의 값을 받아온다.
2) paramValues: request.getParameterValues("매개변수명")과 동일하게 요청 매개변수의 값을 문자열 배열로 받아온다. 
-->
<meta charset="UTF-8">
<title>표현 언어 (EL) - 내장 객체</title>
</head>
<body>
	<h2>폼값 전송하기</h2>
	
	<form name="frm" method="post" action="FormResult.jsp">
	
		이름 : <input type="text" name="name" /><br> 
		성별 : <input type="radio" name="gender" value="Man" /> 남자
		 <input type="radio" name="gender" value="Woman" /> 여자<br>
		  
		 학력 : 
		 <select name="grade">
			<option value="ele">초딩</option>
			<option value="mid">중딩</option>
			<option value="high">고딩</option>
			<option value="uni">대딩</option>
		</select><br> 
		관심 사항 : 
		<input type="checkbox" name="inter" value="pol" />정치
		<input type="checkbox" name="inter" value="eco" />경제 
		<input type="checkbox" name="inter" value="ent" />연예 
		<input type="checkbox" name="inter" value="spo" />운동<br> 
		<input type="submit" value="전송하기" />
		
	</form>
</body>
</html>