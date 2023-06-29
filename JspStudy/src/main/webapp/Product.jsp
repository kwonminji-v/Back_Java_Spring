<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Product" %>

<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 정보</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
		<%@ include file="menu.jsp" %>
		
		<div class="jumbotron">
			<div class="container">
				<h1 class="display-3">
					상품 정보
				</h1>
			</div>
		</div>
		
		<%
		//getParameter로 id 값을 요청해서 가져온다
			String id = request.getParameter("id");
			Product product = productDAO.getProductById(id);	
		//userBean 태그에서 id 값을 통해 productRepository 클래스의 getProductById() 메서드 호출
		%>
		
		<div class="container">
			<div class="row">
				<div class="col-md-6">
	<!-- ProductRepository.java에 저장한 값들을 가져오는 것  -->
					<h3><%=product.getPname() %></h3>
					<p><%=product.getDesctiption() %></p>
					<p><b>상품 코드: </b></p>
					<span class="bagde badge-danger">
						<%=product.getProductId() %>
					</span>
					<p><b>제조사: </b><%=product.getManufacturer() %>
					<p><b>분류: </b><%=product.getCategory() %>
					<p><b>재고: </b><%=product.getUnitsInStock() %>
					<h4><%=product.getUnitPrice() %>원</h4>
					<p><a href="#" class="btn btn-info">상품 주문  &raquo;</a>
					<a href="./Products.jsp" class="btn btn-secondary">상품 목록  &raquo;</a>
				</div>
			</div>
			<hr>
		</div>
		
		<%@ include file="footer.jsp" %>
</body>
</html>
