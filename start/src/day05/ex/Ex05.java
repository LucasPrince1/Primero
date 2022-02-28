package day05.ex;
/*
문제 5 ]
	컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
	
	컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
	가위, 바위, 보로 가정하고
	사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
	
	누가 이겼는지를 확인하는 프로그램을 작성하세요.
	
*/

import java.util.*;
public class Ex05 {

	public static void main(String[] args) {

		int com = (int)(Math.random() * (3-1+1)+1);
			
		
		Scanner sc = new Scanner(System.in); //입력도구 준비
		
		System.out.print("1 ~ 3 사이의 숫자를 입력하시오. : ");
		//입력메세지 출력
		int user = sc.nextInt();
		
		String fin = "승";
		
		 if (com == user) { 
			 
		 }
		
		
		
		//1가위 2 바위 3보  2 > 1 , 3 > 2 , 1 > 3
		
		
	}

}
