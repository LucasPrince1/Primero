package day05.ex;

import java.util.Scanner;

/*
	문제 8 ]
		숫자형식의 다섯자리 정수형태 문자열을 입력받아서
		각자리 수의 합을 구하는 프로그램을 작성하세요.
		
		문자열로 입력받아서 문자로 변환후 처리하세요.
		
		힌트]
		'0'을 숫자로 변환하는 방법
		 '0' - '0'
		 '1' - '0' 
 */
import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력도구준비
		
		System.out.print("다섯자리의 숫자를 입력하세요 : "); //입력메세지 출력
				
		String str = sc.nextLine(); //입력값 변수에 기억
		
		char ch1 = str.charAt(0); //문자열의 각 부분을 문자char로 변환하여 기억
		char ch2 = str.charAt(1); 
		char ch3 = str.charAt(2); 
		char ch4 = str.charAt(3); 
		char ch5 = str.charAt(4); 
		
		System.out.println((ch1-'0')+(ch2-'0')+(ch3-'0')+(ch4-'0')+(ch5-'0')); 
 	   
		
		//문자 > 정수
		/*
	     String sno = sc.nextLine();
	     
	     int len = sno.length();
	     
	     int sum = 0;
	     
	     for(int i=0; i<len; i++){
	    //각 자리수를 문자로 꺼낸다.
	     char ch = sno.charAt(i);

 		//문자를 숫자로 변환한다.
 		 int num = ch - '0';
 		//합계변수에 누적시킨다.
 		 sum += num ;
 		 
	     
	     //출력한다.
	     System.out.println("입력한 숫자 [ " + sno + " ] 의 각자리의 합은
	     
	     }
	*/
		
}}
