<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ page import="java.text.SimpleDateFormat"%>
<!--  �ʿ��� �ܺ� Ŭ���� ����Ʈ -->
<%@ page import="java.util.Date"%>
<%@ page import="java.util.Calendar"%>

<%!String str1 = "JSP";
	String str2 = "�ȳ��ϼ���!";%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Hello Java</title>
</head>

<body>
		<h2>
		ó�� ������ <%=str1 %>
		</h2>
		<p>
		<%
			out.println(str2 + str1 + "�Դϴ�.  ��������;��~~");
		%>		
		</p>
	
<%
	/* Calendar, SimpleDateFormat ��ü�� Ȱ���� ��¥ ���  */
	Calendar date = Calendar.getInstance();
	SimpleDateFormat today = new SimpleDateFormat("yyyy - MM - dd");
	SimpleDateFormat now = new SimpleDateFormat("hh�� mm�� ss��");
%>
<!-- today�� �� �� ���� now�� �� �� �ʸ� ǥ��  -->
������
<b><%= today.format(date.getTime()) %></b> �Դϴ�.
<br> ���� �ð���
<b><%= now.format(date.getTime()) %></b> �Դϴ�.
</body>
</html>