package day05.ex;

/*
	문제 12 ]
		5자리 숫자 하나를 입력받아서 
		이 숫자가 회문수 인지 아닌지 판별하는 프로그램을 작성하세요.
		65165
		참고 ]
			회문수란?
				첫번째 자리수와 마지막 자리수
				두번째 자리수와 마지막에서 두번째 자리수
				...
				가 동일한 수를 말한다.
 */
import java.util.*;
public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("5자리 정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		int no5 = num/10000;
		int no4 = ((num/1000)*1000-no5*10000)/1000;
		int no3 = ((num/100)*100-(num/1000)*1000)/100;
		int no2 = ((num/10)*10-(num/100)*100)/10;
		int no1 = num%10;
		 
		if(no5==no1) {
			System.out.println("회문수입니다.");
		} else if(no4==no2) {
			System.out.println("회문수입니다.");
		} else {
			System.out.println("회문수가 아닙니다.");
			
		}
		}
		
	}

}
