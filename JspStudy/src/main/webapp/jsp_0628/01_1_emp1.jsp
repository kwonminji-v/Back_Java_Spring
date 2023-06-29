<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import ="java.sql.*" %>

<%

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String pass = "tiger";
	Connection conn = null;           Statement stmt = null;
	ResultSet rs = null;
	
	
	try {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, pass);
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM EMP");
		
	%>
	
	<table border = "1">
			<tr>
				<th>EMPNO</th>						<th>ENAME</th>				<th>JOB</th>
				<th>MGR</th>								<th>HIREDATE</th>			<th>SAL</th>		
				<th>COMM</th>							<th>DEPTNO</th>				
			</tr>
			<%  while(rs.next()) { %>
			<tr>
					<td><%= rs.getInt("EMPNO")  %> </td>
					<td><%= rs.getString("ENAME")  %> </td>
					<td><%= rs.getString("JOB")  %> </td>
					<td><%= rs.getInt("MGR")  %> </td>
					<td><%= rs.getDate("HIREDATE")  %> </td>
					<td><%= rs.getDouble("SAL")  %> </td>
					<td><%= rs.getDouble("COMM")  %> </td>
					<td><%= rs.getInt("DEPTNO")  %> </td>
			</tr>
			<% }  %>
</table>
<%
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if( rs != null) try { rs.close(); } catch (Exception e) { }
		if( stmt != null) try { stmt.close(); } catch (Exception e) { }
		if( conn != null) try { conn.close(); } catch (Exception e) { }
	}
	%>

	<%--
	
	��ũ��Ʋ�� <% %> : �ڹ� �ڵ� ����
	�ڹٿ��� �ϴ� ��� ���� ���⼭ �� �� �ֽ��ϴ�. (if��, for��, while��, switch�� ��� )
	
	ǥ����
	<% = %> : ���� ���, ���� ���, �޼ҵ� ȣ�� ���� ���� 
	�� �����̳ʿ� ���� out.print �������� ������ŵ�ϴ�.
	��, <%= ����� �� %> �� out.print(����� ����)�� ������ �����Դϴ�.
	
	������
	<%@ %> : ��Ƽ�� �±�, �ܺ� ������ �±� ���̺귯���� Ȱ����, import ���� ���ҵ� ����
	contentType  , pageEncoding�� ����Ͽ� ����Ÿ�԰� ���ڵ��� ������
	contentType ���ڵ��� JSP������ HTML ������ ��ȯ�� �� ����Ǵ� ���ڵ�
	pageEncoding ���ڵ��� �׳� JSP���Ͽ� ����Ǵ� ���ڵ��Դϴ�. 
	
	����
	<%! %> : �Լ� ���� ���� ���� ���⼭ �� �� �ֽ��ϴ�.
	
	�ּ� <!--  --> : HTML �ּ� (�ҽ����⸦ �ϸ� ������ �ʽ��ϴ�.)
	JSP �ּ� ctrl + shift + / : ����Ű 
	
  --%>  
	
	