package day05;

/*
	나이를 입력받아서
		유년기
		10대 : 10 ~ 19   ==> age/10*10
		20대 
		30대 
		40대 : 40 ~ 49
		장년층
	으로 구분해서 출력하세요.
*/

import java.util.*;
public class Test05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); //입력도구 준비
		
		//메세지 출력
		System.out.print("나이 입력 : ");
		//입력받아서 변수에 기억
		int age = sc.nextInt();
		//판별해서 결과값 변수에 기억
		//결과값 변수
		String sage = "유년기";
		
		int gen = age / 10 * 10; //변수 새로 만드는것이 스위치를 작성하기 편함
		
		switch (gen) {
		case 0 : 
			sage = "유년기";
			break;
		case 10 :
			sage = "10대";
			break;
		case 20 :
			sage = "20대";
			break;
		case 30 :
			sage = "30대";
			break;
		case 40 :
			sage = "40대";
			break;
		default :
			sage = "장년층";
		}
		
		
		//출력
		System.out.println("입력한 나이 " + age + "는 " + sage + "입니다.");
		
			
	}

}
