package day07;

import java.util.Arrays;
public class Test01 {

	public static void main(String[] args) {
		/*
		 정수 6개를 관리할 배열 arr을 만들고
		 1~6까지 채워서 한개씩 꺼내서 출력
		 
		 배열변수 선언
		 
		 배열변수의 선언형식
		 	데이터타입[] 변수;
		 *//*
		int[] arr;
		//배열 변수 초기화
		arr = new int[6];
		
		//출력
		// 참고 : 배열의 길이를 알아내는 방법 : 배열.length
		int len = arr.length;
		for(int i=0 ; i<len; i++) {
			int no = 
		}
		/*둘리 멤버를 추가해서 출력하세요.
		 참고]
		 	배열은 한번 만들어지면 크기와 타입을 수정할 수 없다.
		 	따라서 데이터의 갯수가 수정이 필요하면
		 	배열을 다시 만들어서 변수에 기억시켜야 한다.
		 	
		 
		 */
		String[] blackpink = new String[4];
				
		blackpink[0] = "제니";
		blackpink[1] = "지수";
		blackpink[2] = "로제";
		blackpink[3] = "리사";
		
		String[] tmp = new String[5];
		for(int i =0; i<4; i++) {
			tmp[i] = blackpink[i];
		}
		tmp[4] = "둘리";
		
		blackpink = tmp;
		
		for(String name : blackpink) {
			//의미 : blackpink의 데이터를 순차적으로 하나씩 꺼내서 name 변수에 기억시키세요
			
			System.out.print(name + " ");
		}
		
		
	}

}
