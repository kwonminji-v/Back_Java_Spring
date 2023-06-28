<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
	
	<%
	String chkVal = request.getParameter("inactiveTodya");
	
	if (chkVal != null && chkVal.equals("1")) {
		
			Cookie cookie = new Cookie("PopupClose", "off");  //쿠키를 생성합니다.
			cookie.setPath(request.getContextPath());  // 경로를 설정해줍니다.
			cookie.setMaxAge(60*60*24);  //유지 기간을 설정합니다.
			response.addCookie(cookie);  //응답 객체에 추가합니다.
			out.println("쿠키 : 하루동안 열지 않습니다.");
	}
	
	//trimDirectiveWhitespaces = "true" 주위의 공백을 제거하도록 지정하는 역할을 합니다.
	%>
