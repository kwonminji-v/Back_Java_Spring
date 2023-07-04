<%@ page import="model.board.BoardDAO"%>
<%@ page import="model.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IsLoggedIn.jsp"%>
<%
String title = request.getParameter("title");
String content = request.getParameter("content");

BoardDTO dto = new BoardDTO();
dto.setTitle(title);
dto.setContent(content);
dto.setId(session.getAttribute("UserId").toString());

BoardDAO dao = new BoardDAO(application);
//int iResult = dao.insertWrite(dto);
// 더미 데이터를 삽입하기 위한 코드
 int iResult = 0;

 for (int i = 1; i <= 100; i++) {
     dto.setTitle(title + "-" + i); 
     iResult = dao.insertWrite(dto);
 } 
dao.close();

if (iResult == 1) {
	response.sendRedirect("List.jsp");
} else {
	JSFunction_0628.alertBack("글쓰기에 실패하였습니다.", out);
}
%>