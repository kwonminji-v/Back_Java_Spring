package fileupload;

import common.DBConnPool;

import java.util.List;
import java.util.Vector;

public class MyfileDAO extends DBConnPool {
	public int insertFile(MyfileDTO dto) {
		int applyResult = 0;
		try {
			String query = "INSERT INTO myfile ( "
					+ " idx, name, title, cate, ofile, sfile) "
					+ " VALUES ( "
					+ " seq_board_num.nextval, ?, ?, ?, ?, ?)";
			//idx의 값은 시퀀스로 설정되어 nextval로 늘어납니다.
			
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getCate());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getSfile());
			
			applyResult = psmt.executeUpdate();
		}catch (Exception e) {
			System.out.println("INSERT 중 예외 발생");
			e.printStackTrace();
		}
		return applyResult;
	}
	
	
	//파일 목록을 반환하는 메서드
	public List<MyfileDTO> myFileList() {
			
			List<MyfileDTO> fileList = new Vector<MyfileDTO>();
			
			//목록 데이터를 불러올 쿼리문을 작성
			String query = "SELECT * FROM myfile ORDER BY idx DESC";
		
			try {
				
				psmt = con.prepareStatement(query);  //쿼리 준비
				rs = psmt.executeQuery();  // 쿼리 실행
				
				while(rs.next())  {  //생성된 목록 안의 데이터의 수 만큼 반복하는 while 문 작성
					//DTO에 저장
					MyfileDTO dto = new MyfileDTO();
					//SQL 쿼리의 결과에서 첫 번째 컬럼의 값을 가져와서 이를 DTO의 idx 필드에 설정
	                dto.setIdx(rs.getString(1));
	                dto.setName(rs.getString(2));
	                dto.setTitle(rs.getString(3));
	                dto.setCate(rs.getString(4));
	                dto.setOfile(rs.getString(5));
	                dto.setSfile(rs.getString(6));
	                dto.setPostdate(rs.getString(7));
	                
	                fileList.add(dto);
					
				}
			} 
			catch (Exception e) {
					System.out.println("SELECT 시 예외 발생");
					e.printStackTrace();
			}
			return fileList;   //목록을 반환합니다.
	}
	
}