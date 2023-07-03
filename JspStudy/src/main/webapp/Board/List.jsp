
<%@ page import="java.util.*"%>
<%--     <%@ page import="java.util.List" %>
    <%@ page import="java.util.HashMap" %>
    <%@ page import="java.util.Map" %> --%>
<%@ page import="model.board.BoardDAO"%>
<%@ page import="model.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
// DAO를 생성해 DB에 연결
BoardDAO dao = new BoardDAO(application);

// 사용자가 입력한 검색 조건을 Map에 저장
Map<String, Object> param = new HashMap<String, Object>();
String searchField = request.getParameter("seachField");
String searchWord = request.getParameter("seachWord");
if (searchWord != null) {
   param.put("searchField", searchField);
   param.put("seachWord", searchWord);
}
int totalCount = dao.selectCount(param); // 게시물 수 확인
List<BoardDTO> boardLists = dao.selectList(param); // 게시물 목록 받기
dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
</head>
<body>
   <jsp:include page="../Common/Link.jsp" />
   <!-- 공통 링크 -->
   <h2>목록 보기(List)</h2>
   <!-- 검색폼 -->
   <form method="get">
      <table border="1" width="90%">
         <tr>
            <td align="center"><select name="searchField">
                  <option value="title">제목</option>
                  <option value="content">내용</option>
            </select> <input type="text" name="searchWord" /> <input type="submit"
               value="검색하기" /></td>
      </table>
   </form>
   <!-- 게시물 목록 테이블(표) -->
   <table border="1" width="90%">
      <!-- 각 컬럼의 이름 -->
      <tr>
         <th width="10%">번호</th>
         <th width="50%">제목</th>
         <th width="15%">작성자</th>
         <th width="10%">조회수</th>
         <th width="15%">작성일</th>
      </tr>
      <!-- 목록의 내용 -->
      <%
      if (boardLists.isEmpty()) {
         // 게시물이 하나도 없을 때
      %>
      <tr>
         <td colspan="5" align="center">등록된 게시물이 없습니다😜</td>
      </tr>
      <%
      } else {
         // 게시물이 있을 때
         int virtualNum = 0; // 화면상에서의 게시물 번호
         for(BoardDTO dto : boardLists){
            virtualNum = totalCount--; // 전체 게시물 수에서 시작해 -1씩 감소
      %>
      <tr align="center">
      <td><%=virtualNum %></td>    <!-- 게시물 번호 --> 
      <td align="left">   <!-- 제목(+하이퍼링크) -->
      <a href="View.jsp?num=<%=dto.getNum() %>"><%=dto.getTitle() %></a>
      <!-- 제목은 상세보기 페이지로 이동하기 위한 링크  추가 -->
      </td>
      <!-- 작성자 아이디 -->
      <td align="center"><%= dto.getId() %>            
      <!-- 조회수 -->
      <td align="center"><%= dto.getVisitcount() %>   
      <!-- 작성일  --> 
      <td align="center"><%= dto.getPostdate() %> 
      </td>
<%
         }
      }
%>      
   </table>
   <!-- 목록 하단의 [글쓰기] 버튼 -->
   <table border="1" width="90%">
   <tr align="right">
   <td><button type="button" onclick="location.href='Write.jsp';">글쓰기</button>
   </td>
   </table>
</body>
</html>
<!-- 번호"란에서 보이는 "1" virtualNum이 출력하는 값
게시판 페이지가 로드될 때마다 totalCount에서 1씩 뺴줌으로써
virtualNum이 감소하게 됩니다. 따라서 최신 게시물이 가장 큰 번호를 갖고,
오래된 게시물은 작은 번호를 갖게 됩니다. 

 dto.getNum()에서 getNum()이 반환하는 값은
 오라클 데이터베이스(혹은 다른 종류의 SQL 데이터베이스)에서
 게시물 고유하게 식별하는 값입니다
-->