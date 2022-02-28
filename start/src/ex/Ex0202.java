package ex;
/*	숫자 - 특수 - A - Z - 특수 - a - z

	1.알파벳을 입력받아서
	그 문자가 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.
	
	2. 숫자 또는 알파벳을 입력받아서
	그 문자가 숫자인지 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.
	참고 ]
	 		문자열에서 문자를 추출하는 방법
	 			
	 			 문자열.charAt(위치값)
	 			 
	 		이때 위치값은 0 부터 시작한다.
	 		
	 		예 ]
	 			"abcd" 에서 두번째 문자를 추출하려면
	 			
	 			"abcd".charAt(1) ==> 'b'
	 			
	 	'J' -> 'j'
	 	==> 
	 	(char)('J' + ('a' - 'A'))
*/
import java.util.*;
public class Ex0202 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력도구 준비
		
		System.out.print("숫자 또는 알파벳을 입력하세요 : ");
		
		String alp = sc.nextLine();	//입력변수저장
		
		char ch = alp.charAt(0); //숫자 - 특수 - A - Z - 특수 - a - z
		
		if(ch<'A') {
			System.out.println("숫자");
		} else if (ch < 'a') {
			System.out.println("대문자");
		} else {
			System.out.println("소문자");
		}
		
		
		
		
		/*
		 String result = (ch < 'A') ? (result = "숫자") : (
						('A' <= ch) ? (result = "대문자") : (result = "소문자")
				
				) ;
		 */
		
		
	}
	
	
}
