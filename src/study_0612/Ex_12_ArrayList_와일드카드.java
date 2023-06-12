package study_0612;

import java.util.ArrayList;
import java.util.List;
import model.Study_0612_Ex_12_ProductArrayList;


public class Ex_12_ArrayList_와일드카드 {
//ArrayList 객체를 List로 형을 맞추고 와일드카드를 활용해 저장된 요소들의 객체 정보를 맞춤
	
	
	
//class Test {
	public void getProductText_Set(List<?> list) {
			//데이터를 저장할 때 객체와 객체의 변수들을 생성한다.
			//String은 null로 int는 0으로 초기화
			Study_0612_Ex_12_ProductArrayList prod = null;
				String code = null;
				String name = null;
				String color = null;
				String qty = null;
				
				for (int i = 0; i < list.size(); i++) {
					//전송받은 list객체는 List 타입이므로 형변환이 필요
						prod = (Study_0612_Ex_12_ProductArrayList) list.get(i);
					//형변환 후 내부에 저장된 변수들도 형변환해 데이터 획득
						code = (String) prod.getCode();
						name = (String) prod.getName();
						color = (String) prod.getColor();
						qty = (String) prod.getQty();
						
						System.out.println("제품 번호 = " + code);
						System.out.println("제품 이름 = " + name);
						System.out.println("제품 색상 = " + color);
						System.out.println("제품 수량 = " + qty);
						
				}
	}
	public static void main(String[] args) {
				ArrayList<Study_0612_Ex_12_ProductArrayList<String>> pList = new ArrayList<>();
				
				Study_0612_Ex_12_ProductArrayList<String> p1 = new Study_0612_Ex_12_ProductArrayList<>("0001", "스마트폰", "블랙", "100");
				Study_0612_Ex_12_ProductArrayList<String> p2 = new Study_0612_Ex_12_ProductArrayList<>("0002", "스마트 TV", "흰색", "200");
				Study_0612_Ex_12_ProductArrayList<String> p3 = new Study_0612_Ex_12_ProductArrayList<>("0003", "노트북", "은색", "300");
				
				pList.add(p1);				pList.add(p2);			pList.add(p3);
				
				Ex_12_ArrayList_와일드카드 p = new Ex_12_ArrayList_와일드카드();
				p.getProductText_Set(pList);
	}

}
