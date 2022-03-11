package day04.ex;

	/* 1 ~ 25 랜덤수 발생해서
	 * 큰 수  중간수 작은수 순서로 출력
	 * 삼항연산자 사용
	 */
public class Ex0101 {
	public static void main(String[] args) {
		//랜덤한 정수 3개 발생
		int no1 = (int)(Math.random() * (25-1+1)+1);
		int no2 = (int)(Math.random() * (25-1+1)+1);
		int no3 = (int)(Math.random() * (25-1+1)+1);
		
		int result = (no1 > no2) ? (no1) : (no2) ; // 앞에 둘중 큰수
		int result2 = (no2 > no3) ? (no2) : (no3) ; // 뒤에 둘중 큰수
		
		int final1 = (result>result2) ? (result) : (result2) ; //가장 큰수
		int final2 = (result>result2) ? (result2) : (result) ; // 중간수
		 
		int final3 = (result>result2) ? (no3) : (
				(no1>no2) ? (no2) : (no1)
				);
		/*
		int final3 = (result>result2) ? (
							(no1 > no2) ? (no2) : (no1) 
							) : (
								(no2 > no3) ? (no3) : (no2) 	
									) ;
									*/
		
		System.out.println("가장 큰 수 : " + final1 + "\n중간 수 : " + final2 + 
				"\n가장 작은 수 : " + final3);
		// 10 5 22
		/*
		 int result = () ? () : ();
		 
		 */
		
	}
}
