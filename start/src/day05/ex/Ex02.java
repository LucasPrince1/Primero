package day05.ex;

/* 특수 - 숫자 - 특 - 대문 - 특 - 소문
 	Ex02]	
 		'A'부터 문자를 10개를 만들어서 출력하세요.
 	
 */
public class Ex02 {

	public static void main(String[] args) {
		//반복문으로 출력하기
		for(int i=0; i<10; i++) {
			
			// 문자들을 형변환
			char no = (char)('A'+i);
			
			//출력
			System.out.print(no + " ");
			
		}
		
		
	}

}
