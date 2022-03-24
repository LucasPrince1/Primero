package day16.Re;

import java.util.HashSet;

/*
 가로의 길이가 같으면 같은 사각형으로 한다
 
 ==> HashSet을 만들어서 자연스럽게 걸러내기
 */
public class Re02 {

	public Re02() {
		
		// 4개 네모 객체 생성
		Nemo m1 = new Nemo(15,20);
		Nemo m2 = new Nemo(11,22);
		Nemo m3 = new Nemo(15,33);
		Nemo m4 = new Nemo(11,11);
		
		// HashSet 생성
		
		HashSet set = new HashSet();
		
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		
		//출력
		for(Object o : set) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Re02();
	}

}
