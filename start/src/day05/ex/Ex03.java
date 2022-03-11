package day05.ex;

import java.util.Scanner;

/*
	 문제3]
	 	문자열을 입력받아서
	 	문자를 한글자씩 추출해서 출력하세요.
	 	
	 	참고]
	 		문자열의 길이를 알아내는 방법
	 		
	 		int 변수 = 문자열.length();
	 		
	 		i< str.length()
	 		
	 		문자열에서 문자를 한글자씩  추출하려면
	 		전체 문자열의 길이를 알아내고
	 		그 길이만큼 반복해서 추출해준다.
	 		
	 		할일
	 		1. 문자열 입력받아서 기억하고
	 		2. 입력받은 문자열의 길이 알아내고
	 		3. 길이만큼 반복해서 한글자씩 추출해서 출력해준다.
	 		
	 */
import javax.swing.*;

public class Ex03 {

	public static void main(String[] args) {
		
       String str = JOptionPane.showInputDialog("문자열을 입력하세요 : ");
  
       int len = str.length();
       
       for(int i =0; i<len; i++) {
    	   
    	   char ch = str.charAt(i);    
    	   
    	   //str.charAt() : 문자열에서 몇번째의 문자를 뽑아줌
    	   //참고 ; 문자를 문자열로 변환시키는 방법은
    	   //  문자 + "";
    	   
    	   System.out.println((i+1)+ " 번째 문자 : " + ch);
    	   //공백도 문자(아스키코드값이 있음)
       }
       
	
		
		
		
		
		
	}

}
