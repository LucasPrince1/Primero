package day05.ex;
/*
문제 4 ]
	전기요금을 계산해주는 프로그램을 작성하세요.
	
	전기요금표
		
				사용자코드		기본요금		사용요금
		가정용		1			3800			245
		산업용		2			2400			157
		교육용		3			2900			169
		상업용		4			3200			174
				
	전기요금 = 기본요금 + 사용량 * 사용요금
		
	사용자 코드와 사용량을 입력하면
	전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
*/

import java.util.*;
public class Ex04 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	while(true) {
	System.out.print("코드를 입력해주세요 : ");
	
	int code = sc.nextInt();
	
	if(code ==0) {
		System.out.println("프로그램을 종료합니다.");
		break;
	}
	
	System.out.print("사용량을 입력해주세요 : ");
	
	int used = sc.nextInt();
	int fee ;
	
	switch(code) {	
	case 1 : 
		fee = 3800 + used*245 ;
		System.out.println("전기요금은 " + fee + "원 입니다.");
		break;
	case 2 :
		fee = 2400 + used*157 ;
		System.out.println("전기요금은 " + fee + "원 입니다.");
		break;
	case 3 :
		fee = 2900 + used*169 ;
		System.out.println("전기요금은 " + fee + "원 입니다.");
		break;
	case 4 :
		fee = 3200 + used*174 ;
		System.out.println("전기요금은 " + fee + "원 입니다.");
		break;
		
	}
	
	System.out.println("");
		}
		
	
	}

}
