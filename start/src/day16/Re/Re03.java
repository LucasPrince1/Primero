package day16.Re;

import java.util.*;

public class Re03 {

	public Re03() {
		
		HashMap map = new HashMap();
		//데이터 넣어주기
		map.put("제니","123");
		map.put("리사","143");
		map.put("로제","128");
		map.put("지수","646");
		
		//그냥 따로따로 출력해보기
		System.out.println(map.get("제니"));
		
		System.out.println("----------------------------");
		
		//키값만 추출1
		Set key = map.keySet();
		Iterator itor1 = key.iterator();
		while(itor1.hasNext()) {
			System.out.println(itor1.next());
		}
		
		
		System.out.println("----------------------------");
		
		//데이터만 추출
		Collection col = map.values();
		Iterator itor = col.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		
		System.out.println("----------------------------");
			
		
	}

	public static void main(String[] args) {
		new Re03();
	}

}
