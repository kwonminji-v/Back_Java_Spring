<%@page import="study_0626.JSFunction_0628"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model.board.BoardDTO" %>
<%@ page import = "model.board.BoardDAO" %>
<%@ include file = "./IsLoggedIn.jsp %>

<% 
//수정된 내용을 저장
String num = request.getParameter("num");
String title = request.getParameter("title");
String content = request.getParameter("content");

//DTO에 수정된 내용을 저장
BoardDTO dto = new BoardDTO();
dto.setName(num);
dto.setTitle(title);
dto.setContent(content);

//DB에 반영되도록 함
BoardDAO dao = new BoardDAO(application);
int affected = dao.updateEdit(dto);
dao.close();

//수정 성공 / 실패 여부 판단 로직
if (affected == 1) {
	//성공 시 상세보기 페이지로 이동하는 로직
	response.sendRedirect("View.jsp?num=" + dto.getNum());
}
else {
	// 실패 시 이전 페이지로 이동
	JSFunction_0628.alertBack("수정에 실패하였습니다.", out);
}
%>