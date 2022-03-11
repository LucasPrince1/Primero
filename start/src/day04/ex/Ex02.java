package day04.ex;

/*
 	문2]
 		 문자를 임의로 랜덤하게 입력한 후
 		 그 문자가 대문자이면 소문자로
 		 소문자이면 대문자로 변환하고
 		 만약 특수문자이면 그 문자 그대로 출력하는
 		 프로그램을 작성하세요.
 		 
 		 참고]
 		 	아스키 코드는
 		 	
 		 	특수문자 - 숫자( 0 - 9 ) - 특수문자 - 영문대문자 ( A ~ Z ) - 특수문자 
 		 	- 영문소문자( a ~ z ) - 특수문자
 		 	
 		 	참고]
 		 		문자열에서 문자를 추출하는 방법
 		 		
 		 		문자열.charAt(위치값)
 		 		
 		 	이때 위치값은 0 부터 시작한다.
 		 	
 		 	예]
 		 		"abcd"에서 두번째 문자를 추출하려면
 		 		
 		 		"abcd".charAt(1) ==> 'b'
 		 		
 		'J' -> 'j'
 		
 		(char)('J' + ('a'- 'A'))
 		 		
 */
import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		//String alp ; //입력도구 준비
					//입력메세지 출력
		System.out.print("문자를 입력해주세요 : ");
		
		String alp = sc.nextLine(); //엔터키까지 안 꺼내오려고 line으로함
		
		char ch = alp.charAt(0); //문자열에서 문자 추출하고

		
		char result = (ch < 'A') ? (ch) : ( 
							(ch <= 'Z') ? ((char)(ch + ('a'-'A'))) : 
							(ch < 'a') ? (ch) : (
							(ch <= 'z') ? (char)(ch -('a'-'A')) : ch)
				
				) ; 
		
		/*
		 특수 -  A - Z - 특수 - a - z - 특수
		 */
		System.out.println("입력한 문자 : " + ch);
		System.out.println("변환한 문자 : " + result);
		
		
		
		
	}
	
		
}
