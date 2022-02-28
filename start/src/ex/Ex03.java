package ex;


	/*
	 	문3]
	 		게시물을 게시판에 출력하는데 하나의 페이지에 게시물을 15개를
	 		출력할 예정이다. 게시물 수를 랜덤하게 발생시켜서
	 		게시판의 페이지가 몇 페이지가 필요한지를 계산해서
	 		출력해주는 프로그램을 작성하세요. (랜덤수 150까지)
	 		
	 		참고 ]
	 	    
	 	    게시물이 없는 경우는 게시물이 없는 페이지가 적어도 1페이지는 필요하다.
	 			 0 ~ 15 1 page
	 			16 ~ 30 2 page
	 			31 ~ 45 3 page
	 			
 	
 		# a ~ b 사이의 랜덤한 정수(b>a)
 		
 		(int) (Math.random() * (b - a + 1) + a)
 		(int) (Math.random() * (큰수 - 작은수 + 1) + 작은수)
 		
 		게시물 0 인경우
 		나머지 0 인경우
 			   0 이 아닌 경우
 	
 	    int b = a/15;
  		a 가 0 인경우   			 b 는 1
  		a % 15 가 0인 경우			 b 는 a/15
  		a % 15 가 0 이 아닌경우		 b 는 a/15
	 */
public class Ex03 {
	public static void main(String[] args) {
		
		int a = (int)(Math.random() * (150-0+1)+0);  //a는 150이하의 페이지수
		
		//System.out.println(a); 
		//int b = a/15;
		
		int b = (a == 0) ? (int)(1) : (int)(a/15+1) ;
		
		
		System.out.println(a + "개의 게시물은 " + b + "Page가 필요합니다.");
		}
		
	}



 /*  for (int b =1; b<= 10 ; b++ ) {

if (a <= 15*(b-1)) 
break; 
*/

/*
 
			
  if ( 0<=a<=15) {	b = 1 System.out.println(a + "개의 게시물은 " + b + "Page가 필요합니다.");}
		  else if ( 15<a<=30) {	b = 2 System.out.println(a + "개의 게시물은 " + b + "Page가 필요합니다.");}
		  else if ( 30<a<=45) {	b = 3 System.out.println(a + "개의 게시물은 " + b + "Page가 필요합니다.");}
		  else if ( 45<a<=60) {	b = 4 System.out.println(a + "개의 게시물은 " + b + "Page가 필요합니다.");}
		  else if ( 60<a<=75) {	b = 5 System.out.println(a + "개의 게시물은 " + b + "Page가 필요합니다.");}
		  else if ( 75<a<=90) {	b = 6 System.out.println(a + "개의 게시물은 " + b + "Page가 필요합니다.");}
		  else if ( 90<a<=105) {	b = 7 System.out.println(a + "개의 게시물은 " + b + "Page가 필요합니다.");}
		  else if ( 105<a<=120) {	b = 8 System.out.println(a + "개의 게시물은 " + b + "Page가 필요합니다.");}
		  else if ( 120<a<=135) {	b = 9 System.out.println(a + "개의 게시물은 " + b + "Page가 필요합니다.");}
		  else if ( 135<a<=150) {	b = 10 System.out.println(a + "개의 게시물은 " + b + "Page가 필요합니다.");}
		  
    
  
  
 */
 