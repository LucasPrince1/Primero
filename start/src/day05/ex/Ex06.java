package day05.ex;
/*
문제 6 ]
	랜덤하게 정수를 컴퓨터가 만들어 내면 [100까지의 정수]
	그 수를 알아맞추는 게임을 만드세요.
	
	예 ]
		발생숫자 : 54
		사용자입력숫자 : 45
		
		==> "입력한 수가 더 작습니다."
		로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...
		
		횟수도 같이 출력되게 하세요.
*/

import java.util.*;
public class Ex06 {

	public static void main(String[] args) {

		//컴퓨터가 랜덤하게 만들어내는 수
		int com = (int)(Math.random()*(100-1+1)+1);
		
		Scanner sc = new Scanner(System.in);
		//입력장치 준비
		
		for(int i=0; i<10; i++) {
		//while(true) {
		System.out.print("100이하의 수를 입력하시오 : ");
		//입력메세지 출력
		
		//변수에 입력값 기억
		int user = sc.nextInt();
		
		if(user-com!=0 && user>com) {
			System.out.println("입력한 수가 더 큽니다. \n 횟수 : " + (i+1));
			
		} else if (com>user && user-com!=0) {
			System.out.println("입력한 수가 더 작습니다. \n 횟수 : " + (i+1));
			
		} else if (user==com) { 
			System.out.println("정답입니다!");
			break;
		  
		}
		  if(i ==9) {
			System.out.println("패배하였습니다.ㅠㅠ");
		}
		
		
		}
	}
		
	}


