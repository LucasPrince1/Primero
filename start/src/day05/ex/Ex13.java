package day05.ex;

/*
	문제 13 ]
		랜덤한 두 수를 입력한 후
		두 수의 최대 공약수를 구하는 프로그램을 작성하세요.
		
		최대 공약수 :
			두 수의 약수중 제일 큰 수.
			두 수를 나눌 수 있는 수중 제일 큰 수
			
		extra ]
			위 문제가 해결되면 최소공배수를 구하는 문제로 풀어보세요.
 */
import java.util.*;
public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 		//입력도구 준비
		
		System.out.print("숫자를 입력하세요 : "); 	//입력메세지
		
		int num1 = sc.nextInt();					//입력값 변수에 기억
		
        System.out.print("숫자를 입력하세요 : ");    //입력메세지
		
		int num2 = sc.nextInt();					//입력값 변수에 기억
		  
		
		/*
		 두 수중 작은 수를 찾는다.
		 int result = 1;
		 
		 int min = (no1<no2) ? no1 : no2;
		 
		 for(int i =min ; i >1 ; i--){
		 	if(no1%i==0 && no2%i==0){
		 		result = i;
		 		break;
		 	
		 	}}
		 System.out.println("두 수의 최대공약수는 " + result + "입니다.");
		 	
		 */
		 
		for(int i=1; i<=num1; i++) {
		 for(int j=1; j<=num2; j++) {
				
		  if(num1%i==0 && num2%j==0 && i==j) {
			
		 System.out.println("두 수의 최대공약수는 " + j + "입니다.");
			}
			}
			
		}
	}

}
