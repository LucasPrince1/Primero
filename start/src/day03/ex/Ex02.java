package day03.ex;


/*
 문제2]
 	하나의 숫자를 입력받은 후(원의 반지름)
 	그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
 	
 	참고 ]
 		원의 넓이 : 반지름 * 반지름 * 3.14
 		원의 둘레 : 2 * 반지름 * 3.14
 */


import java.util.*; //import java.util.Scanner; 도 가능 /Scanner 쓸거란 얘기 , 여러가지는 *
					//적용순서는 *보다는 클래스 이름을 명시하는 방법이 우선적용됨.
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//입력도구 준비
												//입력받기 전에 메세지 출력
												// 입력받는다. 변수에 기억 - 계산하고 - 출력하고
		System.out.print("반지름 : ");
		
	double rad = sc.nextDouble();			// double rad = sc.nextDouble();
	
	
	System.out.println("입력된 반지름 : " + rad );
	
	System.out.println("원의 넓이 : " + ((rad*rad)*3.14));
	System.out.println("원의 둘레 : " + (rad*2*3.14));
	
		
	}
	
	/*
	  참고]
	  	형변환에서 큰 타입의 데이터를 작은 타입으로 변환하면
	  	남는 부분은 버린다.
	 */
	
}
