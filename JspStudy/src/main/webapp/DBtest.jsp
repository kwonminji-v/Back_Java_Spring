<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import ="java.sql.*"%>

<%

//�� db ���ӿ� ����� conn ����
Connection conn = null;

//����Ŭ ����̹� ��� ����
String driver = "oracle.jdbc.driver.OracleDriver";

//�� db�� ���� ��� ���� 
String url = "jdbc:oracle:thin:@localhost:1521:xe";

//���� ����, ���� ���� ��� �� ���� ����
Boolean connect = false;

//db ���� �ڵ�� �ݵ�� try-catch �� �ȿ� ����� �ϸ�
try {
	//����Ŭ ����̹� ����
	Class.forName(driver);
	//�� db ����
	conn = DriverManager.getConnection(url, "scott", "tiger");
	//���� ���� �� true�� ����
	connect = true;
	//���� ����, ���� ���� : �׻� db�� ����Ǿ� ������ ���� ���� �� ������ �浹�� �Ͼ�� ����
	conn.close();
}catch (Exception e) {
	//���� ���� �� false ��� ���� ó�� ����
	connect = false;
	e.printStackTrace();
}

%>

<%
if (connect == true) {
%>
����Ǿ����ϴ�.
<%
} else {
%>
���ῡ �����Ͽ����ϴ�.
<%
}
%>