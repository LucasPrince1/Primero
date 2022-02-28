package ex;

/*
 	3자리 숫자(100 ~ 999)를 입력받아서

 	이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
 	얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
 	
 	예]
 		241 은 200에 가까우므로 41을 빼야한다.
 		777 은 800에 가까우므로 23을 더해야한다.
 		750은 800으로 만든다
 		
 */
import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//입력도구준비
		
		System.out.print("숫자를 입력해주세요 : ");//입력창
		
		int num = sc.nextInt();//입력값 변수에 저장
		
		int no1 ;			//241 41  777 +23 23=100-77 
		
		if (num%100 < 50) {no1 = num-num%100;
		System.out.println(no1 + "을 만들기 위해서는 " + num%100 + "이 필요하다.");
		}
		else { no1 = num + (100-(num%100)) ;
		System.out.println(no1 + "을 만들기 위해서는 " + (100-(num%100)) + "이 필요하다.");}
		
		/*
		 import javax.swing.*;
 		
 		String sno = JOptionPane.showInputDialog("세자리 정수 입력 : ")
 		//입력받은 데이터는 정수형태의 문자열 이므로 정수로 변환해줘야 한다.
 		// 정수형태의 문자열을 정수로 변환해주는 기능을 가지고있는 함수는
 		 * integer.parseInt(문자열)
 		int no = Integer.parseInt(sno);
 		
 		//10단위 이하만 추출해낸다.
 		 int num = no - (no/100 * 100);
 		 int num = no%100;
 		 
 		 //num이 50보다 큰지 판별한다.
 		  int hap = 0;
 		  int result = 0;
 		  
 		 hap = num > 50 ? 100-num  
 		 		: num ;
 		 		
 		 result = num > 50 ? no + hap : no - hap;
 		 ------------------------------------------
 		 result = num > 50 ? (no / 100 + 1) * 100 : (no/100)*100 ;
 		 
 		 String str = num > 50 ? "더해줘야한다. " : " 빼줘야한다.";
 		 
 		 //출력
 		 System.out.println("입력한 정수 " + no + "는" + result + " 에 가까우므로 "
 		 + hap + " 을" + str);
		 */
		
	}
}
