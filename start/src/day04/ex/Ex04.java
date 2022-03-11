package day04.ex;

/*
 	문4]
 		1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서 
 		이 숫자를 연도로 하는 해는 윤년인지 평년인지를
 		판별해서 출력해주는 프로그램을 작성하세요.
 		
 		윤년 : 4로 나누어 떨어지고 
 			100으로 나누어 떨어지면 제외하고
 			400으로 나누어 떨어지는 해를 다시 포함시키면 윤년이라한다.
 			
 		이 이외에는 모두 평년.
 */
public class Ex04 {
	public static void main(String[] args) {
		
		int a = (int)(Math.random() * (3000-1000+1) +1000);
		
		System.out.println(a + "년은");
		
		if (a%4==0 || a%400==0 && a%100!=0) { 
			//if(a%400==0) {
			//if(a%100!=0) {
				System.out.println("윤년입니다.");
			} 
			//}}
			else {
				System.out.println("평년입니다.");
			}
			
					
	}
}
