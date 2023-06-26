package study_0526;

public class Test_Method_10 {

	public static void main(String[] args) {
		
		//객체의 생성
		ProductVo_9 product = new ProductVo_9();
		
		//함수를이용하여 속성 값의 저장
		product.setProductNo("a001");
		product.setProductName("아메리카노");
		product.setPrice(3800);

		String productNo = product.getProductNo();
		String productName = product.getProductName();
		int price = product.getPrice();
		
		System.out.println("productNo = " + productNo);
		System.out.println("productName = " + productName);
		System.out.println("price  = " + price);
		
		//동적 파라미터의 사용
		product.print("아메리카노" , "카페모카" , "카페라떼");
	}

}
