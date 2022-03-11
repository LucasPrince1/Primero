package day07;

/*
  10개의 문자를 기억할 배열을 만들고
  'A' ~ 'J'까지 차례로 입력하고 출력하세요.
 */

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		char[] ch = new char[10];
		/*
		  char ch[];
		  
		  ch= new char[10]; 와 같음
		 */
		
		// 각 방에 차례로 접근해서 하나씩 문자를 채워준다.
		for(int i=0; i < ch.length; i++) {
			// 문자만들고
			char munja = (char)('A' + i); //i라는 4바이트 정수와 더했으므로 전체는 정수타입
			// 만들어진 문자를 배열에 채워넣는다.
			munja = ch[i];
		}

		//배열의 내용 확인
		System.out.println(Arrays.toString(ch));
		
		//하나씩 꺼내서 출력
		for(char munja : ch) {
			System.out.print(munja + " | ");
		}
		
	}

}
