package day04.ex;

/*
 	문제 1 ]
 		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
 		그 수들 중 가장 큰수만 출력하는 프로그램을 작성하세요.
 		
 		단, 3항 연산자를 사용
 		
 		랜덤한 정수
 		int no1 = (int)(Math.random() * (25-1+1) + 1);
 		
 		보너스문제
 		
 		-100 ~ 100 사이의 정수를 랜덤하게 발생시켜보세요
 		
 		int no1 = (int)(Math.random() * (100+100+1) + 100);
 */
public class Ex01 {
	
	public static void main(String[] args) {
	//랜덤한 정수 3개 발생
	int no1 = (int)(Math.random() * (25-1+1) + 1 );
	int no2 = (int)(Math.random() * (25-1+1) + 1 );
	int no3 = (int)(Math.random() * (25-1+1) + 1 );
		
	int result = (no1 > no2) ? (no1) : (no2) ; //판별해서 변수에 담기
	
	int result2 = (no2 > no3) ? (no2) : (no3) ;
	
	/*	선생님
	 int max = (no1 > no2) ? ( 				//no1 > no2 보다 큰 경우
	 			(no1 > no3) ? no1 : no3
	 			) : ( 						//이 괄호는 no2 > no1 보다 큰경우
	 				(no2 > no3) ? no2 : no3
	 			) ;
	 */
	
	//System.out.println(result);
	//System.out.println(result2);
	
	//int final = (result > result2) ? (result) : (result2) ;
	
	int fin = (result > result2) ? (result) : (result2) ;
	
	System.out.println("입력한 세 정수 중 가장 큰 수는 \n\t"
			+fin+ "입니다.");
	
	}
}

/*
 	참고]
 		문자열을 표현할때 문자열 안에 "기호를 출력하는 방법은
 		==> 
 			\" 역슬래시 사용
 			이때 사용한 \를 이스케이프문자라고 부른다.(모든 언어가 마찬가지)
 			
 			많이 사용하는 문자들
 			
 				\"  문자열내에 "를 표현한다.
 				\n  한줄내림 기호
 				\r	캐리지리턴
 				\t	tab 을 표현
 				\b	backspace 를 표현
 	
 	
	1 ~ 25 사이의 정수를 랜덤하게 발생시켜서
	그 숫자가 짝인지 홀인지 판별 출력하세요
	
	참고]
		특정 범위의 랜덤 수 발생시키는 법
		
		Math 클래스내에 0 이상 1 미만 실수를 발생시켜주는 함수
		0<=	Math.random()   <  1   * T
		0 <= Math.random()*T  <  T
		
		
		
형식]

	a ~ b 사이의 랜덤한 정수(b>a)
	
	(int) (Math.random() * (b - a + 1) + a)
	(int) (Math.random() * (큰수 - 작은수 + 1) + 작은수)


*/

