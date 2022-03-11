package day05.ex;
/*
문제 7 ]
	5자리의 숫자를 입력한 후
	각자리의 수의 합을 구하는 프로그램을 작성하세요.
*/
import java.util.*;
public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//입력도구준비
		
			
		System.out.print("다섯자리의 숫자를 입력하세요 : ");//입력메세지 출력
		
		
		int num = sc.nextInt();//입력값 변수에 기억
		//뒤 = 
		
		int no5 = num/10000;
		int no4 = ((num/1000)*1000-no5*10000)/1000;
		int no3 = ((num/100)*100-(num/1000)*1000)/100;
		int no2 = ((num/10)*10-(num/100)*100)/10;
		int no1 = num%10;
		
		System.out.println(no1+no2+no3+no4+no5);
		
	}
	

}
