package day03.ex;


/*
 문제2]
 	하나의 숫자를 입력받은 후(원의 반지름)
 	그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
 	
 	참고 ]
 		원의 넓이 : 반지름 * 반지름 * 3.14
 		원의 둘레 : 2 * 반지름 * 3.14
 */


import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		
	double rad = sc.nextDouble();
	
	
	System.out.println("입력된 반지름 : " + rad );
	
	System.out.println("원의 넓이 : " + ((rad*rad)*3.14));
	System.out.println("원의 둘레 : " + (rad*2*3.14));
	
		
	}
	
	
	
}
