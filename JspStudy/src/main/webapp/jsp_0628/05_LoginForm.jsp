<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>�α��� : ���̵� ��й�ȣ �Է�</h3>
	<form method="get" action = "LoginServlet">
		<!-- doGet �޼ҵ� Ȱ�� LoginServelt ��Ī ���߱�  -->
		<label for = "userid"> ���̵� : </label>
		<input type = "text" name = "id" id="userid"><br>
		
		<!-- �ؽ�Ʈ ���� ����� type = "text"  -->
		<label for = "userpwd"> �� &nbsp; ȣ :</label>
		<input type = "password" name = "pwd" id="userpwd"><br>
		
		<!-- �ؽ�Ʈ ���� ����� type = "password"  -->
		<input type = "submit" value = "�α���">
		<!-- ��ư submit Ÿ������ �ؼ� ���� �ǵ��� --> 
	</form> <br>
	
</body>
</html>