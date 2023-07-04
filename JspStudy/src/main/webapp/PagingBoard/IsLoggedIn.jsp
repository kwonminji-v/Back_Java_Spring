<%@ page import = "study_0626.JSFunction_0628"  %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<%
if (session.getAttribute("UserId") == null) { 
    JSFunction_0628.alertLocation("로그인 후 이용해주십시오.", 
            "../Session/LoginForm.jsp", out); 
    return;   }
%>