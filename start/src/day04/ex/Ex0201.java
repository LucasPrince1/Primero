package day04.ex;


/*	특수 - A - Z - 특수 - a - z
 	1.알파벳을 입력받아서
 	그 문자가 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.
 	
 	2. 숫자 또는 알파벳을 입력받아서
 	그 문자가 숫자인지 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.
 */

import java.util.*;
public class Ex0201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력도구준비
		
		System.out.print("알파벳을 입력해주세요. : "); //입력메세지 출력	
		
		String alp = sc.nextLine();		//입력변수저장
		
		char ch = alp.charAt(0);		//문자열에서 문자 추출하고
		
		String result = (ch <= 'Z' ) ? (result="대문자") : (result="소문자");
		
		System.out.println(result);
		
		
	
		
		
	}
}
