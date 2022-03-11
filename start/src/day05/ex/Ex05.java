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

		Scanner sc = new Scanner(System.in); //입력도구 준비
		
		while(true) {
			
		int com = (int)(Math.random() * (3-1+1)+1); //컴퓨터의 랜덤숫자
		
		System.out.print("1 ~ 3 사이의 숫자를 입력하시오. : ");
		//입력메세지 출력
		
		int user = sc.nextInt();
		
		if(user==0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		System.out.println("컴퓨터 : " + com);
		
		//String fin = "";
				
		 if(com == user) { //fin = "무승부";
			 System.out.println("무승부");			 
		 } else if(com > user && (com-user)==1) {//fin = "컴퓨터 승";
			System.out.println("컴퓨터 승");
		 } else if(com > user && (com-user)==2) {//fin = "사용자 승";
			System.out.println("사용자 승");
		 } else if(com < user && (user-com)==1) {//fin = "사용자 승";
			System.out.println("사용자 승");
		 } else if(com < user && (user-com)==2 ) {//fin = "컴퓨터 승";
			System.out.println("컴퓨터 승");
		 }
		
		
		 // System.out.println(fin);
		
		// 1 가위 2 바위 3 보  2 > 1 , 3 > 2 , 1 > 3
		
		}
	}

}
