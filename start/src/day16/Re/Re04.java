package day16.Re;

import java.util.*;

public class Re04 {

	public Re04() {
		//4명의 학생 생성
		Student s1 = new Student("손" , 86, 56, 59);
		Student s2 = new Student("곽" , 88, 66, 89);
		Student s3 = new Student("호" , 36, 58, 49);
		Student s4 = new Student("메" , 56, 96, 79);
		
		HashMap map = new HashMap();
		//맵에 데이터 채우기
		map.put("손", s1);
		map.put("곽", s2);
		map.put("호", s3);
		map.put("메", s4);
		
		//키 값 출력
		Set keys = map.keySet();
		Iterator itor = keys.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		//Iterator 와 while 쓰지 않고 for each로 출력
		//키와 데이터 값 모두 출력
		for(Object key : keys) {
			Object value = map.get(key);
			System.out.println("*** " + key + " ***\n" + value);
		}
		
	}

	public static void main(String[] args) {
		new Re04();
	}

}
