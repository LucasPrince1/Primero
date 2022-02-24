package day03.ex;


/*
  	1년은 365.2426 일이다
  	이것은 과연 몇일 몇시간 몇분 몇초인지를 계산하고 출력하세요.
  	
  	힌트 ]
  		365.2426일은 단위가 일 단위이다.
  		하루는 24시간이다.
  		따라서 0.5일은 12시간을 의미한다.
  		
  		1일 = 24시간
  			= 24*60분 = 1440분
  			= 24*60*60초 = 86400초
  		
 */
import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		double total = 365.2426;
		
		double tmp = total;
		
		double no1 = tmp-tmp%1;
		
		tmp = tmp - no1;
		
		double no2 = ((tmp*24)-(tmp*24%1));   //5.8224시간= 0.2426일
		
		tmp = (tmp*24) - no2;   // tmp = 0.8224시간 0.8224*60=49.344분
		
		double no3 = ((tmp*60)-(tmp*60%1));
		
		tmp = (tmp*60) - no3;
		
		double no4 = ((tmp*60)-(tmp*60%1));
		
		/*tmp = tmp*24; //남은 0.몇일을 시간으로 바꿈
				
		int no2 = tmp;
		
		tmp = tmp*24;
		
		int no3 = tmp;
		
		System.out.println(no1 + " 일");
		
		System.out.println(no2 + " 시간");
		
		System.out.println(no3 + " 분");
		*/
		System.out.println("1년은");
		System.out.println(no1 + " 일");
		System.out.println(no2 + " 시간");
		System.out.println(no3 + " 분");
		System.out.println(no4 + " 초입니다.");
	}
}
