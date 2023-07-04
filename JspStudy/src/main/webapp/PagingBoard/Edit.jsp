<%@ page import="model.board.BoardDAO"%>
<%@ page import="model.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./IsLoggedIn.jsp"%>

//수정할 수 있는 페이지에서도 로그인 상태가 유지 되는지가 필요하기 때문에 IsLoggedIn.jsp의 임포트가 필요

<%
//로그인 한 사용자가 게시물 작성자 본인이 맞는지 확인한 후 아니라면 JSFunction에
//만들어진 alertBack 메서드를 이용해 경고창을 보여줍니다.
/* 	
public static void alertBack(String msg, JspWriter out) {
		try {
			String script = ""	// 삽입할 자바스크립트 코드
							+ "<script>"
							+ "    alert('" + msg + "');"
							+ "    history.back();"
							+ "</script>";
			out.print(script);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
*/

String num = request.getParameter("num"); // 일련번호 받기
BoardDAO dao = new BoardDAO(application); // DAO 생성 
BoardDTO dto = dao.selectView(num); // 게시물 가져오기
String sessionId = session.getAttribute("UserId").toString(); // 로그인 ID 얻기 

if (!sessionId.equals(dto.getId())) { // 본인인지 확인 
	JSFunction_0628.alertBack("작성자 본인만 수정할 수 있습니다.", out);
	return;
}
dao.close(); // DB 연결 해제

%>
<meta charset="UTF-8">
<title>회원제 게시판</title>

<script type="text/javascript">

	function validateForm(form) { // 폼 내용 검증
		if (form.title.value == "") {
			alert("제목을 입력하세요.");
			form.title.focus();
			return false;
		}
		if (form.content.value == "") {
			alert("내용을 입력하세요.");
			form.content.focus();
			return false;
		}
	}
</script>

<jsp:include page="../Common/Link.jsp" />
<h2>회원제 게시판 - 수정하기(Edit)</h2>

<form name="writeFrm" method="post" action="EditProcess.jsp"
	❹="" onsubmit="return validateForm(this);">
	<input type="hidden" name="num" value="<%=dto.getNum()%>"> ❺
	<table border="1" width="90%">
		<tbody>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" style="width: 90%;"
					value="<%=dto.getTitle()%>"> ❻</td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="content" style="width: 90%; height: 100px;">  <%=dto.getContent()%></textarea>
					❼</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">작성 완료</button>
					<button type="reset">다시 입력</button>
					<button type="button" onclick="location.href='List.jsp';">
						목록 보기</button>
				</td>
			</tr>
		</tbody>
	</table>
</form>