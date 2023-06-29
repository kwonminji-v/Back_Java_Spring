<%@ page language="java" contentType="text/html; charset=UTF-8"%>
    
<%@ page import = "java.util.ArrayList" %>
<%@ page import="dto.Product" %>
<%@ page import="dao.ProductRepository" %>

<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />
<!-- 
id 속성은 생성된 빈의 이름을 지정, class 속성은 빈의 클래스를 지정 scope속성은 빈의 스코프를 지정
같은 세션내에서는 ProductDAO라는 이름으로 접근 가능한 동일한 인스턴스를 사용할 수 있습니다.
 -->

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min">
<meta charset="UTF-8">
<title>상품 목록</title>

</head>
<body>
<!-- home이라는 메인 bar가 있는 menu.jsp 내용을 포함합니다. -->
	<%@ include file="menu.jsp" %>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				상품 목록
			</h1>
		</div>	
	</div>
	
	<%
	/* ArrayList<Product> 형의 listOfProducts 객체에 productDAO 
		 즉) dao 패키지의 ProducRepository java 파일에 있는 모든 속성값들을 가져옵니다. */

		// getInstance() 메소드 호출의 결과 값을 listOfProducts에 저장
		ProductRepository dao = ProductRepository.getInstance();
		ArrayList<Product> listOfProducts = productDAO.getAllProducts();
	%>
	
	<div class="container">
		<div class="row" align="center">
			<%
				for(int i = 0;  i< listOfProducts.size(); i++){
					Product product = listOfProducts.get(i);
			%>
			
			<div class="col-md-4">
				<%-- <img src="./resources/images/<%=product.getFilename() %>" style="width:100%"> --%>
			<!-- 상품명, 설명, 가격을 출력합니다.  -->
				<img src="./upload/<%=product.getFilename() %>"
				style="width:100%">
				<h3><%=product.getPname() %></h3>
				<p><%=product.getDesctiption() %> </p>
				<p><%=product.getUnitPrice() %>원 </p>
				
         <!-- 상세정보 버튼을 추가로 만듭니다. 클릭하면 product 페이지로 넘어가게 됩니다.
	     ★ 경로?id=를 지정해줘서 얻어온 상품의 id 값들이 나타나는 것입니다.  -->
	     
				<p><a href="./Product.jsp?id=<%=product.getProductId() %>" 
					class="btn btn-secondary" role="button">
						<!-- &raquo; = 특수문자 >> -->
						상세 정보 &raquo;
					</a>
			</div>
			
			<%
				}
			%>
		</div>
		
		<!-- 구분선 -->
		<hr>
	</div>
	
	<%@ include file="footer.jsp" %>
</body>
</html>