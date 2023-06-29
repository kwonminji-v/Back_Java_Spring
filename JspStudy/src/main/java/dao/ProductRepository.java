package dao;

import java.util.ArrayList;

import dto.Product;

/*
dao Data Access Object의 약자
데이터베이스나 다른 데이터 저장소에 접근하여 데이터를 조작하는 역할입니다.
DAO는 데이터베이스와의 통신을 담당하기 때문에 데이터베이스 연결, 쿼리 실행, 트랜잭션 처리 등과 관련된 로직을 포함합니다.
데이터 생성 (Create) : 데이터 조회 (Read) : 데이터 수정 (Update) : 데이터 삭제 (Delete) :
INSERT 쿼리      SELECT 쿼리를 실행   UPDATE 쿼리를 실행   DELETE 쿼리를 실행	 
*/
public class ProductRepository {
	// 통합 저장소 컬렉션 리스트
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	//ProductRepository 클래스의 기본 생성자에 대한 객체 매개변수인 instance를 생성
	private static ProductRepository instance = new ProductRepository();
	
	//생성된 객체변수인 instance에 대한 Getter() 메서드 작성 
	public static ProductRepository getInstance() {
				return instance;
	}
	
	// 생성자
	public ProductRepository() {
		// phone 제품 객체 생성하여 각 데이터들을 저장합니다.
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDesctiption("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000); // 재고 수량
		phone.setCondition("New"); // 신상
		phone.setFilename("P1234.png");

		// 노트북 제품 객체 생성하여 각 데이터 저장
		Product notebook = new Product("P1235", "LG PC 그램", 1500000);
		notebook.setDesctiption("13.3-inch, IPS LED display, 5rd Generation notebook. Inter Core processors");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished"); // 재생품
		phone.setFilename("P1235.png");

		// 태블릿 제품 객체 생성하여 각 데이터 저장
		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDesctiption("212.8*125.6*6.6mm, Super AMOLEED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsum");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old"); // 중고품
		phone.setFilename("P1236.png");
		
		
		//생성한 각 객체를 통합 저장소 컬렉션 리스트에 저장
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}

	//통합 저장소에 저장된 모든 데이터를 컬렉션 리스트를 통째로 반환하는 메서드
	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}

	//상품 상세 정보를 가져오는 메소드를 추가
	public Product getProductById(String productId) {
		Product productById = null;  //반환 값 넣을 변수 생성 및 초기화

		//통합 저장소 컬렉션 리스트의 데이터 개수만큼 반복
		for (int i = 0; i < listOfProducts.size(); i++) {
			//검사할 데이터 담을 임시 변수 생성 및 리스트의 i번째 데이터 저장
			Product product = listOfProducts.get(i);
			//저장한 데이터가 비어있지 않고, 해당 데이터의 productId가 비어있지 않고, 해당 데이터의 productId와 전달 받은 productId가 같으면
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				//반환 값 넣을 변수에 해당 데이터를 저장 후
				productById = product;
				break;  //반복문을 탈출합니다.
			} //listOfProducts에 저장된 모든 상품 목록에서 상품 아이디와 일치하는 상품을 가져옵니다.  
		}
		//저장한 데이터를 반환합니다. 
		return productById;
	}
	
	//객체 변수 listOfProducts에 새로운 상품 정보를 등록하는 addProduct() 메소드 생성
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
}