package model.board;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.servlet.ServletContext;

import common.JDBConnect;

public class BoardDAO extends JDBConnect {
   public BoardDAO(ServletContext application) {
      super(application);
   }

   
   
   
   // board 테이블에 저장된 게시물의 개수를 반환합니다. 목록에서 번호를 출력하기 위해 사용됩니다.
   public int selectCount(Map<String, Object> map) {
      int totalCount = 0; // 결과(게시물 수)를 담을 변수
      // 게시물 수를 얻어오는쿼리문 작성
      String query = "SELECT COUNT(*) FROM board";
      if (map.get("searchWord") != null) {
         query += " WHERE " + map.get("searchField") + " " + " LIKE '%" + map.get("searchWord") + "%'";
      }
      try {
         stmt = con.createStatement(); // 쿼리문 생성
         rs = stmt.executeQuery(query); // 쿼리 실행
         rs.next(); // 커서를 첫번째 행으로 이동
         totalCount = rs.getInt(1); // 첫 번째 컬럼 값을 가져옴
      } catch (Exception e) {
         System.out.println("게시물 수를 구하는 중 예외 발생");
         e.printStackTrace();
      }
      return totalCount;
   }


   
   // 검색 조건에 맞는 게시물 목록을 반환합니다.
   public List<BoardDTO> selectList(Map<String, Object> map) {
      List<BoardDTO> bbs = new Vector<BoardDTO>();
      // 결과(게시물목록)를 담을 변수
      String query = "SELECT * FROM board";
      if (map.get("searchWord") != null) {
        query += " WHERE " + map.get("searchField") + " " + " LIKE '%" + map.get("searchWorld") + "%' ";
      }
      query += " ORDER BY num DESC ";
      try {
         stmt = con.createStatement(); // 쿼리문 생성
         rs = stmt.executeQuery(query); // 쿼리 실행
         
         while(rs.next()) { // 결과를 순회하며
            // 한 행(게시물 하나)의 내용을 DTO에 저장
            BoardDTO dto = new BoardDTO();
            dto.setNum(rs.getString("num"));            // 일렬번호
            dto.setTitle(rs.getString("title"));            // 제목
            dto.setContent(rs.getString("content"));      // 내용
            dto.setPostdate(rs.getDate("postdate"));   // 작성일
            dto.setId(rs.getString("id"));      // 작성자 id
            dto.setVisitcount(rs.getString("visitcount")); // 조회수
            bbs.add(dto); // 결과 목록에 저장
         }
      } catch (Exception e) {
         System.out.println("게시물 조회 중 예외 발생");
         e.printStackTrace();
      }
      return bbs; //쿼리결과를 모두담은 List컬렉션을 jsp로 반환한다
   }
   
   
   
   public int insertWrite(BoardDTO dto) {
       int result = 0;
       try {
           // INSERT 쿼리문 작성 ❷
           String query = "INSERT INTO board ( "  + " num,title,content,id,visitcount) "  + " VALUES ( "  + " seq_board_num.NEXTVAL, ?, ?, ?, 0)"; 
           //JDBC의 PrepareStatement의 매개변수 인덱싱은 1부터 시작합니다.
           psmt = con.prepareStatement(query); // 동적 쿼리 
           psmt.setString(1, dto.getTitle()); 
           psmt.setString(2, dto.getContent()); 
           psmt.setString(3, dto.getId());
           result = psmt.executeUpdate(); 
       }
       catch (Exception e) {
           System.out.println("게시물 입력 중 예외 발생"); 
           e.printStackTrace();
       }
       return result; 
   }

   
   
   
   // 지정한 게시물을 찾아 내용을 반환합니다.
   public BoardDTO selectView(String num) { 
       BoardDTO dto = new BoardDTO();
       // 쿼리문 준비 
       /* 멤버 테이블과 board 테이블의 사용자의 id가 같은 값을 보여준다.
             board 테이블은 전체, 멤버 테이블은 사용자 이름만 선택한다.
             왜냐하면 board 테이블에 작성자 이름이 없기 때문이다.
             조건은 사용자가 클릭한 게시글의 num값과 동일한 글을 보여준다.*/
       String query = "SELECT B.*, M.name " 
               + " FROM member M INNER JOIN board B " 
               + " ON M.id=B.id "
               + " WHERE num=?";
       try {
           psmt = con.prepareStatement(query);
           psmt.setString(1, num); // 인파라미터를 일련번호로 설정 
           rs = psmt.executeQuery(); // 쿼리 실행 
           // 결과 처리
           if (rs.next()) { 
               dto.setNum(rs.getString(1)); 
               dto.setTitle(rs.getString(2)); 
               dto.setContent(rs.getString("content")); 
               dto.setPostdate(rs.getDate("postdate")); 
               dto.setId(rs.getString("id")); 
               dto.setVisitcount(rs.getString(6)); 
               dto.setName(rs.getString("name")); 
           }
       }
       catch (Exception e) {
           System.out.println("게시물 상세보기 중 예외 발생");
           e.printStackTrace();
       }
       return dto; 
   }
   
   
   
   // 지정한 게시물의 조회수를 1 증가시킵니다.
   public void updateVisitCount(String num) { 
       // 쿼리문 준비 
	   /*
	    board 테이블을 수정하는데 visitcount의 값을 +1 해주는 문장을 작성합니다.
	    num은 매개변수로 넘어온 값이고 즉 , 사용자가 클릭한 게시글의 num 값이다.
	    */
       String query = "UPDATE board SET " + " visitcount=visitcount+1 " + " WHERE num=?";
       try {
           psmt = con.prepareStatement(query);
           psmt.setString(1, num); // 인파라미터를 일련번호로 설정 
           psmt.executeQuery(); // 쿼리 실행 
       }
       catch (Exception e) {
           System.out.println("게시물 조회수 증가 중 예외 발생");
           e.printStackTrace();
       }
   } 
   
   public int updateEdit(BoardDTO dto) { 
       int result = 0;
       try {
           // 쿼리문 템플릿 
           String query = "UPDATE board SET "  + " title=?, content=? " + " WHERE num=?";
           // 쿼리문 완성 
           psmt = con.prepareStatement(query); 
           psmt.setString(1, dto.getTitle()); 
           psmt.setString(2, dto.getContent()); 
           psmt.setString(3, dto.getNum());
           // 쿼리문 실행 
           result = psmt.executeUpdate();
       }
       catch (Exception e) {
           System.out.println("게시물 수정 중 예외 발생"); 
           e.printStackTrace();
       }
       return result; // 결과 반환 
   }
}