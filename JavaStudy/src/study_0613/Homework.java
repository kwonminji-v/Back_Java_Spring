package study_0613;

import java.util.HashMap;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다음과 같이 fruit라는 배열에 과일 이름이 저장되어 있을 때 콘솔에 각 과일 개수를 차례대로 출력하라. 
		
		String [] fruit={"사과","바나나","귤","수박","사과",
                "사과","귤","수박","수박","바나나",
                "귤","사과","사과","수박","귤","바나나",
                "바나나","사과","귤","귤"};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		// 과일 개수를 세어보는 코드
		for (String f : fruit) {
			if(map.containsKey(f)) {
				
				//fruit 배열안의 중복값이 있다면 개수를 올려준다.
				int count = map.get(f);
				map.put(f,  count + 1);
			}else {
				// HashMap에 과일이 없는 경우
				map.put(f, 1);
			}
		}
		// 과일의 개수 출력
		for (String fru : map.keySet()) {
			int count = map.get(fru);
			System.out.println(fru + ":" + count);
		}
	}

}
