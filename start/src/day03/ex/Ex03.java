package day03.ex;


/*
  84232원을 지불하려고 한다.
  우리나라 화폐단위로 이 금액을 지불하려면
  각 단위가 몇 개씩 필요한지 계산해서 출력하세요.
  
  화폐단위
  	50000권
  	10000권
  	5000권
  	1000권
  	500권
  	100
  	50
  	10
  	1
  	
 */import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		
		
		
		int total = 84232;
		
		int tmp = total;
		
		
		int no1 = tmp/50000;
		
		tmp = tmp % 50000;
		
		int no2 = tmp/10000;
		
		tmp = tmp % 10000 ;
		
		int no3 = tmp/5000;
		tmp = tmp % 5000;
		
		int no4 = tmp/1000;
		tmp = tmp %1000;
	
		
		int no5 = tmp/500;
		tmp = tmp % 500;
		
		int no6 = tmp/100;
		tmp = tmp %100;
		
		
		int no7 = tmp/50;
		tmp = tmp %50;
		
		int no8 = tmp/10;
		tmp = tmp%10;
		
		int no9 = tmp/1;
		
		//84232원
		System.out.println("총금액 " + total + "원은");
		
		System.out.println("50000원권 : " + no1 + " 장");
		System.out.println("10000원권 : " + no2 + " 장");
		System.out.println("5000원권 : " + no3 + " 장");
		System.out.println("1000원권 : " + no4 + " 장");
		System.out.println("500원권 : " + no5 + " 장");
		System.out.println("100원권 : " + no6 + " 장");
		System.out.println("50원권 : " + no7 + " 장");
		System.out.println("10원권 : " + no8 + " 장");
		System.out.println("1원권 : " + no9 + " 장");
		
		
		
	}
}
