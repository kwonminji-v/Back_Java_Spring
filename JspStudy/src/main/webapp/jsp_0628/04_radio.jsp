<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;  charset= UTF-8 ">
<title>Radio 서블릿</title>
</head>
<body>
		<form method="get" action="RadioServlet">
			<label for="gender"> 성별 : </label>
			
			<input type="radio"  id ="gender" name="gender" value = "여자" checked > 여자
			<input type="radio"  id ="gender" name="gender" value = "남자" > 남자
			<br><br> 
			
			<label for="chk_mail"> 메일 정보 수신 여부 : </label>
			<input type="radio" id="chk_mail" name ="chk_mail" value="yes" checked > 수신		
		<input type="radio" id="chk_mail" name ="chk_mail" value="no" > 거부		
		<br>
		<br> <label for="content">간단한 가입 인사를 적어주세요 😊 </label>
		<textarea name="content" id="content" cols="25" rows="3"></textarea><br>
		<input type="submit" value="전송">
		</form>
</body>
</html>